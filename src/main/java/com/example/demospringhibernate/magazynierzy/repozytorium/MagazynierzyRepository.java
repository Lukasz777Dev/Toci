package com.example.demospringhibernate.magazynierzy.repozytorium;

import com.example.demospringhibernate.magazynierzy.model.Magazynierzy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//extends CrudRepository
@Repository
public interface MagazynierzyRepository extends JpaRepository<Magazynierzy, Integer> {
    String findByNameMagazynier(String nameMagazynier);

}

/////// END /////////////////////////

/*// @Override
   // List<Magazynierzy> listFindByNameMagazynier(String nameMagazynier);*/

    /*@Query("select m from Magazynierzy m where magazynierzy_nazwisko like %T%")
    public List getByDescriptionLike(String search);*/


    /*@Override
    List<Magazynierzy> findAll();*/






