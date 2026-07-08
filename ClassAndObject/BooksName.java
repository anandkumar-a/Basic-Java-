 class Books{
    String title;
    String author;
    int price;
void view(){
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Price: " + price);
}
}
public class BooksName{
    public static void main(String args[]){
        Books b1 = new Books();
        b1.title = "Story of Journey";
        b1.author = "Imman";
        b1.price = 500;

        Books b2 = new Books();
        b2.title ="story of Failure";
        b2.author ="Nabesh";
        b2.price = 400;


        b1.view();
        b2.view();
    }
}