package VongLap;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {

    }
    public static void count(){
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = input.nextInt();
         double sum = 0.0;
        for (int i = 1; i <= n ; i++) {
            sum += i * (i+1);
        }
        System.out.println(sum);
    }
    public static void count2(){
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = input.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n ; i++) {
            sum += ((2*i +1)/(2*i+2));
        }
        System.out.println(sum);
    }
    public static void count3(){
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = input.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n ; i++) {
            sum += ((i*(i+1))/((i+1)*(i+2)));
        }
        System.out.println(sum);
    }
}
