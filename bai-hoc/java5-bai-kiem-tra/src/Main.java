public class Main {
    public static void main(String[] args) {
//        Câu 1
        Shape.square();
//        Shape.triangle();

//        Câu 2
        Loop.strCount();
        System.out.println();

//        Câu 3
        Loop.randomNumber();
        System.out.println();

//        Câu 4
        Loop.tenNumbers();
        System.out.println();


//        Câu 5
        String str = CorrectString.scan();
        CorrectString.correct(str);


//        Câu 6
        int [][] multiArray = MultiArray.inputArray();

        System.out.println("Mảng đa chiều:");
        MultiArray.printArray(multiArray);

        System.out.println("Đường chéo chính là: ");
        MultiArray.duongCheoChinh(multiArray);
    }
}
