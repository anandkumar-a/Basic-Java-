import java.util.ArrayList;
public class ArrayListExample{
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(50);
        number.add(60);
        number.add(70);
        number.add(80);
        number.add(90);
        System.out.println("ArrayList: " + number);
        System.out.println("Get the number"+ number.get(2));
        number.set(2,100);
        System.out.println("Set the value"+number);
        System.out.println("Index Value:"+number.indexOf(4));

    }
}