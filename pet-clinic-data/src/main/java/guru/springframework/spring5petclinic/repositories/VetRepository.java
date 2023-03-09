package guru.springframework.spring5petclinic.repositories;

import guru.springframework.spring5petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
