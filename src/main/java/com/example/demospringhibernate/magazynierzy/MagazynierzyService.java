package com.example.demospringhibernate.magazynierzy;

import com.example.demospringhibernate.magazynierzy.model.Magazynierzy;
import com.example.demospringhibernate.magazynierzy.repozytorium.MagazynierzyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Service
public class MagazynierzyService {
    @Autowired
    private MagazynierzyRepository magazynierzyRepository;
    @Autowired
    private Magazynierzy magazynierzy;

    public void setMagazynierzy(Magazynierzy magazynierzy) {
        this.magazynierzy = magazynierzy;
    }

    public MagazynierzyService(MagazynierzyRepository magazynierzyRepository) {
        this.magazynierzyRepository = magazynierzyRepository;
    }

    @Autowired
    public List<Magazynierzy> getMagazynierzy() {
        return magazynierzyRepository.findAll();
    }

     public String findByNameMagazynier(String nameMagazynier){
        return magazynierzy.getMagazynierzyNazwisko();
    }




    // ???
    @PersistenceContext
    EntityManager entityManager;

    // ???
    @Transactional
    public String takeMagazynier() {
      //  Magazynierzy magazynierTaken = new Magazynierzy();
      //  magazynierTaken = entityManager.merge(magazynierzy);

          magazynierzy=  entityManager.merge(magazynierzy);
       // entityManager.find(Magazynierzy.class, 1).toString();
        return magazynierzy.toString();
    }

}

////////////// END ////////////////////////////////

// Magazynierzy mag =  magazynierzyRepository.findById(1);

 /* public List<Magazynierzy> listOfMagazynierzy;


    @Autowired
    private MagazynierzyRepository magazynierzyRepository;

    public MagazynierzyService(MagazynierzyRepository magazynierzyRepository) {
        this.magazynierzyRepository = magazynierzyRepository;
    }

    public List<Magazynierzy> getMagazynierow() {
        return magazynierzyRepository.findAll();
    }*/

       /* return List.of(){
          1, new Magazynierzy(magazynierzyRepository, "magazynierzyNazwisko", "magazynierzyNr np 7", "kupcyNazwa");
         }*/




/* 1, "magazynierzyNazwisko", "magazynierzyNr np 7", "kupcyNazwa"*/
//    )
// );



