package com.example.demospringhibernate.magazynierzy.repozytorium;

import com.example.demospringhibernate.magazynierzy.model.Magazynierzy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//extends CrudRepository
@Repository
public interface MagazynierzyRepository extends JpaRepository<Magazynierzy, Integer> {
     @Override
       List<Magazynierzy> findAll();
}

/////// END /////////////////////////

    /*@Query("select m from Magazynierzy m where magazynierzy_nazwisko like %T%")
    public List getByDescriptionLike(String search);*/


    /*@Override
    List<Magazynierzy> findAll();*/






