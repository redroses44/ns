package lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeRateTest {

    @Test
    void setExchangeRate() {
        ExchangeRate rate = new ExchangeRate(50f);
        rate.setExchangeRate(70f);
        assertEquals(rate.getExchangeRate(), 70f);
    }
}