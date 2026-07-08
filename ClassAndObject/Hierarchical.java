class Animal{
    void cat(){
        System.out.println("Type: Lion Family");
    }
}
class Dog extends Animal{
    void dog(){
        System.out.println("Type: Wolf Family");
    }
}
class Dinosaur extends Animal{
    void dinosaur(){
        System.out.println("Type: Tyrannosaurus Family");
    }
}
public class Hierarchical{
    public static void main(String[] args){
        
        Dog d = new Dog();
        d.cat();
        d.dog();
        
        Dinosaur di = new Dinosaur();
        di.cat();
        di.dinosaur();
    }
}