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
        d. Nửa trên/dưới đường chéo phụ (ma trận vuông)
        a[0][0] a[0][1] a[0][2] a[0][3]
        a[1][0] a[1][1] a[1][2] a[1][3]
        a[2][0] a[2][1] a[2][2] a[2][3]
        a[3][0] a[3][1] a[3][2] a[3][3]
        */
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
//        System.out.println("Tổng đường chéo chính: " + tongDuongCheoChinh(c));
        //Tính tổng đường chéo phụ
//        System.out.println("Tổng đường chéo phụ: " + tongDuongCheoPhu(c));

        //Tính tổng nữa trên đường chéo chính
//        System.out.println("Tổng nữa trên đường chéo chính: " + tongNuaTrenChinh(c));
        //Tính tổng nữa trên đường chéo chính
//        System.out.println("Tổng nữa dưới đường chéo chính: " + tongNuaDuoiChinh(c));

        //Tính tổng nữa trên đường chéo phụ
        System.out.println("Tổng nữa trên đường chéo chính: " + tongNuaTrenPhu(c));
        //Tính tổng nữa trên đường chéo phụ
        System.out.println("Tổng nữa dưới đường chéo chính: " + tongNuaDuoiPhu(c));
    }

    //Tính tổng nữa trên đường chéo phụ
    private static int tongNuaDuoiPhu(int[][] a) {
        int sum = 0;
        int r = a.length;
        int c = a[0].length;
        if (r == c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if ((i + j) > (r - 1)) {
                        sum += a[i][j];
                    }
                }
            }
        } else {
            System.out.println("Khong phai ma tran vuong");
        }
        return sum;
    }

    //Tính tổng nữa trên đường chéo phụ
    private static int tongNuaTrenPhu(int[][] a) {
        int sum = 0;
        int r = a.length;
        int c = a[0].length;
        if (r == c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if ((i + j) < (r - 1)) {
                        sum += a[i][j];
                    }
                }
            }
        } else {
            System.out.println("Khong phai ma tran vuong");
        }
        return sum;
    }

    //Tính tổng nữa trên đường chéo chính
    public static int tongNuaTrenChinh(int[][] a) {
        int sum = 0;
        int r = a.length;
        int c = a[0].length;
        if (r == c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (i < j) {
                        sum += a[i][j];
                    }
                }
            }
        } else {
            System.out.println("Khong phai ma tran vuong");
        }
        return sum;
    }

    //Tính tổng nữa dưới đường chéo chính
    public static int tongNuaDuoiChinh(int[][] a) {
        int sum = 0;
        int r = a.length;
        int c = a[0].length;
        if (r == c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (i > j) {
                        sum += a[i][j];
                    }
                }
            }
        } else {
            System.out.println("Khong phai ma tran vuong");
        }
        return sum;
    }

    //Tinhs tổng đường chéo phụ
    public static int tongDuongCheoPhu(int[][] a) {
        int sum = 0;
        int r = a.length;
        int c = a[0].length;
        if (r == c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if ((i + j) == (r - 1)) {
                        sum += a[i][j];
                    }
                }
            }
        } else {
            System.out.println("Khong phai ma tran vuong!");
        }
        return sum;
    }

    //Tinhs tổng đường chéo chính
    public static int tongDuongCheoChinh(int[][] a) {
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
        if (x > 0) {
            for (int i = 0, r = a.length; i < r; i++) {
                for (int j = 0, c = a[0].length; j < c; j++) {
                    if (j == x) {
                        sum += a[i][j];
                    }
                }
            }
        } else {
            System.out.println("Cot X la so duong");
        }
        return sum;
    }

    //Tính tổng phần tử trên dong X
    public static int sumRowX(int[][] a, int x) {
        int sum = 0;
        if (x > 0) {
            for (int i = 0, r = a.length; i < r; i++) {
                for (int j = 0, c = a[0].length; j < c; j++) {
                    if (i == x) {
                        sum += a[i][j];
                    }
                }
            }
        } else {
            System.out.println("Cot X la so duong");
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
