package Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    static Scanner sc = new Scanner(System.in);
    static ClientService clientService = new ClientService();
    static ArrayList<Client> clients = clientService.getAllClient();

    public static void menu(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Xem thông tin toàn bộ khách hàng");
        System.out.println("[2] - Xem thông tin khách hàng nữ hoặc nam");
        System.out.println("[3] - Thêm khách hàng vào danh sách");
        System.out.println("[4] - Tìm thông tin khách hàng");
        System.out.println("[0] - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void mainMenu(){
        boolean isContinue = true;

        while (isContinue){
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Danh sách khách hàng: ");
                    clientService.show(clients);
                    break;
                case 2:
                    genderClientMenu();
                    break;
                case 3:
                    createClient();
                    break;
                case 4:
                    searhById();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void genderClient(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Xem thông tin khách hàng nữ");
        System.out.println("[2] - Xem thông tin khách hàng nam");
        System.out.println("[0] - Quay về menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void genderClientMenu(){
        boolean isContinue = true;

        while (isContinue){
            genderClient();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    clientService.showFemaleClient(clients);
                    break;
                case 2:
                    clientService.showMaleClient(clients);
                    break;
                case 0:
                    mainMenu();
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }


    public static void searchIdMenu(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Sửa tên khách hàng");
        System.out.println("[2] - Sửa giới tính khách hàng");
        System.out.println("[3] - Sửa địa chỉ khách hàng");
        System.out.println("[4] - Sửa số điện thoại khách hàng");
        System.out.println("[5] - Sửa email khách hàng");
        System.out.println("[6] - Xóa khách hàng khách hàng");
        System.out.println("[0] - Quay về menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void searhById(){

        String id = inputId();
        Client client = clientService.searchByID(clients,id);
        System.out.println("Khách hàng cần tìm: ");
        System.out.println(client);

        boolean isContinue = true;
        Gender gender = null;

        while (isContinue){
            searchIdMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập tên mới: ");
                    String newName = sc.nextLine();
                    clientService.changeNameClient(client,newName);
                    break;
                case 2:
                        System.out.println("Chọn giới tính");
                        System.out.println("1 - Nam");
                        System.out.println("2 - Nữ");
                        switch (choice){
                            case 1:
                                client.setGender(Gender.MALE);
                                break;
                            case 2:
                                client.setGender(Gender.FEMALE);
                                break;
                            default:
                                System.out.println("Không có lựa chọn này");
                        }
                    break;
                case 3:
                    System.out.println("Nhập địa chỉ mới: ");
                    String newAddress = sc.nextLine();
                    clientService.changeAddress(client,newAddress);
                    break;
                case 4:
                    clientService.changePhone(client,inputPhone());
                    break;
                case 5:
                    clientService.changeEmail(client,inputEmail());
                    break;
                case 6:
                    Client deleteClient = clientService.searchByID(clients,id);
                    if (clients.remove(deleteClient)){
                        System.out.println("Xóa thành công");
                    }else {
                        System.out.println("Xóa thất bại");
                    }
                    break;
                case 0:
                    mainMenu();
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static String inputEmail(){
        boolean isValidateEmail = false;
        String email = null;
        while (!isValidateEmail){
            System.out.println("Nhập email: ");
            email = sc.nextLine();
            if(!Validate.validateEmail(email)){
                System.out.println("Email không hợp lệ");
            }
            else {
                for (Client c: clients
                     ) {
                    if (c.getEmail().equals(email)){
                        System.out.println("Email đã tồn tại");
                    }else {
                        isValidateEmail = true;
                    }
                }
            }
        }
        return email;
    }

    public static String inputPhone(){
        boolean isValidatePhone = false;
        String phone = null;
        while (!isValidatePhone){
            System.out.println("Nhập số điện thoại: ");
            phone = sc.nextLine();
            if(!Validate.validatePhone(phone)){
                System.out.println("Số điện thoại không hợp lệ");
            }else {
                isValidatePhone = true;
            }
        }
        return phone;
    }


    public static String inputId() {
        boolean isValidate = false;
        String id = null;
        while (!isValidate){
            System.out.println("Nhập ID khách hàng muốn tìm");
            id = sc.nextLine();
            if (Validate.validateId(id)){
                System.out.println("ID không hợp lệ");
            }
            else {
                isValidate = true;
            }
        }
        return id;
    }

    public static void createClient(){
        Gender gender = null;
        System.out.println("Nhập tên khách hàng: ");
        String name = sc.nextLine();
        System.out.println("Chọn giới tính");
        System.out.println("1 - Nam");
        System.out.println("2 - Nữ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                gender = Gender.MALE;
                break;
            case 2:
                gender = Gender.FEMALE;
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        String phone = inputPhone();
        String email = inputEmail();

        Client newClient = new Client(name,gender,address,phone,email);
        clients.add(newClient);
        for (Client c: clients
             ) {

            if (!newClient.getId().equals(c.getId())){
                System.out.println("Thêm khách hàng thành công");
                break;
            }else {
                System.out.println("Id đã tồn tại");
                clients.remove(newClient);
                break;
            }
        }
    }

}
