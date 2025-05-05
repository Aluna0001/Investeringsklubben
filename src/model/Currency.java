package model;

import java.time.LocalDate;

public class Currency {
    private String baseCurrency;
    private String quoteCurrency;
    private double rate;
    private LocalDate lastUpdated;

    public Currency(String baseCurrency, String quoteCurrency, double rate, LocalDate lastUpdated) {
        this.baseCurrency = baseCurrency;
        this.quoteCurrency = quoteCurrency;
        this.rate = rate;
        this.lastUpdated = lastUpdated;
    }


}
