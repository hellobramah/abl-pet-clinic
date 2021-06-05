package hellobramah.springframework.ablpetclinic.services;

import hellobramah.springframework.ablpetclinic.Model.*;

import java.util.Set;

public interface VetService {
    Vet findById(long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
