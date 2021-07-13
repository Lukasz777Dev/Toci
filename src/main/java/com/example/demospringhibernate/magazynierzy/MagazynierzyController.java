package com.example.demospringhibernate.magazynierzy;

import com.example.demospringhibernate.magazynierzy.model.Magazynierzy;
import com.example.demospringhibernate.magazynierzy.repozytorium.MagazynierzyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController // Uzycie protokolu HTTP.
@RequestMapping(value = "/magazynier"   /*, method = RequestMethod.POST*/) //na cala klase ustawilem
public class MagazynierzyController {
    @Autowired
    private Magazynierzy magazynierzy;

    @Autowired
    private MagazynierzyRepository magazynierzyRepository;

    @Autowired
    private final MagazynierzyService magazynierzyService;

    public MagazynierzyController(MagazynierzyService magazynierzyService) {
        this.magazynierzyService = magazynierzyService;
    }


    @GetMapping(value = "/getMagazynierFromDB")
    @ResponseBody
    // @GetMapping(produces = "application/HTML")  //bylo application/json
     @ModelAttribute(name = "magazynierzy_nazwisko")
  /*  public String findByNameMagazynier(Model model) {
        return model.getAttribute(magazynierzy.getMagazynierzyNazwisko()).toString();
    }*/

    public String findByNameMagazynier(){
        return magazynierzy.getMagazynierzyNazwisko();
    }

     //   (magazynierzy.getMagazynierzyId(), magazynierzy.getMagazynierzyNazwisko(), magazynierzy.getMagazynierzyNr());



    @PostMapping(value = "/postMagazynierToDB")
    // @ResponseBody
    public ResponseEntity<Magazynierzy> putMagazynierBySimplePath() {
        return new ResponseEntity<Magazynierzy>(new Magazynierzy("Stasiowy", "0009"), HttpStatus.OK);
    }



  /*  @RequestMapping(name = "/putInMagazynier", method = RequestMethod.POST)
    @ResponseBody
    public String putInDBmagazynier() {
        StringBuilder response = new StringBuilder();
        magazynierzy = new Magazynierzy();
        *//* mag.setMagazynierzyId(); *//*
        magazynierzy.setMagazynierzyNr("0001");
        magazynierzy.setMagazynierzyNazwisko("Dziubek");
        magazynierzyRepository.save(magazynierzy);
        for (Magazynierzy m : magazynierzyRepository.findAll()) {
            response.append(m).append("<br>");
        }
        return response.toString();
    }*/


    public Magazynierzy getMagazynierzy() {
        return magazynierzy;
    }

    public void setMagazynierzy(Magazynierzy magazynierzy) {
        this.magazynierzy = magazynierzy;
    }

    public MagazynierzyRepository getMagazynierzyRepository() {
        return magazynierzyRepository;
    }

    public void setMagazynierzyRepository(MagazynierzyRepository magazynierzyRepository) {
        this.magazynierzyRepository = magazynierzyRepository;
    }

   /* public List<Magazynierzy> getListOfMagazynierzy() {
        return listOfMagazynierzy;
    }

    public void setListOfMagazynierzy(List<Magazynierzy> listOfMagazynierzy) {
        this.listOfMagazynierzy = listOfMagazynierzy;
    }*/


}
/////////////// END /////////////////
/* List<Magazynierzy> listOfMagazynierzy = new ArrayList<>();*/


/* @GetMapping("/addMagazynier")
    public String addMagazynier(Model model) {
        model.addAttribute("addMagazynier", new Magazynierzy());
        return "addMagazynier";
    }
    @PostMapping("/addMagazynier")
    public String addMagazynierSubmit(@ModelAttribute Magazynierzy magaz, Model model) {
        model.addAttribute("addMagazynier", magaz);
        return "result";
    }*/



  /* @RequestMapping(„/”) – Mówi aplikacji, że żądanie z przeglądarki o stronę „/”, czyli główną stronę będzie obsługiwała właśnie ta metoda.
@ResponseBody – Mówi aplikacji, że metoda zwróci ciało odpowiedzi, to co zostanie zwrócone przez metodę zostanie przesłane do przeglądarki, w tym konkretnym przypadku do przeglądarki zostanie wysłany ciąg znaków: Hello World*/


 /*@Autowired
    public MagazynierzyController(MagazynierzyService magazynierzyService, Magazynierzy magazynierzy) {
        this.magazynierzyService = magazynierzyService;
        // this.magazynierzy = magazynierzy;
    }*/

//  private final MagazynierzyService magazynierzyService;
//private final Magazynierzy magazynierzy;

// return magazynierzyService.getMagazynierow();
       /* model.addAttribute("Magazynierzy",new Magazynierzy(magazynierzy.getMagazynierzyId(),magazynierzy.getMagazynierzyNazwisko(),magazynierzy.getMagazynierzyNr("0001")));
        return "magazynierzy_nazwisko";*/
//       return new ModelAndView("magazynierzyView", "Magazynierzy", new Magazynierzy());




/*  @RequestMapping(*//*value = "/getMagazynierFromDB",*//* method = RequestMethod.GET)
    @ResponseBody
    public String showFromDBmagazyniera(Model model) {
        // return magazynierzyService.getMagazynierow();
        model.addAttribute("Magazynierzy",new Magazynierzy(magazynierzy.getMagazynierzyId(),magazynierzy.getMagazynierzyNazwisko(),magazynierzy.getMagazynierzyNr()));
        return "magazynierzy_nazwisko";
//       return new ModelAndView("magazynierzyView", "Magazynierzy", new Magazynierzy());
    }*/

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



