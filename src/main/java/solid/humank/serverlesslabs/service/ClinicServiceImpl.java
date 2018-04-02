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

import com.google.inject.Inject;
import solid.humank.serverlesslabs.model.*;
import solid.humank.serverlesslabs.repository.*;

import java.util.Collection;

/**
 * Mostly used as a facade for all Petclinic controllers
 * Also a placeholder for  and @Cacheable annotations
 *
 * @author Michael Isvy
 * @author Vitaliy Fedoriv
 */

public class ClinicServiceImpl implements ClinicService {

    private PetRepository petRepository;
    private VetRepository vetRepository;
    private OwnerRepository ownerRepository;
    private VisitRepository visitRepository;
    private SpecialtyRepository specialtyRepository;
    private PetTypeRepository petTypeRepository;


    @Inject
    public ClinicServiceImpl(
        PetRepository petRepository,
        VetRepository vetRepository,
        OwnerRepository ownerRepository,
        VisitRepository visitRepository,
        SpecialtyRepository specialtyRepository,
        PetTypeRepository petTypeRepository) {
        this.petRepository = petRepository;
        this.vetRepository = vetRepository;
        this.ownerRepository = ownerRepository;
        this.visitRepository = visitRepository;
        this.specialtyRepository = specialtyRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Collection<Pet> findAllPets() {
        return petRepository.findAll();
    }

    @Override
    public void deletePet(Pet pet) {
        petRepository.delete(pet);
    }

    @Override
    public Visit findVisitById(int visitId) {
        Visit visit = null;
        visit = visitRepository.findById(visitId);
        return visit;
    }

    @Override
    public Collection<Visit> findAllVisits() {
        return visitRepository.findAll();
    }

    @Override
    public void deleteVisit(Visit visit) {
        visitRepository.delete(visit);
    }

    @Override
    public Vet findVetById(int id) {
        Vet vet = null;
        vet = vetRepository.findById(id);
        return vet;
    }

    @Override
    public Collection<Vet> findAllVets() {
        return vetRepository.findAll();
    }

    @Override
    public void saveVet(Vet vet) {
        vetRepository.save(vet);
    }

    @Override
    public void deleteVet(Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public Collection<Owner> findAllOwners() {
        return ownerRepository.findAll();
    }

    @Override
    public void deleteOwner(Owner owner) {
        ownerRepository.delete(owner);
    }

    @Override
    public PetType findPetTypeById(int petTypeId) {
        PetType petType = null;
        petType = petTypeRepository.findById(petTypeId);
        return petType;
    }

    @Override
    public Collection<PetType> findAllPetTypes() {
        return petTypeRepository.findAll();
    }

    @Override
    public void savePetType(PetType petType) {
        petTypeRepository.save(petType);
    }

    @Override
    public void deletePetType(PetType petType) {
        petTypeRepository.delete(petType);
    }

    @Override
    public Specialty findSpecialtyById(int specialtyId) {
        Specialty specialty = null;
        specialty = specialtyRepository.findById(specialtyId);
        return specialty;
    }

    @Override
    public Collection<Specialty> findAllSpecialties() {
        return specialtyRepository.findAll();
    }

    @Override
    public void saveSpecialty(Specialty specialty) {
        specialtyRepository.save(specialty);
    }

    @Override
    public void deleteSpecialty(Specialty specialty) {
        specialtyRepository.delete(specialty);
    }

    @Override
    public Collection<PetType> findPetTypes() {
        return petRepository.findPetTypes();
    }

    @Override
    public Owner findOwnerById(int id) {
        Owner owner = null;
        owner = ownerRepository.findById(id);
        return owner;
    }

    @Override
    public Pet findPetById(int id) {
        Pet pet = null;
        pet = petRepository.findById(id);
        return pet;
    }

    @Override
    public void savePet(Pet pet) {
        petRepository.save(pet);

    }

    @Override
    public void saveVisit(Visit visit) {
        visitRepository.save(visit);

    }

    @Override
    //@Cacheable(value = "vets")
    public Collection<Vet> findVets() {
        return vetRepository.findAll();
    }

    @Override
    public void saveOwner(Owner owner) {
        ownerRepository.save(owner);

    }

    @Override
    public Collection<Owner> findOwnerByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Collection<Visit> findVisitsByPetId(int petId) {
        return visitRepository.findByPetId(petId);
    }


}
