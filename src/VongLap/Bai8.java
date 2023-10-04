package VongLap;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {

    }

    public static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = input.nextInt();
        System.out.println("Nhập s :");
        int s = input.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    if (i + j + k == s) {
                        System.out.println("X = " + i + "; Y = " + j + "; Z = " + k);
                    }
                }

            }

        }
    }
}
