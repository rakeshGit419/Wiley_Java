class Account{
    int balance;
    String accountHolder;

    Account(String accountHolder,int balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void debit(int amt){
        if((balance - amt) < 0) {
            System.out.println("―Debit amount exceeded account balance");
        }else {
            balance -= amt;
            System.out.println("Remaining balance: "+balance);
        }
            
    }

    public void credit(int amt){
        balance += amt;
        System.out.println("Remaining balance: "+balance);
    }
}


public class modifiedBankAccount {
    
    public static void main(String[] args){
        Account person1 = new Account("Rakesh",10000);

        System.out.println(person1.accountHolder); // Rakesh
        System.out.println(person1.balance); // 10000
        person1.debit(1000); // 9000
        person1.debit(100000); // ―Debit amount exceeded account balance
        person1.credit(20000); // balance + 20000

        Account person2 = new Account("ShowBot",20000);
    }
}