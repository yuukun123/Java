package School_excercise_quanlythuongmaidientu;

public abstract class User {
    private String userName;
    private String phoneNumber;
    private String address;
    private String email;

    public User(String userName, String phoneNumber, String address, String email) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }

   public String toString() {
       return "User name: " + getUserName() + " | Phone number: " + getPhoneNumber() + " | Address: " + getAddress() + " | Email: " + getEmail();
   }
}
