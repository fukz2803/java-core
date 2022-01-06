import java.util.ArrayList;
import java.util.Collections;

public class ListInteger {

    public static void listNumber(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(14);
        numbers.add(12);
        numbers.add(11);
        numbers.add(51);

//        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++){
            System.out.print(numbers.get(i)+ "\t") ;
        }

        System.out.println();

        numbers.add(40);
        numbers.add(3,99);

        numbers.remove(7);

        for (Integer i : numbers
        ) {
            System.out.print(i + "\t");
        }

        System.out.println("\nDanh sach sap xep tang dan");
        Collections.sort(numbers);
        for (Integer i : numbers
        ) {
            System.out.print(i + "\t");
        }

        System.out.println("\nDanh sach giam dan");
        Collections.reverse(numbers);
        for (Integer i : numbers
        ) {
            System.out.print(i + "\t");
        }


        System.out.println("\nDanh sach dao?");
        Collections.shuffle(numbers);
        for (Integer i : numbers
        ) {
            System.out.print(i + "\t");
        }
    }
}
