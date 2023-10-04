package VongLap;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
divisor();
    }

    public static void divisor() {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = input.nextInt();
        System.out.println("Các ước số nguyên dương của " + n + "là :");
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.println(i);
            }
        }
        System.out.println("Các bội số của"+ n +"nhỏ hơn 100 là :");
        for (int i = 1; i*n < 100 ; i++) {
            System.out.println(i*n);
        }
    }
}
