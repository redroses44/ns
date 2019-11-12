package lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void changeAmount() {
        Currency currency = new Currency("EUR", "EURO");
        ExchangeRate rate = new ExchangeRate(10f);
        Money money = new Money(200.0, currency, rate);
        money.changeAmount("DECREASE", 150.5);
        assertEquals(money.getAmount(), 49.5);
    }

    @Test
    void convertMoney() {
        Currency currency = new Currency("EUR", "EURO");
        Currency currency1 = new Currency("USD", "DOLLAR");
        ExchangeRate eurRate = new ExchangeRate(1f);
        ExchangeRate usdRate = new ExchangeRate(0.91f);
        Money eur = new Money(100.0, currency, eurRate);
        Money usd = new Money(100.0, currency1, usdRate);
        eur.convertMoney(usd);
        assertEquals((int)eur.getAmount(), 91);
        assertEquals(eur.getRate().getExchangeRate(), 0.91f);
        assertEquals(eur.getCurrency().getCode(), "USD");
    }
}