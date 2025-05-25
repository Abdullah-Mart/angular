public abstract class Animal {
    private String name;


   public Animal(String name){
       setName(name);

    }

    public abstract void makeSound();

    protected String getName(){
        return name;
    }

    protected void setName(String newName){
        if (newName!= null && !newName.isEmpty()){
            name = newName;
        }else {
            throw new IllegalArgumentException("newName");
        }
    }
}
