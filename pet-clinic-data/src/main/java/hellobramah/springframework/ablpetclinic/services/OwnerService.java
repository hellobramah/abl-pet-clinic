package hellobramah.springframework.ablpetclinic.services;

import hellobramah.springframework.ablpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
