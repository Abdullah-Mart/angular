package Person;

public class Person {

    public String firstName;
    public String lastName;
    public String address;



    public Person (String firstName, String lastName, String address ){

        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);


    }
   public static void main(String[] args){
        Person person = new Person( "Abdullah", "Mart","Vosseveld 15");
       System.out.println(person.firstName);
       System.out.println(person.lastName);
       System.out.println(person.address);

   }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
