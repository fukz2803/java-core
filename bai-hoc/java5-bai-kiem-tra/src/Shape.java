public class Shape {
    public static void square(){
        for (int i = 0; i< 4; i++){
            for (int j = 0; j< 4; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void triangle(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j <= i) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

}
