package hellobramah.springframework.ablpetclinic.bootstrap;

import hellobramah.springframework.ablpetclinic.model.*;
import hellobramah.springframework.ablpetclinic.services.OwnerService;
import hellobramah.springframework.ablpetclinic.services.PetTypeService;
import hellobramah.springframework.ablpetclinic.services.SpecialityService;
import hellobramah.springframework.ablpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;


    @Autowired

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
                      SpecialityService specialityService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }


    }

    private void loadData() {
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

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);


        owner1.setFirstName("Jet");
        owner1.setLastName("Li");
        owner1.setAddress("15, Snapphanevagen");
        owner1.setCity("Karlskrona");
        owner1.setTelephone("+46557595400");
        ownerService.save(owner1);

        Pet JetsPet = new Pet();
        JetsPet.setPetType(saveDogPetType);
        JetsPet.setOwner(owner1);
        JetsPet.setBirthDate(LocalDate.now());
        JetsPet.setName("Pip");
        owner1.getPets().add(JetsPet);


        owner2.setFirstName("Jackie");
        owner2.setLastName("Chan");
        owner2.setAddress("D33 Parrot Close");
        owner2.setCity("Tema");
        owner2.setTelephone("+233557595400");
        ownerService.save(owner2);

        Pet JackiesPet = new Pet();
        JackiesPet.setPetType(saveCatPetType);
        JackiesPet.setOwner(owner2);
        JackiesPet.setBirthDate(LocalDate.now());
        JackiesPet.setName("Mister");
        owner2.getPets().add(JackiesPet);

        System.out.println("Loading Owners.....");


        vet1.setFirstName("Arnold");
        vet1.setLastName("schwarzenegger");
        vet1.getSpecialties().add(radiology);
        vetService.save(vet1);


        vet2.setFirstName("Jean-Claude");
        vet2.setLastName("Van Damme");
        vet2.getSpecialties().add(dentistry);
        vetService.save(vet2);

        System.out.println("Loading Vets.....");
    }
}
