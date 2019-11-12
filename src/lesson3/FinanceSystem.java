package lesson3;

import java.util.ArrayList;
import java.util.List;

public class FinanceSystem {
    private List<Money> moneyList;

    public FinanceSystem() {
        this.moneyList = new ArrayList<>();
    }


    public void addMoney(Money money) {
        moneyList.add(money);
    }

    public int getLength() {
        return moneyList.size();
    }


    @Override
    public String toString() {
        return "FinanceSystem {" +
                " , moneyList=" + moneyList +
                '}';
    }


    public static void main(String[] args) {

        Currency currency = new Currency("USD", "DOLLAR");
        Currency currency1 = new Currency("EUR", "EURO");

        ExchangeRate rate = new ExchangeRate(0.91f);
        ExchangeRate rate1 = new ExchangeRate(1f);

        //Change exchange rate
        //rate.setExchangeRate(50f);


        Money money = new Money(100.0, currency, rate);
        Money money1 = new Money(100.0, currency1, rate1);


        FinanceSystem system = new FinanceSystem();

        //Add new money
        system.addMoney(money);
        //system.addMoney(money1);

        //Increase amount of money
        //money.changeAmount("INCREASE", 500.5);

        //Convert 1 money object to a different one
        money.convertMoney(money1);
        money.printMoney(money);

        //Decrease amount of money
        //money.changeAmount("DECREASE", 40.1);

        System.out.println(system);

    }
}
