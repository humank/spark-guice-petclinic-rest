package solid.humank.serverlesslabs.rest;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.jpa.JpaPersistModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import solid.humank.serverlesslabs.model.Owner;
import solid.humank.serverlesslabs.module.ClinicModule;
import solid.humank.serverlesslabs.module.DatabaseModule;
import solid.humank.serverlesslabs.repository.OwnerRepository;

import java.util.Collection;

import static spark.Spark.before;
import static spark.Spark.get;

public class SparkResourceRoute {

    private static final Logger logger = LoggerFactory.getLogger(SparkResourceRoute.class);

    public static void defineResources() {

        logger.info("starting define route");

        Injector injector = Guice.createInjector(new JpaPersistModule("demo"),new ClinicModule());
        injector.getInstance(DatabaseModule.JPAInitializer.class);

        //通過這裡來配置 rest controller routing

        OwnerRestController ownerRestController = injector.getInstance(OwnerRestController.class);

        //@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
        get("/owners", (req, res) -> {

            Collection<Owner> owners = ownerRestController.getOwners(() -> res.status(404));
            res.status(200);

            return owners;
        }, new JsonTransformer());

    }
}
