class bank {
    String name;
    int accno;
    int age;
    bank(String n, int a, int ag) {
        name = n;
        accno = a;
        age = ag;
    }
    void view(){
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accno);
        System.out.println("Age: " + age);
    }

    public static void main(String [] args){
        
        bank b1 = new bank("Nabesh", 123456, 20);
        bank b2 = new bank("Imman", 654321, 21); 

        b1.view();
        b2.view();
    }
}