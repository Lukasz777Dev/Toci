package com.example.demospringhibernate.magazynierzy.model;


// Singleton wzorzec
//
//Kolejny bardzo popularny wzorzec to singleton. Służy on do zapewnienia, że dany obiekt zostanie stworzony tylko raz. Ma to na celu ograniczenie ilości obiektów tworzonych w aplikacji. Często Singleton określany jest anty wzorcem ponieważ łamie on zasady programowania obiektowego (wprowadza globalny stan). A także może znacząco utrudnić testowanie.

public final class SingletonExample {

       /* private static SingletonExample INSTANCE;
        private SingletonExample() {
        }
        public static SingletonExample getInstance() {
            if(INSTANCE == null) {
                INSTANCE = new SingletonExample();
            }
            return INSTANCE;
        }
        // pozostały kod*/
    }


/*Użycie
SingletonExample singleton = SingletonExample.getInstance();
singleton.doSomething();


W inny sposób można zaimplementować singleton korzystając z enuma wtedy to JVM zapewnia nam unikalność tworzonego obiektu (więcej możesz przeczytać w Effective Java – Item 3).
public enum EnumSingleton {
  INSTANCE;
  public EnumSingleton getInstance() {
    return INSTANCE;
  }
  // pozostały kod
}

Mimo, że singleton może sprawiać nam pewne problemy w związku z wadami, o których wspomniałem. To czasem możemy chcieć go zastosować w celu optymalizacji naszej aplikacji. Gdy np. mamy dużo długo żyjących obiektów, których inicjalizacja jest dosyć kosztowna.

Kolejnym przykładem singletonów są beany springowe. Spring Framework tworzy domyślnie beany jako singletony (każdy bean ma tylko jedną instancję). Pomaga to zoptymalizować tworzenie obiektów beanów. Beany tworzone są tylko przy starcie aplikacji. Dzięki czemu Garbage Collector ma dużo mniej pracy.*/




