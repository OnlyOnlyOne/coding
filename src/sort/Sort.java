package sort;

import org.junit.Test;

public class Sort {

    public static void bubbleSort() {
        int arr[] = {8, 5, 3, 2, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        for (Integer n : arr) {//注意是直接将ns数组的值送到n里面去了
            System.out.print(n + " ");
        }
    }


    public static void selectSort() {
        int arr[] = {6, 5, 3, 2, 4};
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i ; j < arr.length; j++) {
                if (min > arr[j]) {
                    int temp = min;
                    min = arr[j];
                    arr[j] = temp;
                }
            }
            arr[i] = min;
        }
        for (Integer n : arr) {//注意是直接将ns数组的值送到n里面去了
            System.out.print(n + " ");
        }
    }

//    public static void main(String[] args) {
//        bubbleSort();
//        System.out.println();
//        selectSort();
//    }
}
