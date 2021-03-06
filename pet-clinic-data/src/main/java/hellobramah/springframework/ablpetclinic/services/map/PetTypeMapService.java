package hellobramah.springframework.ablpetclinic.services.map;

import hellobramah.springframework.ablpetclinic.model.PetType;
import hellobramah.springframework.ablpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public PetType save(PetType object) {
       return super.save(object);
    }

    @Override
    public void delete(PetType object) {
super.delete(object);
    }

    @Override
    public PetType findById(Long id) {
        return findById(id);
    }
}
