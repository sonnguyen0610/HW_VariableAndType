package exercise;

import java.util.Scanner;

public class MatrixArray {
    public static void main(String[] args) {
//        int[][] a = inputMatrix();
//        int[][] b = generateMatrix(3, 3, 2, 5);
//        printMatrix(b);
//        int sum = sumEleMatrix(b);
//        System.out.format("SUM = %d\n", sum);
        //Bài 1
//        int[][] b = generateMatrix(3, 3, 2, 5);
//        printMatrix(b);
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập X cần tìm: ");
//        int x = sc.nextInt();
//        int[] isCon = isContain(b, x);
//        for (int i : isCon) {
//            System.out.print("Vị trí: " + i);
//        }
        //Bài 2
//        int[][] primeMatrix = {{3, 3, 5}, {5, 7, 11}};
//        printMatrix(primeMatrix);
//        if (isPrimeMatrix(primeMatrix)) {
//            System.out.println("Là mtran toàn số nguyên tố");
//        } else {
//            System.out.println("Không là mtran toàn số nguyên tố");
//        }
        //bài 3
        int[][] c = generateMatrix(3, 3, 2, 5);
        printMatrix(c);
        System.out.println("MAX của mảng là: " + maxEleMatrix(c));

    }

    public static int maxEleMatrix(int[][] a) {
        int max = a[0][0];
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }

    public static boolean isPrimeMatrix(int[][] a) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                for (int k = 2; k < (a[i][j] / 2); k++) {
                    if ((a[i][j] % k) == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public static int[] isContain(int[][] a, int x) {
        int row = 0;
        int col = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (x == a[i][j]) {
                    row = i;
                    col = i;
                }
            }
        }
        int[] arr = {row, col};
        return arr;
    }

    public static int[][] inputMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số dòng: ");
        int r = sc.nextInt();
        System.out.print("Số cột: ");
        int c = sc.nextInt();

        int[][] ret = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.format("a[%d][%d] = ", i, j);
                ret[i][j] = sc.nextInt();
            }
        }
        return ret;
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                System.out.format("%5d ", a[i][j]);//1 vtri gồm 5 ktu (canh lề phải)(%d-5d: canh lề trái)
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int r, int c, int min, int max) {
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = (int) Math.floor(Math.random() * (max - min) + min);
            }
        }
        return res;
    }

    public static int sumEleMatrix(int[][] a) {
        int s = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                s += a[i][j];
            }
        }
        return s;
    }

}
