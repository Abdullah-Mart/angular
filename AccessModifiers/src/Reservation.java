
public class Reservation {

private Boat boat;

public Reservation (Boat boat){
    this.boat = boat;
}

public void infoReservation (){
    System.out.println(boat.getName()+ " is reservated ");
}


public static void main (String[] args){


    Boat myBoat = new Boat("Kajak", 2);

    Reservation costumer = new Reservation(myBoat);

    costumer.infoReservation();

}
}
