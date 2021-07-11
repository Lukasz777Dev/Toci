package com.example.demospringhibernate.magazynierzy.model;


// Factory -  Wzorzec ten można spotkać pod dwiema postaciami fabryka abstrakcyjna (abstract factory) i metoda wytwórcza (factory method). W obu przypadkach koncepcja jest taka sama, różnica polega na tym, że w pierwszym przypadku dzięki abstrakcji możemy wytworzyć obiekt dowolnego typu. Natomiast w drugim tworzymy zwykle obiekt konkretnego typu.

public class CarFactoryExample {

   /*     public CarFactoryExample createCarWithDieselEngine(float capacity) {
            return new CarFactoryExample(*//*new DieselEngine(capacity)*//*);
        }
        public CarFactoryExample createCarWithPetrolEngine(float capacity) {
            return new CarFactoryExample(*//*new PetrolEngine(capacity)*//*);
        }*/
    }

// Użycie:
//CarFactory factory = new CarFactory();
//Car carWithDiesel = factory = factory.createCarWithDieselEngine(2.0);


// Różnica między factory a builderem:
//
//Fabryka służy do tworzenia całej „rodziny obiektów”. Builder zaś tworzy pojedynczy obiekt. Możemy, więc użyć builderów do tworzenia obiektów wewnątrz fabryki. Często też stosowanym wariantem metody wytwórczej jest statyczna metoda wytwórcza używana zamiast konstruktora (wszystkie zalety tej konstrukcji zostały opisane w Effective Java – Item 1).