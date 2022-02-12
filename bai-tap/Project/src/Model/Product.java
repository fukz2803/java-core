package Model;

import Util.Util;

public class Product {
    private int id;
    private String name;
    private String description;
    private long price;
    private int amount;
    private int amountSale;
    private String brand;
    private Category category;

    public Product(int id, String name, String description, long price, int amount, int amountSale, String brand, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.amountSale = amountSale;
        this.brand = brand;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmountSale() {
        return amountSale;
    }

    public void setAmountSale(int amountSale) {
        this.amountSale = amountSale;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return  id + " - " + name + " - " + description + " - " + "Giá: " + Util.formatMoney(price) + "đ " + " - " + "Số lượng: " + amount + " - " + "Số lượng đã bán: " + amountSale + " - " + brand + " - " + category.getValue();
    }
}
