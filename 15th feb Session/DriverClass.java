import java.util.Objects;
import java.util.Scanner;

interface SalaryAccount{
    int salary = 30000;
    int pf = 2000;
    double incomeTaxRate = 10;
    double getYearlyTax();
    double getInHandSalary();
}



class GeneralAccount {
    private int count = 100;
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

    public GeneralAccount getObject() { 
        return null;
        
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
}

class DriverClass {
    public static void main(String[] args) {
        /*{
            GeneralAccount generalAcc = new GeneralAccount(101, "ShowBot");
            generalAcc.setAccBalance(10000);
            System.out.println(generalAcc);

            SavingsAccount savingsAcc = new SavingsAccount(102, "Bobby");
            savingsAcc.setAccBalance(20000);
            System.out.println(savingsAcc);
            System.out.println("Yearly interest credited = " + savingsAcc.getYearlyInterest());
            System.out.println("Interest calculated = " + savingsAcc.getComputedInterest(2));

            CurrentAccount currentAcc = new CurrentAccount(103, "Acc3", 50000);
            currentAcc.setAvgDailyTransaction(1000);
            System.out.println(currentAcc);
            System.out.println("Yearly Transaction :" + currentAcc.getYearlyTransaction());
            System.out.println("Total Transaction :" + currentAcc.getTotalTransactionAmount(2));
            // ----------------------------------------------------------------------------------------------------
            

            SalaryAccount salaryAcc = new SalaryAccount(){
            public double getYearlyTax(){
                return (salary*12*incomeTaxRate)/100;
            }
            public double getInHandSalary(){
                return (salary - getYearlyTax())/12 - pf;
            }
        };
        }*/
        // -----------------------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // scanner.close();

        // GeneralAccount[] genAcc = new GeneralAccount[n];
        // for(int i=0;i<n;i++){
        //     String name = scanner.next();
        // }

        
    }
}