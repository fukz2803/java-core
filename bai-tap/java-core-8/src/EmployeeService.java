public class EmployeeService {
   public Employee[] getAllEmployees(){
       Employee[] employees = new Employee[3];
       employees[0] = new Kitchen(1,"Nguyễn Văn A",23,5000000,2000000);
       employees[1] = new Kitchen(2,"Trần văn B",24,5000000,2000000);
       employees[2] = new Waiter(3,"Lê Văn C",20,5000000,1500000);
       return employees;
   }

   public void show(Employee []  employees){
       for (Employee e : employees
            ) {
           System.out.println(e);
       }
   }
}
