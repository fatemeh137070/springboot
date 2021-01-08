package org.springframwork.sf.services.map;

import org.springframework.stereotype.Service;
import org.springframwork.sf.model.Pet;
import org.springframwork.sf.model.Vet;
import org.springframwork.sf.services.CrudService;
import org.springframwork.sf.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {


    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.findById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

}
