import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(7);
//        list.add(5);
//        list.add(2);
//        list.add(9);
//        list.add(4);
//        list.add(1);
//        System.out.println(list);
//
//        Iterator<Integer> itr = list.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }

//        Queue<Integer> listInt = new PriorityQueue<>();
//        listInt.add(5);
//        listInt.offer(6);
//        listInt.add(2);
//        listInt.add(3);
//        listInt.add(9);
//
//        System.out.println(listInt);
//        System.out.println("phan tu dau tien : " + listInt.poll());
//        System.out.println(listInt);


//        Sap xep thu tu tang dan, ko trung lap
//        Set<Integer> list = new HashSet<>();
//        list.add(7);
//        list.add(5);
//        list.add(2);
//        list.add(9);
//        list.add(4);
//        list.add(1);
//        list.add(1);
//
//        System.out.println(list);

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"A");
        map.put(9,"B");
        map.put(4,"C");
        map.put(6,"D");
        map.put(8,"E");
        map.put(8,"F");

        System.out.println(map);

        for (Map.Entry<Integer,String> entry : map.entrySet()
             ) {
            System.out.println(entry.getKey()+ " - " + entry.getValue());
        }


    }
}

