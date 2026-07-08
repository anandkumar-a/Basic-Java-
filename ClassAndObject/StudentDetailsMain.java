class StudentDetails {
    String RegistrationNumber;
    String Name;
    String Department;
    void view() {
        System.out.println("Registration Number: " + RegistrationNumber);
        System.out.println("Name: " + Name);
        System.out.println("Department: " + Department);
    }
}
 public class StudentDetailsMain {
    public static void main(String args[]) {
        StudentDetails s1 = new StudentDetails();
        s1.RegistrationNumber = "RCAS2025MDB003";
        s1.Name = "Nabesh";
        s1.Department = "DSBA";

        StudentDetails s2 = new StudentDetails();
        s2.RegistrationNumber = "RCAS2025MDB054";
        s2.Name = "Imman";
        s2.Department = "DSBA";
        
        
        s1.view();
        s2.view();
    }
 }
 
 class Staffdetails{
    String StaffID;
    String Name;
    String Department;
    void view() {
        System.out.println("Staff ID: " + StaffID);
        System.out.println("Name: " + Name);
        System.out.println("Department: " + Department);
    }
    public static void main(String args[]) {
        Staffdetails st1 = new Staffdetails();
        st1.StaffID = "ST003";
        st1.Name = "Nabesh";
        st1.Department = "DSBA";

        Staffdetails st2 = new Staffdetails();
        st2.StaffID = "ST054";
        st2.Name = "Imman";
        st2.Department = "DSBA";
        
        
        st1.view();
        st2.view();
    }
 }