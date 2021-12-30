public class Product {
    public int id;
    public String name;
    public int quantily;
    public String unit;
    public int giaNhap;
    public int giaBan;
    public int sellNumber;

    public Product(int id, String name, int quantily, String unit, int giaNhap, int giaBan, int sellNumber) {
        this.id = id;
        this.name = name;
        this.quantily = quantily;
        this.unit = unit;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.sellNumber = sellNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantily=" + quantily +
                ", unit=" + unit +
                ", giaNhap=" + giaNhap +
                ", giaBan=" + giaBan +
                ", sellNumber=" + sellNumber +
                '}';
    }
}
