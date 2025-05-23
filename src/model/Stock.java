package model;

import java.time.LocalDate;

public class Stock {
    private String ticker;
    private String name;
    private String sector;
    private double price;
    private String currency;
    private String rating;
    private double dividendYield;
    private String market;
    private LocalDate lastUpdated;

    public Stock(String ticker, String name, String sector, double price,
                 String currency, String rating, double dividendYield,
                 String market, LocalDate lastUpdated) {
        this.ticker = ticker;
        this.name = name;
        this.sector = sector;
        this.price = price;
        this.currency = currency;
        this.rating = rating;
        this.dividendYield = dividendYield;
        this.market = market;
        this.lastUpdated = lastUpdated;
    }


}
