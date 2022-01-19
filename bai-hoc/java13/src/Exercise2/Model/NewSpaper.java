package Exercise2.Model;

import Exercise2.Model.BookModel;

import java.time.LocalDate;

public class NewSpaper extends BookModel {
    private LocalDate date;
    private int quantity;
    private int pages;

    public NewSpaper(int id, String name, String[] category, String publishingCompany, LocalDate date, int quantity, int pages) {
        super(id, name, category, publishingCompany);
        this.date = date;
        this.quantity = quantity;
        this.pages = pages;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + date + " - " + quantity + " - " + pages;
    }
}
