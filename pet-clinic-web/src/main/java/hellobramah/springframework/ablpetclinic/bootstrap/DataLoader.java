package hellobramah.springframework.ablpetclinic.bootstrap;

import hellobramah.springframework.ablpetclinic.model.Owner;
import hellobramah.springframework.ablpetclinic.model.PetType;
import hellobramah.springframework.ablpetclinic.model.Vet;
import hellobramah.springframework.ablpetclinic.services.OwnerService;
import hellobramah.springframework.ablpetclinic.services.PetTypeService;
import hellobramah.springframework.ablpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        Owner owner2 = new Owner();
        Vet vet1 = new Vet();
        Vet vet2 = new Vet();


        owner1.setFirstName("Jet");
        owner1.setLastName("Li");
        ownerService.save(owner1);


        owner2.setFirstName("Jackie");
        owner2.setLastName("Chan");
        ownerService.save(owner2);

        System.out.println("Loading Owners.....");


        vet1.setFirstName("Arnold");
        vet1.setLastName("schwarzenegger");
        vetService.save(vet1);


        vet2.setFirstName("Jean-Claude");
        vet2.setLastName("Van Damme");
        vetService.save(vet2);

        System.out.println("Loading Vets.....");



    }
}
