public class Bird extends Animal implements CanMakeSound{

 public Bird (String name){
     super(name);

 }

    public void makeSound() {

        System.out.println(getName()+"Cik Cik");
    }
}
