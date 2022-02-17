interface RBI{
    double RATE_OF_INTEREST = 4;
    double showBalance();
    double withdraw(double amount);
    double deposit(double amount);
    double calculateYearlyInterest();
}

class SBIAccount implements RBI{
    protected String accHolder;
    protected double accBalance;
    protected int accNumber;
    private int count = 0;
    static final int ACC_OPENING_BONUS = 1000;

    
    
    public SBIAccount(String accHolder) {
        this.accHolder = accHolder;
        this.accNumber = ++count;
        this.accBalance = ACC_OPENING_BONUS;
    }

    public SBIAccount(String accHolder, double accBalance) {
        this.accHolder = accHolder;
        this.accBalance = accBalance + ACC_OPENING_BONUS;
        this.accNumber = ++count;
    }

    @Override
    public double showBalance() {
        return accBalance;
    }

    @Override
    public double withdraw(double amount) {
        if((this.accBalance-amount) > 0)
            this.accBalance -= amount;
        return this.accBalance; // remaining
    }

    @Override
    public double deposit(double amount) {
        this.accBalance += amount;
        return this.accBalance; // total
    }

    @Override
    public double calculateYearlyInterest() {
        return (this.accBalance*RATE_OF_INTEREST)/100.0;
    }

    void displayFeatures() {
        System.out.println("SBI is providing account opening Bonus for evary account holder etc.");
    }

    @Override
    public String toString() {
        return "SBIAccount [accBalance=" + accBalance + ", accHolder=" + accHolder + ", accNumber=" + accNumber + "]";
    }

    
    
}

class ICICIAccount implements RBI{
    protected String accHolder;
    protected double accBalance;
    protected int accNumber;
    private int count = 0;
    static final double ADDITIONAL_INTREST = 2.0;

    public ICICIAccount(String accHolder) {
        this.accHolder = accHolder;
        this.accNumber = ++count;
        this.accBalance=0;
    }

    public ICICIAccount(String accHolder, double accBalance) {
        this.accHolder = accHolder;
        this.accBalance = accBalance;
        this.accNumber = ++count;
    }

    @Override
    public double showBalance() {
        return accBalance;
    }

    @Override
    public double withdraw(double amount) {
        if((this.accBalance-amount) > 0)
            this.accBalance -= amount;
        return this.accBalance; // remaining
    }

    @Override
    public double deposit(double amount) {
        this.accBalance += amount;
        return this.accBalance; // total
    }

    @Override
    public double calculateYearlyInterest() {
        return (this.accBalance*(RATE_OF_INTEREST + ADDITIONAL_INTREST))/100.0;
    }


    void displayFeatures(){
        System.out.println("ICICI provides a wonderful additional Interest fetaure to their account holder");
    }


    @Override
    public String toString() {
        return "ICICIAccount [accBalance=" + accBalance + ", accHolder=" + accHolder + ", accNumber=" + accNumber + "]";
    }

    
    
}





public class BankInterface {
    public static void main(String[] args) {
        SBIAccount sbi = new SBIAccount("ShowBot",10000);
        System.out.println(sbi.toString());

        ICICIAccount icici = new ICICIAccount("Rakesh",10000);
        System.out.println(icici.toString());
    }
}
