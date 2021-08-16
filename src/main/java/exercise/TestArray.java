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
        int[] arr = {4, 8, -5, 2, -1, 4, -9};
//        if (isAllEven(arr)) {
//            System.out.println("mảng chẳn");
//        } else System.out.println("mảng không chẳn");
//        System.out.println("Max: " + findMax(arr)+", Index: "+findMaxIndex(arr));
//        System.out.println("Min: " + findMin(arr));
        System.out.format("Find first Negative Index=%d\n", findFirstNegativeIndex(arr));
        System.out.format("Find Last Positive Index=%d\n", findLastPositiveIndex(arr));
        System.out.format("Find Min Positive Index=%d\n", findMinPosIndex(arr));
        System.out.format("Find Max Negative Index=%d\n", findMaxNegIndex(arr));

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

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaxIndex(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static int findFirstNegativeIndex(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 0) {
                return i;
            }
        }
        return -1;//không có phần tử âm
    }

    public static int findLastPositiveIndex(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                return i;
            }
        }
        return -1;
    }

    public static int findMinPosIndex(int[] arr) {
        int lastPosIndex = findLastPositiveIndex(arr);
        if (lastPosIndex < 0) {
            return -1;
        }
        int minPost = lastPosIndex;
        for (int i = lastPosIndex - 1; i >= 0; i--) {
            if (arr[i] > 0 && arr[i] < minPost) {
                minPost = i;
            }
        }
        return minPost;
    }

    public static int findMaxNegIndex(int[] arr) {
        int maxNegIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && (maxNegIdx == -1 || arr[i] > arr[maxNegIdx])) {
                maxNegIdx = i;
            }
        }
        return maxNegIdx;
    }
}
