package model;

import java.time.LocalDate;

public class User {
    private int userId;
    private String fullName;
    private String email;
    private LocalDate birthDate;
    private double initialCashDKK;
    private LocalDate createdAt;
    private LocalDate lastUpdated;

    public User(int userId, String fullName, String email, LocalDate birthDate,
                double initialCashDKK, LocalDate createdAt, LocalDate lastUpdated) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.birthDate = birthDate;
        this.initialCashDKK = initialCashDKK;
        this.createdAt = createdAt;
        this.lastUpdated = lastUpdated;
    }


}
