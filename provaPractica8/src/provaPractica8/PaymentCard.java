package provaPractica8;

/** Part 1: complete the method
 * takeMoney(double amount) so that
 * it only takes money only if the balance
 * is at least the amount parameter.
 */
public class PaymentCard {
 
    private double balance;
 
    public PaymentCard(double balance) {
        this.balance = balance;
    }
 
    public double balance() {
        return this.balance;
    }
 
    public void addMoney(double increase) {
        if (increase < 0) {
            return;
        } else {
            this.balance += increase;
        }
    }
 
    public boolean takeMoney(double amount) {
 
        if (this.balance < amount) {
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }
}