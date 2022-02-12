import Controller.Controller;
import Model.Category;
import Service.ProductService;

public class Main {
    public static void main(String[] args) {
//        Controller.mainMenu();
        ProductService service = new ProductService();
        service.sortCategoryByPriceLTH(Category.MAINBOARD);
    }

}
