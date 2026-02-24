package custom_comple_time;

public class Fourth {

    public static void main(String[] args) {
        double balance = 1000;
        double withdrawAmount = 1500;

        try {
            if (withdrawAmount > balance) {
                throw new InsufficientBalanceException("Insufficient Balance!");
            }
            System.out.println("Withdrawal successful.");
        } 
        catch (InsufficientBalanceException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Transaction Completed.");
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}