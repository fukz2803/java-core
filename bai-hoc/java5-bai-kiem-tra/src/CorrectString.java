import java.util.Locale;
import java.util.Scanner;

public class CorrectString {
    public static String scan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên bạn: ");
        String name = sc.nextLine();
        System.out.println("Chuỗi trước khi chuẩn hóa: " + name);
        return name;

    }

    public static void correct(String s){
        s = s.toLowerCase();
        String [] ss = s.split(" ");
        String s2 = "";
        for (int i = 0; i< ss.length; i++){
            String s1 = "";
            if (ss[i].length() != 0){
                s1+= Character.toUpperCase(ss[i].charAt(0));
                if (ss[i].length()>1) {
                    s1+= ss[i].substring(1);
                    s2+= s1;
                    if (i < ss.length){
                        s2+=" ";
                    }
                }
            }
        }
        if (s2.charAt(s2.length()-1) == ' '){
            s2+= "\b";
        }
        System.out.println("Chuỗi sau khi chuẩn hóa: " + s2);

    }

    public static boolean istPalindrom(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void check(){
        char kyTu;
        for (int i = 0; i < scan().length();i++){
            kyTu = scan().charAt(scan().length()-i-1);
            if (scan().charAt(i) == kyTu){
                System.out.println("Chuỗi này là chuỗi Panlyndrome");
                break;
            }
            else {
                System.out.println("Chuỗi này không là chuỗi Panlyndrome");
                break;
            }
        }
    }

}
