package hellobramah.springframework.ablpetclinic.model;

import java.time.LocalDate;
import java.util.Set;

public class Owner extends Person
{
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
    private Set<Pet> pets;

    public Set<Pet> getPet() {
        return pets;
    }

    public void setPet(Set<Pet> pets) {
        this.pets = pets;
    }
}
