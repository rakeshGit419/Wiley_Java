abstract class GeneralAccount {
    protected int accNo;
    protected String accHolderName;
    protected double accBalance;

    public GeneralAccount(int accNo, String accHolderName) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
    }

    public GeneralAccount(int accNo, String accHolderName, double accBalance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accBalance = accBalance;
    }

    public int getAccNo() {
        return this.accNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String toString() {
        return String.format("AccNo:%d %nAccHolderName : %s %nAccBalance: %.2f", this.accNo, this.accHolderName,this.accBalance);
    }

    public GeneralAccount getStatement(){
        System.out.println(this.getClass().getSimpleName()+" "+accHolderName+"\n");
        return this;
    }
}

class SavingsAccount extends GeneralAccount {
    static double rateOfInterest = 10;

    public SavingsAccount(int accNo, String accHolderName) {
        super(accNo, accHolderName);
    }

    public double getComputedInterest(int years) {
        return (this.accBalance * years * rateOfInterest) / 100;
    }

    public double getYearlyInterest() {
        return this.getComputedInterest(1);
    }

    @Override
    public SavingsAccount getStatement(){
        System.out.println(this.getClass().getSimpleName()+" "+accHolderName+"\n");
        return this;
    }
}

class CurrentAccount extends GeneralAccount {
    protected double avgDailyTransaction;

    public CurrentAccount(int accNo, String accHolderName) {
        super(accNo, accHolderName);
    }

    public CurrentAccount(int accNo, String accHolderName, double accBalance) {
        super(accNo, accHolderName, accBalance);
    }

    public CurrentAccount(double avgDailyTransaction, int accNo, String accHolderName) {
        super(accNo, accHolderName);
        this.avgDailyTransaction = avgDailyTransaction;
    }

    public CurrentAccount(double avgDailyTransaction, int accNo, String accHolderName, double accBalance) {
        super(accNo, accHolderName, accBalance);
        this.avgDailyTransaction = avgDailyTransaction;
    }

    public double getAvgDailyTransaction() {
        return avgDailyTransaction;
    }

    public void setAvgDailyTransaction(double avgDailyTransaction) {
        this.avgDailyTransaction = avgDailyTransaction;
    }

    public double getTotalTransactionAmount(int days) {
        return (days * this.avgDailyTransaction);

    }

    public double getYearlyTransaction() {
        return getTotalTransactionAmount(365);

    }

    @Override
    public String toString() {
        return super.toString() + String.format("%nAvgDailyTransaction: %.2f", this.avgDailyTransaction);
    }
    @Override
    public CurrentAccount getStatement(){
        System.out.println(this.getClass().getSimpleName()+" "+accHolderName+"\n");
        return this;
    }
}



public class bankDriver {
    public static void main(String[] args) {
        
    }
    
}
