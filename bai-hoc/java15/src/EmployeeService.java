import java.util.ArrayList;

public class EmployeeService {
    public ArrayList<Employee> getAllEmployees(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John",20));
        employees.add(new Employee("Mary",25));
        employees.add(new Employee("May",29));
        employees.add(new Employee("Wolf",30));
        return employees;
    }

    public void sortByAge(ArrayList<Employee> employees){
        employees.stream().filter(employee -> employee.getAge() > 25)
                .forEach(employee -> System.out.println(employee));
    }

}
