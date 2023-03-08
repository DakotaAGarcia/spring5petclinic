package guru.springframework.spring5petclinic.services;

import guru.springframework.spring5petclinic.model.Owner;



public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
