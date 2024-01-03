public class User {
    private String name;
    private String password;
    private String email;
    private int phoneNumber;

    public User(String name, String password){
        this.name=name;
        this.password=password;
    }
    public User(String name, String password, String email){
        this.name=name;
        this.password=password;
        this.email=email;
    }
    public User(String name, String password, String email, int phoneNumber){
        this.name=name;
        this.password=password;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    //getters
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        //constructor with all atributes
        if (email!=null&&phoneNumber!=0){
            return "Name: "+name+"\nEmail: "+email+"\nPhone nr.: "+phoneNumber+"\n";
        }
        //contructor with only 2 attributes
        else if(phoneNumber==0&&email==null){
            return "Name: "+name+"\n";
        }
        //constructor with 3 attributes
        else {
            return "Name: "+name+"\nEmail: "+email+"\n";
        }
    }
}
