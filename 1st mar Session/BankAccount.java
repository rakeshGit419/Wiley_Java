
import java.io.Serializable;

public class BankAccount implements Serializable{
    String accNum;
    String accHolder;
    int accBalance;
    
    public BankAccount(String accNum, String accHolder, int accBalance) {
        this.accNum = accNum;
        this.accHolder = accHolder;
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return "BankAccount [accBalance=" + accBalance + ", accHolder=" + accHolder + ", accNum=" + accNum + "]";
    }
    
}
