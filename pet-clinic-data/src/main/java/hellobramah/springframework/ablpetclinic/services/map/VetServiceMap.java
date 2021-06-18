package hellobramah.springframework.ablpetclinic.services.map;

import hellobramah.springframework.ablpetclinic.model.Speciality;
import hellobramah.springframework.ablpetclinic.model.Vet;
import hellobramah.springframework.ablpetclinic.services.SpecialityService;
import hellobramah.springframework.ablpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);

    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        if (vet.getSpecialties().size()>0){
            vet.getSpecialties().forEach(speciality -> {
                if(speciality.getId()==null){
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }

            });
        }
        return super.save(vet);
    }
}
