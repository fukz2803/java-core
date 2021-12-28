import java.util.Scanner;

public class StudentService {
    public Students createStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap diem ly thuyet: ");
        double diemLyThuyet = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap diem thuc hanh: ");
        double diemThucHanh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten truong: ");
        String school = sc.nextLine();

        Students student = new Students(id, name, diemLyThuyet, diemThucHanh, school);

        return student;

    }

    public double diemTB(double diemLyThuyet, double diemThucHanh) {
        return (diemLyThuyet + diemThucHanh) / 2;
    }


    public Students[] addStudent(int size) {
        Students[] students = new Students[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap thong tin hoc vien thu: " + i);
            students[i] = createStudent();
        }
        return students;
    }

    public void show(Students[] tenmang) {
        for (Students s : tenmang
        ) {

            System.out.println(s + " - " + diemTB(s.diemLyThuyet, s.diemThucHanh));

        }
    }

}
