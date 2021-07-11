package com.example.demospringhibernate.magazynierzy;

import com.example.demospringhibernate.magazynierzy.model.Magazynierzy;
import com.example.demospringhibernate.magazynierzy.repozytorium.MagazynierzyRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
   public class MagazynierzyService {
   MagazynierzyRepository magazynierzyRepository;

  public MagazynierzyService(MagazynierzyRepository magazynierzyRepository){
     this.magazynierzyRepository=magazynierzyRepository;
  }
// ???
    @PersistenceContext
    EntityManager entityManager;
// ???
    @Transactional
    public String takeMagazynier() {
        Magazynierzy magazynierTaken = new Magazynierzy();
        magazynierTaken = entityManager.merge(magazynierTaken);
        entityManager.find(Magazynierzy.class, 1).toString();
        return magazynierTaken.toString();
    }

  // Magazynierzy mag =  magazynierzyRepository.findById(1);
}
////////////// END ////////////////////////////////
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



