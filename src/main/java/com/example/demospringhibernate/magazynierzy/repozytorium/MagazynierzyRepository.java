package com.example.demospringhibernate.magazynierzy.repozytorium;

import com.example.demospringhibernate.magazynierzy.model.Magazynierzy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//extends CrudRepository
@Repository
public interface MagazynierzyRepository extends JpaRepository<Magazynierzy, Integer> {
   //  @Override
    String findByNameMagazynier(String nameMagazynier);
}

/////// END /////////////////////////

    /*@Query("select m from Magazynierzy m where magazynierzy_nazwisko like %T%")
    public List getByDescriptionLike(String search);*/


    /*@Override
    List<Magazynierzy> findAll();*/






