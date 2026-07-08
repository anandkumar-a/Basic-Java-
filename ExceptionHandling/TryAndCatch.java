public class TryAndCatch{
    public static void main(String[] args){
        try{
            int a = 10;
            int b = 0;
            int Result = a / b;
            System.out.println(Result);
        }
        catch(ArithmeticException e){
            System.out.println(" Division by zero is not allowed.");
        }
    System.out.println("Continuee....");  
    }
}