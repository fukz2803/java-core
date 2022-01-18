package Product;

public class Product {
    private int id;
    private String name;
    private String description;
    private long price;
    private int quantity;
    private int soldQuantity;
    private String manufacturer;
    private String category;

    public Product(int id, String name, String description, long price, int quantity, int soldQuantity, String manufacturer, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.soldQuantity = soldQuantity;
        this.manufacturer = manufacturer;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return
                "Mã sản phẩm = " + id +
                " - Tên sản phẩm = " + name +
                " - Mô tả = " + description +
                " - price = " + price +
                " - quantity = " + quantity +
                " - soldQuantity = " + soldQuantity +
                " - manufacturer = " + manufacturer +
                " - category = " + category
                ;
    }
}
