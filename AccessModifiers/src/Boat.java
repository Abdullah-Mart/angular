public class Boat {




    String name;
    int capacity;




    public Boat (String name, int capacity){
        this.name = name;
        this.capacity= capacity;

    }

        public void infoBoat(){
            System.out.println("Boat Name :"+ name+ " "+"Boat Capacity:  " + capacity);
        }

            //getName method created
            public String getName() {
                return name;
            }
                    public void setName(String name) {
                        this.name = name;
                    }
        public int getCapacity() {
            return capacity;
        }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}


// Supboart Class created
class Supboat extends Boat{

    public Supboat (String name, int capacity ){
        super(name,capacity);

    }
            public void infoBoat(){
                System.out.println("Boat Name: " +name+capacity);
            }

}

// Rowing Boat Class created
class RowingBoat extends Boat{

    public RowingBoat (String name, int capacity){
        super(name,capacity);
    }
        public void infoBoat(){
            System.out.println("Boat Name: " +name+ capacity);
        }
}


// Main Class created
 class Main {
    public static void main(String[] args) {

        Boat myBoat = new Boat("Kajak", 2);
            myBoat.infoBoat();





    }
}