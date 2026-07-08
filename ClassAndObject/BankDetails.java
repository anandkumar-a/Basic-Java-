class Bank {
    void bankDetails(){
        System.out.println("Bank Name: NabeshBank");
    }
}
class Account extends Bank{
    void accountDetails(){
        System.out.println("Account Number: 123456");
    }
}
class Customer extends Account{
    void customerDetails(){
        System.out.println("Customer Name: Nabesh");
    }
}
public class BankDetails{
    public static void main(String[] args){
        
        Customer c = new Customer();
        c.bankDetails();
        c.accountDetails();
        c.customerDetails();
    }
}