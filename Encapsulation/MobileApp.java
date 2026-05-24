package Encapsulation;

package Encapsulation;

public class MobileApp {

    public static void main(String[] args) {

        UserAccount obj = new UserAccount();

        obj.setPassword("pass@123");

        System.out.println(obj.getPassword());
    }
}

class UserAccount {

    private String password;
    private String email;

    // Setter method
    public void setPassword(String password) {

        if (password.contains("@")) {
            this.password = password;
        } else {
            System.out.println("Weak Password...");
        }
    }

    // Getter method
    public String getPassword() {
        return this.password;
    }
}