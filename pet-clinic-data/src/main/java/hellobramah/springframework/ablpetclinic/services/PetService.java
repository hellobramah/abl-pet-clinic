package hellobramah.springframework.ablpetclinic.services;

import hellobramah.springframework.ablpetclinic.Model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(long Id);
    Pet save(Pet pet);
    Set<Pet> findAll();

}
