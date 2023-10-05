import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> collection = new ArrayList<>();
        Room r1 = new Room(4,5,3);
        Room r2 = new Room(8,3,6);
        Room r3 = new Room(7,3,5);
        Building b1 = new Building(collection,5,1,true);
        collection.add(r1);
        collection.add(r2);
        collection.add(r3);
        System.out.println(coutingLampsInBuilding(b1));
        isNormal(b1);
    }
    public static int coutingLampsInBuilding(Building obj){
        int sum=0;
        for(Room b: obj.getRooms()){
            sum+=b.getLamps();
        }
        return sum;
    }
    public static boolean isNormal(Building obj){
        if(obj.getNumberOfFloors()>obj.getRooms().size()){
            return true;
        }
        else{
            System.out.println("This is an odd building");
            return false;
        }
    }

}