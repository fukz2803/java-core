//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class PersonService {
//    public static void show(ArrayList<Person> list){
//        for (Person p : list
//        ) {
//            System.out.println(p);
//        }
//    }
//    ArrayList<Person> list = new ArrayList<>();
//        list.add(new Person("A",28,"HN"));
//        list.add(new Person("D",27,"CB"));
//        list.add(new Person("B",26,"DN"));
//
//        System.out.println("Danh sach ban dau:");
//    show(list);
//
////        Collections.sort(list);
////        System.out.println("Danh sach sau sap xep:");
////        show(list);
//
//        Collections.sort(list, new Comparator<Person>() {
//        @Override
//        public int compare(Person o1, Person o2) {
//            return o1.getName().compareTo(o2.getName());
//        }
//    });
//
//        System.out.println("sap xep theo ten: ");
//    show(list);
//
//        Collections.sort(list, new Comparator<Person>() {
//        @Override
//        public int compare(Person o1, Person o2) {
//            return o1.getAge() - o2.getAge();
//        }
//    });
//
//        System.out.println("sap xep theo tuoi");
//    show(list);
//
//}
