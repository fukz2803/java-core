import java.util.Scanner;

public class ProductService {
    public Product createProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập số lượng: ");
        int quantily = Integer.parseInt(sc.nextLine());
        System.out.println("Lựa chọn đơn vị tính: ");
        String unit = sc.nextLine();
        System.out.println("Nhập giá gốc: ");
        int giaNhap = sc.nextInt();
        System.out.println("Nhập giá bán: ");
        int giaBan = sc.nextInt();
        System.out.println("Nhập số lượng bán: ");
        int sellNumber = sc.nextInt();

        Product newProduct = new Product(id, name, quantily, unit, giaNhap, giaBan, sellNumber);
        return newProduct;
    }

    public int tienLai(int giaNhap, int giaBan, int sellNumber) {
        return (giaBan - giaNhap) * sellNumber;
    }

    public Product[] addProduct(int size) {
        Product[] products = new Product[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập sản phẩm thứ: " + i);
            products[i] = createProduct();
        }
        return products;
    }

    public void show(Product[] products) {
        for (Product p : products
        ) {
            System.out.println(p +" Tiền lãi sản phẩm là: "+ tienLai(p.giaNhap,p.giaBan,p.sellNumber) + " VND");
        }
    }
}
