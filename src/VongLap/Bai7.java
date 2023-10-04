package VongLap;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        readInteger();
    }

    public static void readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương có môt chữ số:");
        int so = scanner.nextInt();
        String chuoi = "";
//        int chuc = ( so /10)% 10;
//        if(chuc == 1){
//            chuoi += "Mười";
//        }
//        else if(chuc == 0){
//            chuoi = "";
//        } else {
//            chuoi += layChuoi(chuc) + "mươi";
//        }
//        int donVi = so % 10; //9
//        chuoi += layChuoi(donVi);
//        System.out.println(chuoi);
//        int tram = so/100;
//        chuoi += layChuoi(tram) + "trăm";

    }

    public static void layChuoi(int so) {
        switch (so) {
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
            default:
                System.out.println("Số không hợp lệ");
                break;
        }
    }
}

