package lesson3;

public class ExchangeRate {

    private float exchangeRate;

    public ExchangeRate(float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public float getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return "ExchangeRate{" +
                "exchangeRate=" + exchangeRate +
                '}';
    }
}
