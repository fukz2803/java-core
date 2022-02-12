package Controller;

import Menu.Menu;
import Model.Cart;
import Model.Category;
import Model.Product;
import Model.User;
import Service.CartService;
import Service.ProductService;
import Service.UserService;
import Validate.Validate;



import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static ProductService service = new ProductService();
    static ArrayList<Product> products = service.repo.getAllProduct();
    static UserService userService = new UserService();
    static ArrayList<User> users = userService.getAllUser();
    static CartService cartService = new CartService();
    static ArrayList<Cart> carts = cartService.getAllItem();

    public static void mainMenu() {
        boolean isContinue = true;

        while (isContinue) {
            Menu.home();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    service.showAll(products);
                    break;
                case 2:
                    categoryMenu();
                    break;
                case 3:
                    System.out.println("Nhập hãng sản xuất bạn muốn tìm: ");
                    String brand = sc.nextLine();
                    service.getProductByBrand(brand);
                    break;
                case 4:
                    priceMenu();
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
                    String name = sc.nextLine();
                    service.searchProductByName(name);
                    break;
                case 6:
                    login();
                    break;
                case 7:
                    createNewAccount();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void categoryMenu() {
        boolean isContinue = true;

        while (isContinue) {
            Menu.menuCategory();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    service.getProductByCategory(Category.CPU);
                    break;
                case 2:
                    service.getProductByCategory(Category.MAINBOARD);
                    break;
                case 3:
                    service.getProductByCategory(Category.RAM);
                    break;
                case 4:
                    service.getProductByCategory(Category.VGA);
                    break;
                case 5:
                    service.getProductByCategory(Category.CASE);
                    break;
                case 6:
                    service.getProductByCategory(Category.PSU);
                    break;
                case 0:
                    mainMenu();
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void priceMenu() {
        boolean isContinue = true;

        while (isContinue) {
            Menu.menuPrice();
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 0) {
                mainMenu();
            }
            service.getProductByPrice(choice);
        }
    }

    public static Product idSearch() {
        System.out.println("Nhập id sản phẩm bạn muốn tìm: ");
        int id = Integer.parseInt(sc.nextLine());
        Product product = service.searchById(id);
        return product;
    }

    public static ArrayList<Cart> addToCart(User user, Product product) {
        System.out.println("Đã thêm hàng vào giỏ");
        carts.add(new Cart(user.getId(), product.getId(), product.getName(),
                product.getDescription(), product.getPrice(),
                product.getAmount(), product.getAmountSale(),
                product.getBrand(), product.getCategory()));
        return carts;

        //add vào arraylit chưa
    }

    public static void login() {
        System.out.println("Nhập username: ");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();

        boolean isValidUsername = false;
        while (!isValidUsername) {
            for (User u : users) {
                if (u.getUsername().equals(username)) {
                    isValidUsername = true;
                    if (u.getPassword().equals(password)) {
                        loginSuccess(u);
                    } else {
                        System.out.println("Mật khẩu không chính xác");
                        loginFail();
                    }
                }
            }
            if (!isValidUsername) {
                System.out.println("Kiểm tra lại tên đăng nhập");
            }
        }
    }

    public static void loginSuccess(User user) {
        System.out.println("Chào mừng " + user.getUsername() + ", bạn có thể thực hiện các công việc sau");
        boolean isCheck = true;
        while (isCheck) {
            Menu.loginSuccessMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    changeUserName(user);
                    break;
                case 2:
                    changeEmail(user);
                    break;
                case 3:
                    changePassword(user);
                    break;
                case 4:
                    Product product = idSearch();
                    addToCart(user,product);
                    break;
                case 5:
                    showAllItem(user);
                    break;
                case 6:
                    isCheck = false;
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void changeUserName(User user) {

        user.setUsername(inputUsername());
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(user);
    }

    public static void changeEmail(User user) {
        user.setEmail(inputEmail());
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(user);
    }

    public static void changePassword(User user) {
        user.setPassword(inputPassword());
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(user);
    }

    public static void showAllItem(User user) {
        for (Cart c : carts) {
            if (c.getIdAccount().equals(user.getId())) {
                System.out.println(c);
            }
        }
    }

    public static void loginFail() {
        while (true) {
            Menu.loginFailMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    handleForgotPassword();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");

            }
        }
    }

    public static void handleForgotPassword() {
        boolean isRightEmail = false;
        while (!isRightEmail) {
            System.out.println("Nhập email của bạn: ");
            String email = sc.nextLine();
            User user = userService.checkEmail(users, email);
            if (user != null) {
                isRightEmail = true;
                user.setPassword(inputPassword());
            }
        }
        System.out.println("Cập nhật mật khẩu thành công");
        login();
    }

    public static void createNewAccount() {
        String username = inputUsername();
        String password = inputPassword();
        String email = inputEmail();

        users.add(new User(username, email, password));
        System.out.println("Đăng kí thành công");
    }

    public static String inputUsername() {
        boolean isValidUsername = false;
        String username = null;
        while (!isValidUsername) {
            System.out.println("Nhập username: ");
            username = sc.nextLine();
            for (User user : users) {
                if (user.getUsername().equals(username)) {
                    System.out.println("Username đã tồn tại");
                } else {
                    isValidUsername = true;
                }
            }
        }
        return username;

    }

    public static String inputEmail() {
        boolean isValidEmail = false;
        String email = null;
        while (!isValidEmail) {
            System.out.println("Nhập email: ");
            email = sc.nextLine();
            if (!Validate.validateEmail(email)) {
                System.out.println("Email không hợp lệ");
            } else {
                for (User user : users) {
                    if (user.getEmail().equals(email)) {
                        System.out.println("Email đã tồn tại");
                    } else {
                        isValidEmail = true;
                    }
                }
            }

        }
        return email;
    }

    public static String inputPassword() {
        boolean isValidPassword = false;
        String password = null;
        while (!isValidPassword) {
            System.out.println("Nhập mật khẩu: ");
            password = sc.nextLine();

            if (!Validate.validatePassword(password)) {
                System.out.println("Mật khẩu không hợp lệ");
            } else {
                isValidPassword = true;
            }
        }
        return password;
    }



}
