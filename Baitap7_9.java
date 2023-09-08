import java.util.Arrays;
import java.util.Scanner;

public class Baitap7_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập động dài của mảng: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        int size = 0;
        while (size != arr.length){
            System.out.println("Nhập phần tử mảng: ");
            int element = scanner.nextInt();
            arr[size] = element;
            size++;
        }
        System.out.println("Mảng đang thực hiện là: " + Arrays.toString(arr));
        int choice = -1;
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Thêm phần tử");
            System.out.println("2. Xóa phần tử");
            System.out.println("3. Tìm phần tử nhỏ nhất");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập phần tử mới: ");
                    int newElement = scanner.nextInt();
                    for (int i = 0; i < arr.length; i++) {
                        if(arr[i] == 0){
                            size = add(arr, newElement, size);
                            System.out.println("Mảng sau khi thêm phần tử: " + Arrays.toString(arr));
                            break;
                        }else {
                            int[] newarr = new int[1];
                            int newsize = 0;
                            newsize = add(newarr , newElement , newsize);
                            int newlength = arr.length + newarr.length;
                            int[] result = new int[newlength];
                            int resultSize = 0;
                            for (int element : arr) {
                                result[resultSize] = element;
                                resultSize++;
                            }
                            for (int element : newarr) {
                                result[resultSize] = element;
                                resultSize++;
                            }
                            System.out.println("Mảng sau khi thêm phần tử: " + Arrays.toString(result));
                            break;
                        }

                    }
//                    System.out.println("Mảng sau khi thêm phần tử: " + Arrays.toString(result));
                    break;

                case 2:
                    System.out.println("Nhập phần tử muốn xóa: ");
                    int delElement = scanner.nextInt();
                    size = delete(arr, delElement, size);
                    System.out.println("Mảng sau khi xóa phần tử: " + Arrays.toString(arr));
                    break;

                case 3:
                    int minArr = arr[0];
                    for (int i = 0; i < arr.length; i++) {
                        if(minArr > arr[i]){
                            minArr = arr[i];
                        }
                    }
                    System.out.println("Giá trị nhỏ nhất trong mảng là: " + minArr);

            }
        }

    }

    public static int add(int[] arr, int element, int size) {
        arr[size] = element;
        size++;
        return size;
    }

    public static int search(int[] arr, int element, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int delete(int[] arr, int element, int size) {
        int index = search(arr, element, size);
        if (size == arr.length) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size - 1] = 0;
        } else {
            for (int i = index; i < size ; i++) {
                arr[i] = arr[i + 1];
            }
        }
        return size - 1;
    }
}
