package VongLap;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {

    }
    public static void checkSum() {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = input.nextInt();
        System.out.println("Enter number b");
        int b = input.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println("Tổng các số từ a đến b: " + sum);
    }
    public static void checkEvenTotal() {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = input.nextInt();
        System.out.println("Enter number b");
        int b = input.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if(i % 2==0){
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn từ a đến b: " + sum);
    }
    public static void sumOfSquares(){
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = input.nextInt();
        System.out.println("Enter number b");
        int b = input.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i * i ;
        }
        System.out.println("Tổng bình phương các số từ a đến b: " + sum);
    }
}
