package Exercise2.Model;

import Exercise2.Model.BookModel;

public class TextBook extends BookModel {
    private int publishingYear;
    private int quantity;
    private int pages;
    private String author;

    public TextBook(int id, String name, String[] category, String publishingCompany, int publishingYear, int quantity, int pages, String author) {
        super(id, name, category, publishingCompany);
        this.publishingYear = publishingYear;
        this.quantity = quantity;
        this.pages = pages;
        this.author = author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + publishingYear + " - " + quantity + " - " + pages + " - " + author;
    }
}
