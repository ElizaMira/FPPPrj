package Assignment12;

public class CustomerAccount {
    private String Cus_name;
    private String Acc_No;
    private double Balance;

    CustomerAccount(String Cus_name, String Acc_No, double Balance) {
        this.Cus_name = Cus_name;
        this.Acc_No = Acc_No;
        this.Balance = Balance;
    }

    public boolean deposit(double amount) {

        if (amount < 0) return false;
        return true;

    }

    public boolean withdraw(double amount) {
        try {
            if (amount>Balance) throw new MyException("Withdraw amount exceeds the balance");
        }catch (MyException ex){
            System.out.println(ex.getMessage());
        }
        return true;
    }

    public double getBalance() {
        try {
            if (Balance < 100) throw new MyException("Balance reach below 100$");

        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }

        return Balance;
    }
   public class MyException extends Exception {
        public MyException(String s)
        {

            super(s);
        }
    }


    public static void main(String[] args) {
        CustomerAccount cAcc = new CustomerAccount("David", "134-5643", 99);
        cAcc.deposit(150);
        cAcc.withdraw(160);
        cAcc.getBalance() ;

    }
}