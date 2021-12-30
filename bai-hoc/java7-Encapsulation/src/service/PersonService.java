package service;

import model.Person;

public class PersonService {

    public static void createPerson(){
        Person person = new Person("Kien",27,"HN");

        System.out.println(person);
//        person.name = "Le Kien";

        person.setName("Le Kien");

        System.out.println(person);

        System.out.println(person.getName());

    }
}
