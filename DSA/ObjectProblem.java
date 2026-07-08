import java.util.ArrayList;

public class ObjectProblem {

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        list.add(10);
        list.add("Messi");
        list.add("Lionel");
        list.add(13);

        System.out.println("The objects are: " + list);
        list.remove(3);
        System.out.println("The Values are: "+list);
        System.out.println("The Value to Get: "+list.get(2));
        list.set(1,"GOAT");
        System.out.println("the Finall Values Is: "+list);
    }
}