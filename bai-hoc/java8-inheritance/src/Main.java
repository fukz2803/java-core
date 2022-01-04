import Employee.Developer;
import Shape.Retangle;
import Shape.Square;
import Shape.Triangle;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Person.Student s = new Person.Student(1,"Kien", LocalDate.of(1994,03,28),"Java 08",8.5);
//        System.out.println(s);
//
//        Person.Teacher t = new Person.Teacher(2,"A",LocalDate.of(1990,12,10),"HTML/CSS",8000000);
//        System.out.println(t);
//
//        Library.SchoolBook sb = new Library.SchoolBook(1,"De Men Phieu Luu Ky","ABC",1982,20,400,"Nguyen ven",10);
//        System.out.println(sb);
//
//        Calculator.sum(5,6);
//        Calculator.sum(5.5,6.6);
//        Calculator.sum(1,2,3);

//        Developer d = new Developer(1,"A",LocalDate.of(1994,03,28),100000,50);
//        System.out.println(d);

        Triangle t = new Triangle(10,12,13,14);
        System.out.println(t);

        Square s = new Square(4);
        System.out.println(s);

        Retangle r = new Retangle(10,12);
        System.out.println(r);
    }

}
