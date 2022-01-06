public class Product {
    private int id;
    private String name;
    private long price;
    private String typeOfProduct;
    private int sellAmount;

    public Product(int id, String name, long price, String typeOfProduct, int sellAmount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.typeOfProduct = typeOfProduct;
        this.sellAmount = sellAmount;
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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public int getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(int sellAmount) {
        this.sellAmount = sellAmount;
    }

    @Override
    public String toString() {
        return id +
                " - Tên sản phẩm: " + name + " - Giá bán:" + price + " - Loại mặt hàng:" + typeOfProduct + " - Số lượng bán:" + sellAmount;
    }
}
