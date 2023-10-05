public class Room {
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    Room(int numberOfDoors, int numberOfLamps, int numberOfWindows){
        this.numberOfDoors=numberOfDoors;
        this.numberOfLamps=numberOfLamps;
        this.numberOfWindows=numberOfWindows;
    }

    public int getDoors(){
        return this.numberOfDoors;
    }

    public int getLamps(){
        return this.numberOfLamps;
    }

    public int getWindows(){
        return this.numberOfWindows;
    }
}