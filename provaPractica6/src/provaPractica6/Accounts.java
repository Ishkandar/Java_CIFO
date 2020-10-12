package provaPractica6;

public class Accounts {
	 
    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
 
        // creates an Account with balance 1000.0:
        Account matthewAccount = new Account("Matthews account", 1000);
        //creates another Account with balance 0.0
        Account myAccount = new Account("My account", 0);
 
        // withdraws 100.0 from matthew's:
        matthewAccount.withdrawal(100.0);
        // deposits 100.0 to myAccount:
        myAccount.deposit(100.0);
 
        // prints the accounts:
        System.out.print(matthewAccount + "\n" + myAccount);
    }
}