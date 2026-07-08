import java.util.ArrayList;
public class ArrayListExample1 {
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<>();
        name.add("Lionel");
        name.add("Messi");
        name.add("Andres");
        name.add("Alien");
        name.add("GOAT");
        name.remove(4);
        System.out.println("Removed Value"+name);
        System.out.println("VAlue to be GET"+name.get(2));
        name.set(3,"GOD");
        System.out.println("The Changed Value is"+name);

    }    
}
