package solid.humank.serverlesslabs.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import solid.humank.serverlesslabs.repository.*;
import solid.humank.serverlesslabs.repository.jpa.*;
import solid.humank.serverlesslabs.service.ClinicService;
import solid.humank.serverlesslabs.service.ClinicServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClinicModule extends AbstractModule {

    @Override
    protected void configure(){
        /**
         *
         private PetRepository petRepository;
         private VetRepository vetRepository;
         private OwnerRepository ownerRepository;
         private VisitRepository visitRepository;
         private SpecialtyRepository specialtyRepository;
         private PetTypeRepository petTypeRepository;

         */

        bind(OwnerRepository.class).to(JpaOwnerRepositoryImpl.class);

        bind(PetRepository.class).to(JpaPetRepositoryImpl.class);
        bind(VetRepository.class).to(JpaVetRepositoryImpl.class);

        bind(VisitRepository.class).to(JpaVisitRepositoryImpl.class);
        bind(SpecialtyRepository.class).to(JpaSpecialtyRepositoryImpl.class);
        bind(PetTypeRepository.class).to(JpaPetTypeRepositoryImpl.class);

        bind(ClinicService.class).to(ClinicServiceImpl.class);

    }
}
