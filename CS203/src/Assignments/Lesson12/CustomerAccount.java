package Assignments.Lesson12;

public class CustomerAccount {
    public static void main(String[] args) {
        CustomerAccount cus = new CustomerAccount("Tengis", 123654,4500.00);
        deposit(500.0);
        System.out.println(getBalance());
        withdraw(3500);
        System.out.println(getBalance());

    }
    private String acc_Name;
    private int acc_Num;
    private static double balance;

    public CustomerAccount(String acc_Name, int acc_Num, double balance) {
        this.acc_Name = acc_Name;
        this.acc_Num = acc_Num;
        this.balance = balance;
    }

    public static boolean deposit(double amount){
        boolean flag = false;
        if(amount>0)
            balance+=amount;
            flag = true;
        return flag;
    }
    public static boolean withdraw(double amount){
        boolean flag = false;
        if(amount<=balance) {
            balance -= amount;
            flag = true;
        }
        return flag;
    }
    public static double getBalance(){
        return balance;
    }
}
