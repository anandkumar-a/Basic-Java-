import java.util.Scanner;
public class NumberFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the Number");
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            System.out.println("The number is: " + num);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid number format.");
        }
}
}
