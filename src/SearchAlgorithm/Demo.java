package SearchAlgorithm;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer>  arr =new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(8);
        arr.add(9);
        arr.add(20);
        System.out.println(binarySearch(arr, 22));
    }
    public  static  int binarySearch(ArrayList<Integer> arr , int K){
        int left = 0;
        int right = arr.size() -1;
        while (left <= right){
            int mid =( left + right ) / 2;
            if(arr.get(mid) == K) {
                return mid ;
            }
            if (arr.get(mid) < K) {
                left = mid + 1;
            }
            if(arr.get(mid) > K){
                right = mid -1;
            }
        }
        return -1;
    }
    public static int linearSearch(ArrayList<Integer>arr,int K){
        for (int i = 0; i < arr.size(); i++) {
            if(K== arr.get(i)){
                return i;
            }
        }
        return -1;
    }
    public static int sentinelSearch(ArrayList<Integer> arr ,int K) {
        int n = arr.size();  //5a
        arr.add(K);  //[1,4,8,9,20,22]
        int i = 0;
        while (arr.get(i) != K){   //arr[i] == K
            i++;
        }
        if(i == n){
            return -1;
        }
        else  {
            return i;
        }

    }

    public void demo(){

    }
}
