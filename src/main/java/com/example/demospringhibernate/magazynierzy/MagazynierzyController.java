package com.example.demospringhibernate.magazynierzy;

import com.example.demospringhibernate.magazynierzy.model.Magazynierzy;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController //uzywam protokolu HTTP
@RequestMapping(value = "getMagazynier"/*, method = RequestMethod.POST*/) //na cala klase ustawilem, ze
public class MagazynierzyController {
    public Magazynierzy magazynierzy;
    //  private final MagazynierzyService magazynierzyService;
    //private final Magazynierzy magazynierzy;

    List<Magazynierzy> listOfMagazynierzy = new ArrayList<>();

 /*   @Autowired
    public MagazynierzyController(MagazynierzyService magazynierzyService*//*, Magazynierzy magazynierzy*//*) {
        this.magazynierzyService = magazynierzyService;
        // this.magazynierzy = magazynierzy;
    }*/

    ////////////////
    /* @RequestMapping(„/”) – Mówi aplikacji, że żądanie z przeglądarki o stronę „/”, czyli główną stronę będzie obsługiwała właśnie ta metoda.
@ResponseBody – Mówi aplikacji, że metoda zwróci ciało odpowiedzi, to co zostanie zwrócone przez metodę zostanie przesłane do przeglądarki, w tym konkretnym przypadku do przeglądarki zostanie wysłany ciąg znaków: Hello World*/

   /* @PersistenceContext
    EntityManager entityManager;*/

   /* @Transactional
    public String takeMagazynier() {
        Magazynierzy magazynierTaken = new Magazynierzy();
        magazynierTaken = entityManager.merge(magazynierTaken);
        return magazynierTaken.toString();
       // entityManager.find(Magazynierzy.class, 1).toString();
    }*/


    @RequestMapping(/*value = "/getMagazynierFromDB",*/ method = RequestMethod.GET)
    @ResponseBody
    public String showFromDBmagazyniera(Model model) {
        // return magazynierzyService.getMagazynierow();
        model.addAttribute("Magazynierzy", magazynierzy.getMagazynierzyNazwisko());
        return "form";
//       return new ModelAndView("magazynierzyView", "Magazynierzy", new Magazynierzy());
    }

////////////////////


  /*  @GetMapping("/getMagazynier")
    public String getMagazynierzy(Model model) {
        model.getAttribute("getMagazynier", magazynierzy.);
        return "To jest magazynier.";
    }*/

  /*  @PostMapping("/addMagazynierToSubmit")
    public ModelAndView addMagazynierSubmit(*//*@ModelAttribute Magazynierzy magaz, Model model*//*) {
        return new ModelAndView("magazynierView", "getMagazynierToSubmit", new Magazynierzy());
    }*/


}


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



