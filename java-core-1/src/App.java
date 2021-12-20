public class App {
    public static void main(String[] args) throws Exception {
        
        // cong tru nhan chia 2 so
        System.out.println(Calculator.cong(3, 5));
        System.out.println(Calculator.tru(84, 5));
        System.out.println(Calculator.nhan(21, 7));
        System.out.println(Calculator.chia(50, 5));


        // BMI tra ve kieu double
        double canNang = 53;
        double chieuCao = 1.69;
        double bmical = canNang/(chieuCao*chieuCao);
        System.out.println("Ket qua BMI cua ban la " +bmical);

        // BMI tra ve kieu double co truyen tham so
        System.out.println(bmi2(1.69, 53));

        // BMI tra ve kieu void
        bmivoid();
    }

    public static double bmi2 (double height, double weight){
        return weight/(height*height);
    }

    public static void bmivoid() {
        double canNang = 53;
        double chieuCao = 1.69;
        double bmical = canNang/(chieuCao*chieuCao);
        System.out.println("Ket qua BMIvoid cua ban la " + bmical);
    }

    // Nhan xet: phuong thuc tra ve kieu double co truyen tham so la tot nhat, vi co the thay doi so lieu sau nay
    
}
