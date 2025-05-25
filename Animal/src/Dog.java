public class Dog extends Animal implements CanMakeSound{

public Dog (String name){
    super(name);
}
public void makeSound() {

        System.out.println(getName()+"Blaf");


    }
}
