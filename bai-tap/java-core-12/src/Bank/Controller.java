package Bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static Product.Menu.home;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static UserService service = new UserService();
    static ArrayList<User> users = service.getAllUser();
    static HistoryService historyService = new HistoryService();
    static ArrayList<History> histories = historyService.getAllHistory();


    public static void home() {
        boolean isContinue = true;

        while (isContinue) {
            Menu.home();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    login();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void login() {
        System.out.println("Nhập số điện thoại");
        String phoneNumber = sc.nextLine();
        System.out.println("Nhập mật khẩu");
        String password = sc.nextLine();


        boolean isValidPhoneNumber = false;
        while (!isValidPhoneNumber) {
            for (User u : users) {
                if (u.getPhoneNumber().equals(phoneNumber)) {
                    isValidPhoneNumber = true;
                    if (u.getPassword().equals(password)) {
                        loginSuccess();
                    } else {
                        System.out.println("Mật khẩu không chính xác");
                        login();
                    }
                }
            }
            if (!isValidPhoneNumber) {
                System.out.println("Kiểm tra lại số điện thoại");
            }
        }
    }

    public static void loginSuccess() {
        System.out.println("Xin chào. Bạn có thể thực hiện các công việc sau: ");
        boolean isContinue = true;

        while (isContinue) {
            Menu.mainLogin();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    service.showBalance(users);
                    break;
                case 2:
                    listBank();
                    break;
                case 3:
                    System.out.println("Lịch sử giao dịch của bạn");
                    historyService.show(histories);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void listBank() {
        boolean isContinue = true;

        while (isContinue) {
            Menu.bankList();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    transfersMoney();
                    break;
                case 2:
                    transfersMoney();
                    break;
                case 3:
                    transfersMoney();
                    break;
                case 0:
                    loginSuccess();
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void transfersMoney() {
        Random rd = new Random();
        int id = rd.nextInt(1,100)+1;
        LocalDate date = LocalDate.now();
        System.out.println("Nhập nội dung chuyển tiền:");
        String description = sc.nextLine();
        histories.add(new History(id,date,description,String.valueOf(inputAccount()),inputTranfer()));
    }

    public static long inputAccount(){
        long account = 0;
        boolean isContinue = true;

        while (isContinue) {
            try {
                System.out.println("Nhập số tài khoản chuyển đến");
                account = Long.parseLong(sc.nextLine());
                if (String.valueOf(account).length() < 8 && String.valueOf(account).length() > 16) {
                    throw new MyException("Số tài khoản không hợp lệ");
                }
                isContinue = false;
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại: ");
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
            }
        }
        return account;
    }

    public static long inputTranfer(){
        long money = 0;
        boolean isContinue = true;

        for (User u : users
             ) {
            while (isContinue){
                try {
                    System.out.println("Nhập số tiền chuyển đi:");
                    money = Long.parseLong(sc.nextLine());
                    if (money < 50000 && money > u.getAccountBalance()) {
                        throw new MyException("Số tiền phải lớn hơn 50.000 và nhỏ hơn số dư còn lại");
                    }
                    isContinue = false;
                }catch (MyException e){
                    System.out.println(e.getMessage());
                    System.out.println("Vui lòng nhập lại: ");
                }catch (NumberFormatException e){
                    System.out.println("Bạn phải nhập số");
                }
            }
            long newMoney = u.getAccountBalance() - money;
            u.setAccountBalance(newMoney);
        }
        return money;
    }




}
