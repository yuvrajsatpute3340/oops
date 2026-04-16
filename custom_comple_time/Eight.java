package custom_comple_time;

public class Eight {

    public static void main(String[] args) {
        int balance = 500;

        try {
            if(balance < 1000) {
                throw new LowBalanceException("Balance is too low");
            }
        }
        catch(LowBalanceException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Transaction process finished...");
        System.out.println("The END");
    }
}

class LowBalanceException extends Exception {
    public LowBalanceException(String str) {
        super(str);
    }
}