package WildCard;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"A",8));
        students.add(new Student(2,"B",7));
        students.add(new Student(3,"C",6));

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher(1,"X",8000000));
        teachers.add(new Teacher(2,"Y",7000000));
        teachers.add(new Teacher(3,"Z",6000000));

//        System.out.println("Danh sach sinh vien: ");
//        showStudent(students);
//        System.out.println("Danh sach giao vien: ");
//        showTeacher(teachers);

        show(students);
        show(teachers);


    }

    public static void showStudent(ArrayList<Student> students){
        for (Student s : students
             ) {
            System.out.println(s);
        }
    }

    public static void showTeacher(ArrayList<Teacher> teachers){
        for (Teacher t : teachers
        ) {
            System.out.println(t);
        }
    }

    public static void show(ArrayList<?> list){
        for (Object o : list
             ) {
            System.out.println(o);
        }
    }
}
