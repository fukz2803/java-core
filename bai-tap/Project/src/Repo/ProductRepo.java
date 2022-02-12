package Repo;

import Model.Category;
import Model.Product;

import java.util.ArrayList;

public class ProductRepo {

    public ArrayList<Product> getAllProduct(){
        ArrayList<Product> listProduct = new ArrayList<>();

        listProduct.add(new Product(1, "CPU Intel Core i3 10300", "3.70 Up to 4.40GHz, 8M, 4 Cores 8 Threads", 3890000, 500, 350, "Intel", Category.CPU));
        listProduct.add(new Product(2, "CPU Intel Core i5 11400", "2.60 Up to 4.40GHz, 12M, 6 Cores 12 Threads", 4290000, 600, 450, "Intel", Category.CPU));
        listProduct.add(new Product(3, "CPU Intel Core i7 11700K", "3.60 Up to 5.00GHz, 16M, 8 Cores 16 Threads", 9390000, 200, 100, "Intel", Category.CPU));
        listProduct.add(new Product(4, "CPU Intel Core i9 11900K", "3.50 Up to 5.30GHz, 16M, 8 Cores 16 Threads", 13990000, 300, 150, "Intel", Category.CPU));
        listProduct.add(new Product(5, "Mainboard Asus TUF Z390M-Pro Gaming", "Socket 1151 9th/8th Gen Intel Core, Pentium Gold and Celeron", 4950000, 400, 150, "ASUS", Category.MAINBOARD));
        listProduct.add(new Product(6, "Mainboard Gigabyte B365M D3H", "Socket 1151, Chipset: B365", 2030000, 500, 350, "GIGABYTE", Category.MAINBOARD));
        listProduct.add(new Product(7, "Mainboard Asus Z490-P Prime", "LGA 1200/ ATX/ VRM 10+1/ DDR4/ AURA Sync", 3950000, 300, 250, "Asrock", Category.MAINBOARD));
        listProduct.add(new Product(8, "Mainboard MSI X570 Gaming Pro CARBON", "Socket: AM4, Chipset: X570", 5600000, 200, 150, "MSI", Category.MAINBOARD));
        listProduct.add(new Product(9, "Ram DDR4 Kingmax 4G", "4G/2666 Không Tản Nhiệt", 495000, 200, 150, "Kingmax", Category.RAM));
        listProduct.add(new Product(10, "Ram DDR4 Corsair 8G", "8G/2666 Vengeance LPX", 820000, 250, 100, "Corsair", Category.RAM));
        listProduct.add(new Product(11, "Ram DDR4 Gigabyte 16G", "16G/3600 Aorus RGB", 3150000, 220, 100, "GIGABYTE", Category.RAM));
        listProduct.add(new Product(12, "Ram DDR4 Server Samsung 32G", "32G/2666 ECC Registered Server Memory", 4390000, 100, 50, "SAMSUNG", Category.RAM));
        listProduct.add(new Product(13, "Thùng máy Case Deepcool", "Matrexx 55 V3 ADD-RGB 3F", 158000, 200, 50, "Deepcool", Category.CASE));
        listProduct.add(new Product(14, "Thùng máy Case Xigmatek X3 ZAKU", "Premium Gaming M-ATX", 145000, 120, 50, "Xigmatek", Category.CASE));
        listProduct.add(new Product(15, "Thùng máy Case Sama W01 Mid Tower", "W01 Mid Tower (No Fan)", 790000, 130, 56, "Sama", Category.CASE));
        listProduct.add(new Product(16, "Thùng máy Case E-Dra Da Vinci RGB", "E-Dra Da Vinci RGB (No Fan)", 750000, 150, 50, "Edra", Category.CASE));
        listProduct.add(new Product(17, "Nguồn Asus ROG Thor 1200W", "RGB 80 Plus Platinum", 9200000, 250, 80, "ASUS", Category.PSU));
        listProduct.add(new Product(18, "Nguồn Corsair 1000W", "RM1000x 80 Plus Gold Full Modular", 2900000, 150, 50, "Corsair", Category.PSU));
        listProduct.add(new Product(19, "Nguồn Asus ROG Thor 850W", "RGB 80 Plus Platinum", 6280000, 100, 50, "Edra", Category.PSU));
        listProduct.add(new Product(20, "Nguồn Jetek 600W", "P600 RGB 80 Plus Bronze", 1580000, 120, 70, "Edra", Category.PSU));
        listProduct.add(new Product(21, "VGA EVGA RTX 3080Ti 12G", "GDDR6X FTW3 Ultra Gaming (12G-P5-3967-KR)", 43500000, 120, 50, "EVGA", Category.VGA));
        listProduct.add(new Product(22, "VGA Nvidia QUADRO P2000", "5G GDDR5", 10490000, 130, 70, "NVIDIA", Category.VGA));
        listProduct.add(new Product(23, "VGA Asus RTX 2080Ti 11G", "GDDR6 Turbo", 34250000, 140, 78, "ASUS", Category.VGA));
        listProduct.add(new Product(24, "VGA Zotac GTX 1060 6G", "GDDR5X AMP Edition", 7290000, 160, 90, "Edra", Category.VGA));

        return listProduct;
    }

}
