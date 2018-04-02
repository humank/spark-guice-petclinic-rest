/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package solid.humank.serverlesslabs.service;

import solid.humank.serverlesslabs.model.*;

import java.util.Collection;


/**
 * Mostly used as a facade so all controllers have a single point of entry
 *
 * @author Michael Isvy
 * @author Vitaliy Fedoriv
 */
public interface ClinicService {

	Pet findPetById(int id) ;
	Collection<Pet> findAllPets() ;
	void savePet(Pet pet) ;
	void deletePet(Pet pet) ;

	Collection<Visit> findVisitsByPetId(int petId);
	Visit findVisitById(int visitId) ;
	Collection<Visit> findAllVisits() ;
	void saveVisit(Visit visit) ;
	void deleteVisit(Visit visit) ;

	Vet findVetById(int id) ;
	Collection<Vet> findVets() ;
	Collection<Vet> findAllVets() ;
	void saveVet(Vet vet) ;
	void deleteVet(Vet vet) ;

	Owner findOwnerById(int id) ;
	Collection<Owner> findAllOwners() ;
	void saveOwner(Owner owner) ;
	void deleteOwner(Owner owner) ;
	Collection<Owner> findOwnerByLastName(String lastName) ;

	PetType findPetTypeById(int petTypeId);
	Collection<PetType> findAllPetTypes() ;
	Collection<PetType> findPetTypes() ;
	void savePetType(PetType petType) ;
	void deletePetType(PetType petType) ;

	Specialty findSpecialtyById(int specialtyId);
	Collection<Specialty> findAllSpecialties() ;
	void saveSpecialty(Specialty specialty) ;
	void deleteSpecialty(Specialty specialty) ;

}
