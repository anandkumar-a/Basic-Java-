import java.io.IOException;
import java.io.FileReader;
public class FIleHandling {
 static void readfile() throws IOException {
  FileReader fr = new FileReader("Mydetails.txt");//Throws IOException if file not found
  System.out.println("File opened successfully");
  int i;
  while ((i = fr.read()) != -1)
   System.out.print((char) i);
  fr.close();
 }
 public static void main(String[] args) {
  try {
   readfile();
  } 
  catch (IOException e) {
   System.out.println("File not found");
  }
  System.out.println("Continuee....");
 }
}
