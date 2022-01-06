import java.util.ArrayList;

public class ListString {
    public static void listString(){
        ArrayList<String> name = new ArrayList<>();
       name.add("John");
       name.add("Tina");
       name.add("Vitor");

       for (String s : name){
           System.out.println(s + "\t");
       }

       name.remove("Tina");
        System.out.println("\nDanh sach sau khi xoa");
        for (String s : name){
            System.out.println(s + "\t");
        }
    }
}
