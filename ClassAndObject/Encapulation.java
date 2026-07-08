class student{
    public String name;
    public String regno;
    public String dept;
                                                       
    public void Setname(String name){
        this.name =name;
    }
    public String Getname(){
        return name;
    }
    public void SetRegno(String regno){
        this.regno =regno;
    }
    public String GetRegno(){
        return regno;
    }
    public void SetDept(String dept){
        this.dept =dept;
    }
    public String GetDept(){
        return dept;
    }
    public class Encapulation{
        public  void main(String []args){
            student s1 = new student();
            s1.Setname("Nabesh");
            s1.SetRegno("RCAS2025MDB003");
            s1.SetDept("DSBA");

            student s2 = new student();
            s2.Setname("Imman");
            s2.SetRegno("RCAS2025MDB054");
            s2.SetDept("DSBA");

            System.out.println("Student 1 Details:");
            System.out.println("Name: " + s1.Getname());
            System.out.println("Registration Number: " + s1.GetRegno());
            System.out.println("Department: " + s1.GetDept());

            System.out.println("\nStudent 2 Details:");
            System.out.println("Name: " + s2.Getname());
            System.out.println("Registration Number: " + s2.GetRegno());
            System.out.println("Department: " + s2.GetDept());
        }
    } 
}