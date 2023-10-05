public class Costumer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;

    Costumer(String firstName, String lastName, String username){
        this.firstName=firstName;
        this.lastName=lastName;
        this.username=username;
    }

    public String toString() {
        return "Costumer name: "+this.firstName+" "+this.lastName+"\n"+
                "Costumer username: "+this.username+"\n";
    }

}
