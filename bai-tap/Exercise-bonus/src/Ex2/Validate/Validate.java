package Ex2.Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    public static boolean validatePhone(String s) {
        Pattern p = Pattern.compile("^\\d{10}$");
        Matcher m = p.matcher(s);
        return (m.matches());
    }

    static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
    static final String ID_REGEX = "^\\d{9}$";

    public static boolean validateEmail(String email){
        if(email.matches(EMAIL_REGEX)){
            return true;
        }else {
            return false;
        }
    }


    public static boolean validateId(String id){
        Pattern p = Pattern.compile("^\\d{9}$");
        Matcher m = p.matcher(id);
        return (m.matches());
    }
}
