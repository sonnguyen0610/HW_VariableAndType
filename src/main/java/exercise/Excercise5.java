package exercise;

import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhập số phần tử mảng: ");
//        int n=sc.nextInt();
        //Bài 2b:
//        int[] arrIsPrime = {3, 5, 7, 11, 13, 1};
//        System.out.println(isAllPrimeNum(arrIsPrime));
        //Bài 2c:
//        int[] arrIsSortASC = {1, 2, 3, 0, 6};
//        System.out.println(isSortASC(arrIsSortASC));
        //Bài 3a:
//        int[] arr = {4, 8, 12, 20, 40, 30, 21};//3
//        System.out.println(bai3A(arr));//3
        //Bài 3b:
        int[] sumPrimeNum = {2, 3, 12, 13, 14};//18
        System.out.println("Tổng = " + sumPrimeNum(sumPrimeNum));
    }

    public static String isAllPrimeNum(int[] a) {
        String res = "Là số nguyên tố";
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] < 1 || a[i] == 1) {
                res = "Không là số nguyên tố";
                return res;
            } else {
                for (int j = 2; j < a[i]; j++) {//duyệt các số nhỏ hơn a[i]
                    if ((a[i] % j) == 0) {//nếu chia hết thì sai
                        res = "Không là số nguyên tố";
                        return res;
                    }
                }
            }
        }
        return res;
    }

    public static String isSortASC(int[] a) {
        String res = "Là mảng tăng dần";
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    res = "Không là mảng tăng dần";
                    return res;
                }
            }
        }
        return res;
    }

    //bao nhiêu số chia hết cho 4 mà không chia hết cho 5
    public static int bai3A(int[] a) {
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] % 4) == 0 && (a[i] % 5) != 0) {
                dem++;
            }
        }
        return dem;
    }

    public static int sumPrimeNum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 1 || a[i] == 1) {//không là số nguyên tố
                return sum;
            } else {//là só nguyên tố
                for (int j = 2; j < a[i]; j++) {//duyệt các số nhỏ hơn a[i]
                    if ((a[i] % j) == 0) {//nếu chia hết thì sai
                        sum = sum - a[i];
                        break;
                    }
                }
                sum = sum + a[i];
            }
        }
        return sum;
    }
}
