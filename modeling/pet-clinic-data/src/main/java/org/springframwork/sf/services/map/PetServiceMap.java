package org.springframwork.sf.services.map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframwork.sf.model.Pet;
import org.springframwork.sf.model.Vet;
import org.springframwork.sf.services.CrudService;
import org.springframwork.sf.services.PetService;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.findById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
