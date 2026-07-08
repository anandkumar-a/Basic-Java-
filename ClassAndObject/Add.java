class Add1 {
    void add(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
}
    void add(int a, int b, int c) {
    System.out.println("Sum of three numbers: " + (a + b + c));
   
}
}

public class Add {
    public static void main(String[] args) {
        Add1 obj = new Add1();
        obj.add(5, 10);
        obj.add(5, 10, 15);
    }
}
