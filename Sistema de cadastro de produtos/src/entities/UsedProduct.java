package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

    private LocalDate date;

    public UsedProduct(String name, Double price, LocalDate date) {
        super(name, price);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String priceTag() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%s (used) $ %.2f (Manufecture date: %s)", getName(), getPrice(),
                 date.format(formato));
    }



}
