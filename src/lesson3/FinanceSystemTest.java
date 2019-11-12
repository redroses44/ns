package lesson3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FinanceSystemTest {

    @BeforeEach
    void setUp() {
        //FinanceSystem system = new FinanceSystem();
    }

    @Test
    void addMoney() {
        setUp();
        FinanceSystem system = new FinanceSystem();
        Currency currency = new Currency("USD", "DOLLAR");
        ExchangeRate rate = new ExchangeRate(30f);
        Money money = new Money(50.0, currency, rate);
        system.addMoney(money);
        assertEquals(system.getLength(), 1);
    }
}