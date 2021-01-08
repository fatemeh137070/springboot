package org.springframwork.sf.bootstarap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframwork.sf.model.Owner;
import org.springframwork.sf.model.Vet;
import org.springframwork.sf.services.OwnerService;
import org.springframwork.sf.services.VetService;
import org.springframwork.sf.services.map.OwnerServiceMap;
import org.springframwork.sf.services.map.VetServiceMap;


@Component
public class DateLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private final VetService vetService;


    public DateLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

   /* public DateLoader() {
        ownerService=new OwnerServiceMap();
        vetService=new VetServiceMap();

    }*/

    @Override
    public void run(String... args) throws Exception {

        Owner owner1=new Owner();
        owner1.setFirst_name("fatemeh");
        owner1.setLast_name("yaghoubi");
        ownerService.save(owner1);


        Owner owner2=new Owner();
        owner2.setFirst_name("zahara");
        owner2.setLast_name("yaghoubi");
        ownerService.save(owner2);

        Owner owner3=new Owner();
        owner3.setFirst_name("saeed");
        owner3.setLast_name("yaghoubi");
        ownerService.save(owner3);

        System.out.println("Loader owners");


        Vet vet1=new Vet();
        vet1.setFirst_name("zahra ");
        vet1.setLast_name("amirii");
        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirst_name("zahra ");
        vet2.setLast_name("yaghoubi");
        vetService.save(vet2);
        System.out.println("Loader vets ");


    }
}
