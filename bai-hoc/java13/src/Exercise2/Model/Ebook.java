package Exercise2.Model;

import Exercise2.Model.BookModel;

public class Ebook extends BookModel {
    private int year;
    private double capacity;
    private String image;
    private long downloads;

    public Ebook(int id, String name, String[] category, String publishingCompany, int year, double capacity, String image, long downloads) {
        super(id, name, category, publishingCompany);
        this.year = year;
        this.capacity = capacity;
        this.image = image;
        this.downloads = downloads;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getDownloads() {
        return downloads;
    }

    public void setDownloads(long downloads) {
        this.downloads = downloads;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + year + " - " + capacity + " - " + image + " - " + downloads;
    }
}
