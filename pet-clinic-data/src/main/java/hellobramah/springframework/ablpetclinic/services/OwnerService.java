package hellobramah.springframework.ablpetclinic.services;

import hellobramah.springframework.ablpetclinic.Model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(long Id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
