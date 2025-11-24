package Static_Variable;

class Company {
    static String companyName = "TCS";
}

public class StaticAccess {
    public static void main(String[] args) {
        System.out.println(Company.companyName);
    }
}
