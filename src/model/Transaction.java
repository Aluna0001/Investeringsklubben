package model;

import java.time.LocalDate;

public class Transaction {
    private int id;
    private int userId;
    private LocalDate date;
    private String ticker;
    private double price;
    private String currency;
    private String orderType;
    private int quantity;

    public Transaction(int id, int userId, LocalDate date, String ticker,
                       double price, String currency, String orderType, int quantity) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.ticker = ticker;
        this.price = price;
        this.currency = currency;
        this.orderType = orderType;
        this.quantity = quantity;
    }


}
