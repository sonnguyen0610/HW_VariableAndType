package exercise;

import java.util.Scanner;

public class MatrixArray {
    public static void main(String[] args) {
//        int[][] a = inputMatrix();
//        int[][] b = generateMatrix(3, 3, 2, 5);
//        printMatrix(b);
//        int sum = sumEleMatrix(b);
//        System.out.format("SUM = %d\n", sum);

        //Tính tổng trên các dòng
//        int[][] m = generateMatrix(3, 3, 2, 5);
//        printMatrix(m);
//        int [] sumR=sumRowInMatrix(m);
//        System.out.print("Tổng các dòng lần lượt là: ");
//        for(int i:sumR){
//            System.out.print(i+"\t");
//        }
        //Bài 1
//        int[][] b = generateMatrix(3, 3, 2, 5);
//        printMatrix(b);
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập X cần tìm: ");
//        int x = sc.nextInt();
//        if(findX(b,x)){
//            System.out.print(" là vị trí đầu tiên của "+x);
//        }else {
//            System.out.println(" Không tìm được "+x);
//
//        }
        //Bài 2
//        int[][] primeMatrix = {{3, 3, 5}, {5, 7, 11}};
//        printMatrix(primeMatrix);
//        if (isPrimeMatrix(primeMatrix)) {
//            System.out.println("Là mtran toàn số nguyên tố");
//        } else {
//            System.out.println("Không là mtran toàn số nguyên tố");
//        }
        //Bài 3
//        int[][] c = generateMatrix(3, 3, 2, 5);
//        printMatrix(c);
//        System.out.println("MAX của mảng là: " + maxEleMatrix(c));

        /*Bài 4 Cho trước ma trận a, kích thước m x n. Tính tổng các phần tử trên:
        a. Dòng d, cột c
        b. Đường chéo chính, đường chéo phụ (ma trận vuông)
        c. Nửa trên/dưới đường chéo chính (ma trận vuông)
        d. Nửa trên/dưới đường chéo phụ (ma trận vuông)*/
        int[][] c = generateMatrix(3, 3, 2, 5);
        printMatrix(c);
        Scanner sc = new Scanner(System.in);

        //Tính tổng trên dòng
//        System.out.print("Nhap dong can tinh tong: ");
//        int x = sc.nextInt();
//        System.out.format("Tổng tren dong: " + sumRowX(c, (x-1)));
        //Tính tổng trên cột c
//        System.out.print("Nhap cot can tinh tong: ");
//        int x = sc.nextInt();
//        System.out.format("Tổng tren cot: " + sumColX(c, (x - 1)));
        //Tính tổng đường chéo chính
//        System.out.println("Tổng đường chéo chính: " + sumDuongCheoChinh(c));
        //Tính tổng đường chéo phụ
        System.out.println("Tổng đường chéo phụ: " + sumDuongCheoPhu(c));

    }
    //Tinhs tổng đường chéo phụ
    public static int sumDuongCheoPhu(int[][] a) {
        int sum = 0;
        int r = a.length;
        int c = a[0].length;
        if (r == c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {

                }
            }
        } else {
            System.out.println("Khong phai ma tran vuong!");
        }
        return sum;
    }
    //Tinhs tổng đường chéo chính
    public static int sumDuongCheoChinh(int[][] a) {
        int sum = 0;
        int r = a.length;
        int c = a[0].length;
        if (r == c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (i == j) {
                        sum += a[i][j];
                    }
                }
            }
        } else {
            System.out.println("Khong phai ma tran vuong!");
        }
        return sum;
    }

    //Tính tổng phần tử trên cot X
    public static int sumColX(int[][] a, int x) {
        int sum = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (j == x) {
                    sum += a[i][j];
                }
            }
        }
        return sum;
    }

    //Tính tổng phần tử trên dong X
    public static int sumRowX(int[][] a, int x) {
        int sum = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (i == x) {
                    sum += a[i][j];
                }
            }
        }
        return sum;
    }

    //Tính tổng phần tử trên các dòng
    public static int[] sumRowInMatrix(int[][] a) {
        int[] sum = new int[a.length];
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                sum[i] += a[i][j];
            }
        }
        return sum;
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

    public static boolean findX(int[][] a, int x) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (a[i][j] == x) {
                    System.out.format("a[%d][%d]", i, j);
                    return true;
                }
            }
        }
        return false;
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
