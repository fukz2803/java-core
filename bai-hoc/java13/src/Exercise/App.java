package Exercise;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        PersonModel<Student> student = new PersonModel<>();
        PersonModel<Employee> employee = new PersonModel<>();

        student.add(new Student(1,"A",23));
        student.add(new Student(2,"B",22));

        employee.add(new Employee(3,"C",2000000));
        employee.add(new Employee(4,"D",5000000));

        student.display();
        employee.display();
    }
}
