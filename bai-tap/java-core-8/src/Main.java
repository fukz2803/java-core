public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        service.show(service.getAllEmployees());
    }
}
