package service;

import model.Currency;
import model.Stock;
import model.Transaction;
import model.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class FileService {

    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public ArrayList<User> loadUsers() {
        ArrayList<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("users.csv"))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] p = line.split(";");
                users.add(new User(
                        Integer.parseInt(p[0]),
                        p[1],
                        p[2],
                        LocalDate.parse(p[3], dateFormatter),
                        Double.parseDouble(p[4]),
                        LocalDate.parse(p[5], dateFormatter),
                        LocalDate.parse(p[6], dateFormatter)
                ));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    public ArrayList<Transaction> loadTransactions() {
        ArrayList<Transaction> transactions = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("transactions.csv"))) {
            reader.readLine(); // skip header
            String line;
            while ((line = reader.readLine()) != null) {
                String[] p = line.split(";");
                transactions.add(new Transaction(
                        Integer.parseInt(p[0]),
                        Integer.parseInt(p[1]),
                        LocalDate.parse(p[2], dateFormatter),
                        p[3],
                        Double.parseDouble(p[4].replace(",", ".")),
                        p[5],
                        p[6],
                        Integer.parseInt(p[7])
                ));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return transactions;
    }

    public ArrayList<Stock> loadStocks() {
        ArrayList<Stock> stocks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("stockMarket.csv"))) {
            reader.readLine(); // skip header
            String line;
            while ((line = reader.readLine()) != null) {
                String[] p = line.split(";");
                stocks.add(new Stock(
                        p[0],
                        p[1],
                        p[2],
                        Double.parseDouble(p[3].replace(",", ".")),
                        p[4],
                        p[5],
                        Double.parseDouble(p[6].replace(",", ".")),
                        p[7],
                        LocalDate.parse(p[8], dateFormatter)
                ));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stocks;
    }

    public ArrayList<Currency> loadCurrencies() {
        ArrayList<Currency> currencies = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("currency.csv"))) {
            reader.readLine(); // skip header
            String line;
            while ((line = reader.readLine()) != null) {
                String[] p = line.split(";");
                currencies.add(new Currency(
                        p[0],
                        p[1],
                        Double.parseDouble(p[2].replace(",", ".")),
                        LocalDate.parse(p[3], dateFormatter)
                ));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return currencies;
    }
}

