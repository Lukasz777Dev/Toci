package com.example.demospringhibernate.magazynierzy.repozytorium;


import com.example.demospringhibernate.magazynierzy.Magazynierzy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MagazynierzyRepository extends CrudRepository<Magazynierzy, Integer> {
    List<Magazynierzy> findAll();
}
