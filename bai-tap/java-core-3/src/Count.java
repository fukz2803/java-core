public class Count {
    public static void demKiTu() {
        String str = "You only live once, but if you do it right, once is enough";
        int count = 0;
        char kyTu = 'o';

        System.out.println("Cho chuỗi: " + str);

        System.out.println("Chữ 'o' xuất hiện ở các vị trí: ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
                System.out.println(str.indexOf(kyTu,i));
            }
        }

        System.out.println("Số lần chữ 'o' xuất hiện trong chuỗi là: " + count);

    }
}
