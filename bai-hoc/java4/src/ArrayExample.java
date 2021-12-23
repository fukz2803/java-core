public class ArrayExample {
    public static int[] createArray(){
        int[] intArray = new int[5];
        intArray[0] = 1;
        intArray[1] = 5;
        intArray[2] = 7;
        intArray[3] = 2;
        intArray[4] = 6;
        return intArray;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
//            System.out.printf("min = %d\n",min);
//            System.out.printf("intArray[%d] = %d\n", i , intArray[i]);
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int[] sortArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }

}
