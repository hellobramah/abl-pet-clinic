package hellobramah.springframework.ablpetclinic.services.map;

import hellobramah.springframework.ablpetclinic.model.Speciality;
import hellobramah.springframework.ablpetclinic.services.SpecialitiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialitiesMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll()  {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }

    @Override
    public Speciality save(Speciality speciality)  {
        return super.save(speciality);
    }

    @Override
    public Speciality findById(Long id)  {
        return super.findById(id);
    }
}
