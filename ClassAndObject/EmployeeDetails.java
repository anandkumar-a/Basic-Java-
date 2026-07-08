class Employee{
    void employee(){
        System.out.println("Name: Nabesh");
    }
    class EmployeeID extends Employee{
        
        void ID(){
        System.out.println("Employee ID: 12345");
        }
    }
}
public class EmployeeDetails {
    public static void main(String[] args){
        
        Employee emp = new Employee();
        emp.employee();
        Employee.EmployeeID empID = emp.new EmployeeID();   
        empID.ID();
    }
}
