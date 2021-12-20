import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Kiem tra hai chuoi bang nhau

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chuoi 1: ");
        String str1 = sc.nextLine();
        System.out.println("Nhap chuoi 2: ");
        String str2 = sc.nextLine();

        String ketqua1 = str1 == str2 ? "Hai chuoi bang nhau" : "Hai chuoi khac nhau";
        System.out.println(ketqua1);

        // // Kiem tra kich thuoc hai chuoi bang nhau

        System.out.println("Nhap chuoi 1: ");
        String str3 = sc.nextLine();
        System.out.println("Nhap chuoi 2: ");
        String str4 = sc.nextLine();

        String ketqua2 = str3.length() == str4.length() ? "Hai chuoi co kich thuoc bang nhau" : "Hai chuoi co kich thuoc khac nhau";
        System.out.println(ketqua2);

        // Tinh diem trung binh
        System.out.println("Nhap diem Thuc hanh: ");
        int diemThuchanh = sc.nextInt();
        System.out.println("Nhap diem Ly thuyet: ");
        int diemLythuyet = sc.nextInt();

        int diemTrungBinh = (diemThuchanh + diemLythuyet)/2;
        System.out.println("Diem Trung binh cua ban la " + diemTrungBinh);
        
        // Thong bao ket qua
        String thongBao = diemTrungBinh > 6 ? "Ban da dat" : "Ban da truot";
        System.out.println(thongBao);
    }
}
