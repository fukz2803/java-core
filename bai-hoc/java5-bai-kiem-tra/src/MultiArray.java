import java.util.Scanner;

public class MultiArray {

    public static int[][] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng mảng: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột mảng: ");
        int col = sc.nextInt();

        int [][] multiArr = new int[row][col];

        for (int i = 0; i < multiArr.length; i++){
            for (int j = 0; j < multiArr[i].length; j++){
                System.out.printf("Nhập phần tử muliArr[%d][%d]: ", i, j);
                multiArr[i][j] = sc.nextInt();
            }
        }

        return multiArr;
    }

    public static void printArray(int[][] multiArr){
        for(int i = 0; i < multiArr.length; i++){
            for(int j = 0; j <multiArr[i].length; j++){
                System.out.print(multiArr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void duongCheoChinh(int[][] multiArr){
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                if (multiArr[i] == multiArr[j]) {
                    System.out.print(multiArr[i][j] + "\t");
                }

            }
            System.out.println();
        }
    }
}
