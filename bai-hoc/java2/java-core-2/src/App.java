import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) throws Exception {
        // LocalDate toDay =  LocalDate.now();
        // System.out.println(toDay);

        // LocalDate date = LocalDate.of(2021, 12, 18);

        // System.out.println(date);

        // LocalDate currentDate = LocalDate.of(2021, 10, 29);
        // System.out.println(currentDate);
        // System.out.println("hom qua: " + toDay.minusDays(1));

        // LocalTime time = LocalTime.now();
        // System.out.println(time);

        // LocalTime time2 = LocalTime.of(20, 22, 51);
        // System.out.println(time2);

        // scan.usingScanner();

       

        System.out.println(canhHuyen(3,4));
    }
    public static double canhHuyen(double a, double b) {
        return  Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
        
    }
}

