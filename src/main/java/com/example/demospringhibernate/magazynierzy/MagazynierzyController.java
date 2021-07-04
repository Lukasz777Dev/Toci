package com.example.demospringhibernate.magazynierzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //uzywam protokolu HTTP
@RequestMapping(path = "api/magazynierzy") //na cala klase ustawilem, ze
public class MagazynierzyController {

    private final MagazynierzyService magazynierzyService;

    @Autowired
    public MagazynierzyController(MagazynierzyService magazynierzyService) {
        this.magazynierzyService = magazynierzyService;
    }

    @GetMapping(produces = "application/HTML")  //bylo application/json
    @ModelAttribute(name = "magazynierzy_nazwisko")
    public List<Magazynierzy> getMagazynierzy() {
        return magazynierzyService.getMagazynierzy();
    }

    @GetMapping(path = "/create")
    public List<Magazynierzy> createMagazynierzy(){
        return magazynierzyService.getMagazynierzy();
    }


}

