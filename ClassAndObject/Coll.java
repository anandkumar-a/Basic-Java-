class Col {
    void Department(){
        System.out.println("Department Name: DSBA");
    }
}
class Staff extends Col{
    void staff(){
        System.out.println("Staff Name: Narasimhan S");
    }
}
class Student extends Staff{
    void student(){
        System.out.println("Student Name : Nabesh");
    }
}
public class Coll{
    public static void main(String[] args){
        
        Student s = new Student();
        s.Department();
        s.staff();
        s.student();
    }
} 


