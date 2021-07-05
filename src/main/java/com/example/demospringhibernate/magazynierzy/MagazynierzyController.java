package com.example.demospringhibernate.magazynierzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController //uzywam protokolu HTTP
@RequestMapping(path = "api/magazynierzy", method = RequestMethod.POST) //na cala klase ustawilem, ze
public class MagazynierzyController {
    private final MagazynierzyService magazynierzyService;
    private final Magazynierzy magazynierzy;

    @Autowired
    public MagazynierzyController(MagazynierzyService magazynierzyService, Magazynierzy magazynierzy) {
        this.magazynierzyService = magazynierzyService;
        this.magazynierzy = magazynierzy;
    }


    @GetMapping("/getMagazynier")
    public String getMagazynierzy(Model model) {
        model.getAttribute("getMagazynier", magazynierzy. );
        return "To jest magazynier.";
    }

    @PostMapping("/addMagazynierToSubmit")
    public ModelAndView addMagazynierSubmit(/*@ModelAttribute Magazynierzy magaz, Model model*/) {
        return new ModelAndView("magazynierView", "getMagazynierToSubmit", new Magazynierzy());
    }

    ////////////////
    @RequestMapping(value = "/getMagazynierFromDB", method = RequestMethod.GET)
    public ModelAndView showFormMain() {
        return new ModelAndView("magazynierzyView", "magazynierzyViewModel", new Magazynierzy());
    }
////////////////////



  /*  @RequestMapping(value = "/addMagazynier", method = RequestMethod.POST)
    public String submit(*//*@Valid*//* @ModelAttribute("magazynierzy"), Magazynierzy magazynierzy, BindingResult result, ModelMap modelMap){
       modelMap.addAttribute("name", magazynierzy.getMagazynierzyNazwisko());
       modelMap.addAttribute("number",magazynierzy.getMagazynierzyNr());

        return "magazynierzyView";
    }*/



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

