package com.example.demospringhibernate.magazynierzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController //uzywam protokolu HTTP
@RequestMapping(path = "api/magazynierzy") //na cala klase ustawilem, ze

public class MagazynierzyController {
    private final MagazynierzyService magazynierzyService;

    @GetMapping("/addMagazynier")
    public String addMagazynier(Model model) {
        model.addAttribute("addMagazynier", new Magazynierzy());
        return "addMagazynier";
    }

       @PostMapping("/addMagazynier")
    public String addMagazynierSubmit(@ModelAttribute Magazynierzy magaz, Model model) {
        model.addAttribute("addMagazynier", magaz);
        return "result";
    }


   /* @RequestMapping(value = "/magazynier.html", method = RequestMethod.GET)
    public ModelAndView showFormMain(){
        return new ModelAndView("magazynierzyView", "magazynierzy", new Magazynierzy());
    }*/

  /*  @RequestMapping(value = "/addMagazynier", method = RequestMethod.POST)
    public String submit(*//*@Valid*//* @ModelAttribute("magazynierzy"), Magazynierzy magazynierzy, BindingResult result, ModelMap modelMap){
       modelMap.addAttribute("name", magazynierzy.getMagazynierzyNazwisko());
       modelMap.addAttribute("number",magazynierzy.getMagazynierzyNr());

        return "magazynierzyView";
    }*/

    @Autowired
    public MagazynierzyController(MagazynierzyService magazynierzyService) {
        this.magazynierzyService = magazynierzyService;
    }

   /* @GetMapping(produces = "application/HTML")  //bylo application/json
    @ModelAttribute(name = "magazynierzy_nazwisko")
    public List<Magazynierzy> getMagazynierzy() {
        return magazynierzyService.getMagazynierzy();
    }

    @GetMapping(path = "/create")
    public List<Magazynierzy> createMagazynierzy(){
        return magazynierzyService.getMagazynierzy();
    }
*/

}

