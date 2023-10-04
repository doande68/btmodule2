package VongLap;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
               plan();
    }
    public static void plan(){
        Scanner input = new Scanner(System.in);
        int targetAmount = 2000;
        int count = 0;
        for (int i = 0; i <= targetAmount; i++) {
            for (int j = 0; j <= targetAmount ; j++) {
                for (int k = 0; k <= targetAmount ; k++) {
                    int total = i * 1000 + j * 2000 + k * 5000;
                    if (total == targetAmount){
                        System.out.println("Phương án " + ++count + ":");
                        System.out.println("Số mệnh giá 1000 đồng: " + i);
                        System.out.println("Số mệnh giá 2000 đồng: " + j);
                        System.out.println("Số mệnh giá 5000 đồng: " + k);
                    }
                }
            }
        }
    }
}
