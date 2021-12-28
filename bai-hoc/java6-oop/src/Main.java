public class Main {
    public static void main(String[] args) {
//        Animal cat = new Animal("Miu", 4, 4, "White");
//        System.out.println(cat);
//
//        Animal dog = new Animal("Mike", 4, 4, "Black");
//        System.out.println(dog);
//
//
//        Person Jane = new Person(1,"Jane",25,Gender.FEMALE,"HN");
//        System.out.println(Jane);
//        Person John = new Person(2,"John",30,Gender.MALE,"HCM");
//        System.out.println(John);

//        Dog german = new Dog("German Shepherds",Size.LARGE,"White & Gray",6);
//        System.out.println(german);
//        Dog bull = new Dog("Bulldog",Size.LARGE,"LightGrey", 5);
//        System.out.println(bull);

//        PersonService service = new PersonService();
//        Person[] persons = service.addPerson(3);
//        service.show(persons);

        StudentService service = new StudentService();
        Students[] students = service.addStudent(2);
        service.show(students);



    }
}
