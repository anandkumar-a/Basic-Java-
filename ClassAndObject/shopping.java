class shopping {
    void order(String Product){
        System.out.println("Product: " + Product);
    }
    void order(String Product, int quantity){
        System.out.println("Product: " + Product + ", Quantity: " + quantity);
    }
    public static void main(String[] args) {
        shopping obj = new shopping();
        obj.order("Laptop");
        obj.order("Mobile", 2);
    } 

 
}
    