package Interface;

public class Hotel {

    private String name;
    private int totalrooms;
    private int reservedRooms;

    public Hotel(String name,int totalrooms,int reservedRooms){
        this.name = name;
        this.totalrooms = totalrooms;
        this.reservedRooms = reservedRooms;

    }

    public void reserveroom(String guestName, int numofRooms){
        class ReservationValidator{
            boolean validate(){
            if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest name cannot be empty!");
                    return false;
                }
            if(numofRooms<0){
                System.out.println("Number of rooms should be positive");
                return false;
            }
            if(reservedRooms + numofRooms >totalrooms){
                System.out.println("Not enough rooms available.");
                return false;
            }
            return true;    

        }
    }

    ReservationValidator validator = new ReservationValidator();
    if(validator.validate()){
        reservedRooms+=numofRooms;
        System.out.println("Reservation Confirmed for " + guestName + " for " + numofRooms + " rooms.");
    }
    else{
        System.out.println("Reservation failed!");
    }
}
}
