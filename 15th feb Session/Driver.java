class BankAccount{
    String accNo;
    String accountHolder;
    double accBalance;

    BankAccount(){
        accNo="XXXXXXX";
        accountHolder="Name";
        accBalance=0;
    }
    BankAccount(String accNo,String accountHolder,double accBalance){
        this.accNo = accNo;
        this.accountHolder = accountHolder;
        this.accBalance = accBalance;
    }
    public String getAccNo() {
        return accNo;
    }
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public double getAccBalance() {
        return accBalance;
    }
    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }
    
    public String toString() {
        return "Account No: "+accNo+"\nAcountHolderName: "+accountHolder+"\nAccount Balnce: "+accBalance+"\n";
    }
    
    
}

class SavingAccount extends BankAccount{
    double rateOfInterest;
    SavingAccount(){
        rateOfInterest = 1;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public double getComputedInterest(int year){
        double P = getAccBalance();
        int T = year;
        double R= getRateOfInterest();

        return ((double)(P*T*R))/100.0;
    }
    
    public double getYearlyInterest(){
        double P = getAccBalance();
        int T = 1;
        double R= getRateOfInterest();

        return ((double)(P*T*R))/100.0;
    }

    @Override
    public String toString() {
        return "Rate Of Interest: "+rateOfInterest+"\n";
    }
}


class CurrentAccount extends BankAccount {
    double avgDailyTransaction;

    public double getAvgDailyTransaction() {
        return avgDailyTransaction;
    }

    public void setAvgDailyTransaction(double avgDailyTransaction) {
        this.avgDailyTransaction = avgDailyTransaction;
    }

    @Override
    public String toString() {
        return super.toString() + "\navgDailyTransaction : " + avgDailyTransaction + "\n";
    }

    double getYearlyTransaction() {
        return avgDailyTransaction * 365;
    }

    double getTotalTransactionAmount(int days) {
        return avgDailyTransaction * days;
    }


}

public class Driver{
    public static void main(String[] args){
        BankAccount generalAcc = new BankAccount("129510106168","ShowBot",100000);
        System.out.println(generalAcc.toString());

        SavingAccount savingAcc = new SavingAccount();
        System.out.println(savingAcc.toString());

        CurrentAccount currentAcc = new CurrentAccount();
        System.out.println(currentAcc.toString());

        Bank salaryBank = Bank(){
            double incomeTax = 10();
            
        }


    }
}