package hellobramah.springframework.ablpetclinic.services.map;

import hellobramah.springframework.ablpetclinic.model.Owner;
import hellobramah.springframework.ablpetclinic.model.Pet;
import hellobramah.springframework.ablpetclinic.services.OwnerService;
import hellobramah.springframework.ablpetclinic.services.PetService;
import hellobramah.springframework.ablpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);

    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        if (owner!=null) {
            if(owner.getPets()!=null){
                owner.getPets().forEach(pet -> {
                    if(pet.getPetType()!=null){
                        if(pet.getPetType().getId()==null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }

                    }else{
                        throw new RuntimeException("Pet Type is required");
                    }
                    if (pet.getId()==null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }

            return super.save(owner);
        }else{
            return null;
                   }
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
