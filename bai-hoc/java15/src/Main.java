import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        ArrayList<Employee> employees = service.getAllEmployees();

        service.sortByAge(employees);
    }
}
