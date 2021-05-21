package hellobramah.springframework.ablpetclinic.Model;

import java.time.LocalDate;

public class Owner extends Person{
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
