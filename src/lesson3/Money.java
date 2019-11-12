package lesson3;

public class Money {
    private double amount;
    private Currency currency;
    private ExchangeRate rate;

    public Money(double amount, Currency currency, ExchangeRate rate) {
        this.amount = amount;
        this.currency = currency;
        this.rate = rate;
    }

    public double getAmount() {
        return amount;
    }

    public void changeAmount(String method, double amount) {
        if (method.equals(MoneyMethods.INCREASE.toString())) {
            this.amount += amount;
        } else if (method.equals(MoneyMethods.DECREASE.toString())) {
            this.amount -= amount;
        } else {
            this.amount = amount;
        }
    }

    public void setRate(ExchangeRate rate) {
        this.rate = rate;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void convertMoney(Money money) {
        double temp = getAmount() * money.getRate().getExchangeRate();
        this.setAmount(temp / getRate().getExchangeRate());
        this.setCurrency(money.getCurrency());
        this.setRate(money.getRate());
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public ExchangeRate getRate() {
        return rate;
    }

    public void printMoney(Money money) {
        System.out.println("-----------------------------------------");
        System.out.println("| Money exchange rate: " + money.getRate().getExchangeRate());
        System.out.println("| Amount of money: " + money.getAmount());
        System.out.println("| Currency of that money: " + money.getCurrency().getCode());
        System.out.println("-----------------------------------------");

    }


    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency=" + currency +
                ", rate=" + rate +
                '}';
    }
}
