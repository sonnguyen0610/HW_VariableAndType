package exercise;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("n= ");
//        int n = sc.nextInt();
//
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("[" + i + "] =");
//            arr[i] = sc.nextInt();
//        }
//        sortArrAsc(arr);
//        printArray(arr);
//        System.out.println(sumElement(arr));
//        int[] generteArray = generteArray(20, 5, 10);
//        printArray(generteArray);
        //
        int[] arr = {4, 8, 5, 2};
        if (isAllEven(arr)) {
            System.out.println("mảng chẳn");
        } else System.out.println("mảng không chẳn");


    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int sumElement(int[] arr) {
        int res = 0;
        for (int ele : arr) {
            res += ele;
        }
        return res;
    }

    //Sắp xếp: interChangeSort
    public static void sortArrAsc(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    //phát sinh mảng
    public static int[] generteArray(int n, int min, int max) {
        int[] res = new int[n];
//        for (int i = 0; i <res.length ; i++) {
//            res[i]= (int) Math.floor(Math.random()*100); //chuyển thành số nguyên
//        }
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) Math.floor(Math.random() * (max - min)) + min; //chuyển thành số nguyên & từ min tới max
        }
        return res;
    }

    // ktr có tất cả phần tử là  số chẵn k
    public static boolean isAllEven(int[] arr) {
        for (int n : arr) {
            if ((n % 2) != 0) {
                return false;
            }
        }
        return true;
    }
}
