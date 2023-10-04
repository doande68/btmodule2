package VongLap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
       checkOdd();
    }
    public static void checkOdd(){
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = input.nextInt();
        System.out.println("Enter number b");
        int b = input.nextInt();
        for (int i = a; i <= b ; i++) {
            if(i % 2 != 0){
                System.out.println("Số lẻ từ A đến B là " + i);
            }
        }
    }
   public static void check(){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter number a");
       int a = input.nextInt();
       System.out.println("Enter number b");
       int b = input.nextInt();
       for (int i = a; i <= b ; i++) {
           if( i % 3 == 0){
               System.out.println("Fizz");
           }
           if(i % 5 == 0){
               System.out.println("Buzz");
           }
           if(i % 3 == 0 && i % 5 == 0){
               System.out.println("Fizz Buzz");
           }
       }
   }
   public static void checkOfficial(){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter number a");
       int a = input.nextInt();
       System.out.println("Enter number b");
       int b = input.nextInt();
       for (int i = a; i <= b ; i++) {

       }
   }
}
