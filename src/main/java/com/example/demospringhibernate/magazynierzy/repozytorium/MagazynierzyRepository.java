package com.example.demospringhibernate.magazynierzy.repozytorium;


import com.example.demospringhibernate.magazynierzy.Magazynierzy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository
public interface MagazynierzyRepository extends JpaRepository<Magazynierzy,Integer> {

     List<Magazynierzy> findAll();

}
