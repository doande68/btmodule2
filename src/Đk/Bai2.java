package Đk;

public class Bai2 {
    public static void main(String[] args) {

    }
    public static void bai2(int n) {
        if (n >= 1 && n <= 9) {
            System.out.println("2. Cần rán 1 lần");
        }
        if (n > 9) {
            int i = n / 9;
            if (n - 9 * i == 0) {
                System.out.println("2. Cần rán " + i + " lần");
            }
            if (n - 9 * i >= 1 && n - 9 * i <= 9) {
                System.out.println("2. Cần rán " + (i + 1) + " lần");
            }
        }
    }

}
