package Encapsulation;

public class EmailApp {
    public static void main(String[] args) {

        User user = new User();

        user.setEmail("abc@gmail.com");
        System.out.println(user.getEmail());
    }
}

class User {

    private String email;

    public void setEmail(String email) {
        if (email.contains("@") && email.endsWith(".com")) {
            this.email = email;
        } else {
            System.out.println("Invalid Email!");
        }
    }

    public String getEmail() {
        return email;
    }
}