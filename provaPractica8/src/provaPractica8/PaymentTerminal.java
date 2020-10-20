package provaPractica8;

/** Part 2: implement the methods so they work
 * correctly.
 *
 * Part 3: implement support for card payments.
 */
public class PaymentTerminal {
    private static final double AFFORDABLE_PRICE = 2.5;
    private static final double HEARTILY_PRICE = 4.3;
 
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
 
 
    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.0;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }
 
    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (AFFORDABLE_PRICE > payment) {
            return payment;
        } else {
            this.money += AFFORDABLE_PRICE;
            this.affordableMeals++;
            return payment - AFFORDABLE_PRICE;
        }
    }
 
    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (HEARTILY_PRICE > payment) {
            return payment;
        } else {
            this.money += HEARTILY_PRICE;
            this.heartyMeals++;
            return payment - HEARTILY_PRICE;
        }
    }
 
    public boolean eatAffordably(PaymentCard card) {
        if (AFFORDABLE_PRICE > card.balance()) {
            return false;
        } else {
            // this.money += this.affordableMealsPrice;
            card.takeMoney(AFFORDABLE_PRICE);
            this.affordableMeals++;
            return true;
        }
    }
 
    public boolean eatHeartily(PaymentCard card) {
        if (HEARTILY_PRICE > card.balance()) {
            return false;
        } else {
            // this.money += this.heartyMealsPrice;
            card.takeMoney(HEARTILY_PRICE);
            this.heartyMeals++;
            return true;
        }
    }
 
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum < 0) {
            return;
        } else {
            card.addMoney(sum);
            this.money += sum;
        }
    }
 
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}