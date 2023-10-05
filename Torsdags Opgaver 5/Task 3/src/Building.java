import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms = new ArrayList<>();
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    Building(ArrayList<Room> rooms,int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
        this.numberOfBathrooms=numberOfBathrooms;
        this.numberOfFloors=numberOfFloors;
        this.isOfficeBuilding=isOfficeBuilding;
        this.rooms=rooms;
    }

    public int getNumberOfBathrooms(){
        return this.numberOfBathrooms;
    }

    public int getNumberOfFloors(){
        return this.numberOfFloors;
    }

    public boolean getIsOfficeBuilding(){
        return this.isOfficeBuilding;
    }

    public ArrayList<Room> getRooms(){
        return rooms;
    }


}
