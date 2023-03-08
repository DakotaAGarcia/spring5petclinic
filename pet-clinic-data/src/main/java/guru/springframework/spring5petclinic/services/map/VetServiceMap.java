package guru.springframework.spring5petclinic.services.map;


import guru.springframework.spring5petclinic.model.Specialty;
import guru.springframework.spring5petclinic.model.Vet;
import guru.springframework.spring5petclinic.services.CrudService;
import guru.springframework.spring5petclinic.services.SpecialtyService;
import guru.springframework.spring5petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

    private final SpecialtyService specialityService;

    public VetServiceMap(SpecialtyService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
        public Set<Vet> findAll() {
        return super.findAll();
    }

        @Override
        public Vet findById(Long id) {
        return super.findById(id);
    }

        @Override
        public Vet save(Vet object) {

            if(object.getSpecialities().size() > 0){
                object.getSpecialities().forEach(specialty -> {
                    if(specialty.getId() == null){
                        Specialty savedSpecialty = specialityService.save(specialty);
                        specialty.setId(savedSpecialty.getId());
                    }
                });
            }

        return super.save(object);
    }

        @Override
        public void delete(Vet object) {
        super.delete(object);
    }

        @Override
        public void deleteById(Long id) {
        super.deleteById(id);
    }
}
