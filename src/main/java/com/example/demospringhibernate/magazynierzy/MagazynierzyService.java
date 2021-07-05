package com.example.demospringhibernate.magazynierzy;

import com.example.demospringhibernate.magazynierzy.repozytorium.MagazynierzyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagazynierzyService {

     @Autowired
    private MagazynierzyRepository magazynierzyRepository;

    public List<Magazynierzy> getMagazynierzy() {
        //   return magazynierzyRepository.findAll();



      return List.of();
             //   new Magazynierzy(magazynierzyRepository , "magazynierzyNazwisko", "magazynierzyNr np 7", "kupcyNazwa");*/

    }
}

    /* 1, "magazynierzyNazwisko", "magazynierzyNr np 7", "kupcyNazwa"*/
    //    )
    // );



