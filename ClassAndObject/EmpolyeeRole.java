class Empolyee {
    void CEO(){
        System.out.println("CEO Name: Nabesh");
        System.out.println("CEO ID: 12345");
    }
}
class Empolyee1 extends Empolyee{
    void Manager(){
        System.out.println("Manager Name: Imman");
        System.out.println("Manager ID: 54321");
    }
}
class Empolyee2 extends Empolyee1{
    void Staff(){
        System.out.println("Staff Name: Narasimhan S");
        System.out.println("Staff ID: 67890");
    }
}
public class EmpolyeeRole{
    public static void main(String[] args){
        
        Empolyee2 e = new Empolyee2();
        e.CEO();
        e.Manager();
        e.Staff();
    }

}

