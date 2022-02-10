class Account{
    double balance;
    String accountHolder;

    Account(String accountHolder,double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
}





public class bankAccount {
    
    public static void main(String[] args){
        Account person1 = new Account("Rakesh",10000);
        Account person2 = new Account("ShowBot",20000);
    }
}
