package exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int num = sc.nextInt();

//        int n = sc.nextInt();
//        if (isPrimeNumber(n)) {
//            System.out.format("%d là số nguyên tố. \n", n);
//        } else {
//            System.out.format("%d KHÔNG PHẢI số nguyên tố. \n", n);
//        }
        //Bài 1 a:
        if (isDoiXung(num)) {
            System.out.println("Là số đối xứng");
        } else {
            System.out.println("Không là số đối xứng");
        }
        //Bài 1 b:
//        if (isSquareNumber(num)) {
//            System.out.println(num + " Là số chính phương");
//        }else {
//            System.out.println(num + " KHÔNG PHẢI số chính phương");
//        }
        //Bài 2 d:
//        System.out.print(num+"! = "+factorial(num));
        //Bài 2 e:
//        System.out.print("Tổng giai thừa: "+totalOfFactorial(num));
        //Bài 4:
//        System.out.print("Tổng các số nguyên tố là: "+totalPrimeNumber(num));
        //Bài 5:
//        System.out.println("Đảo ngược của "+num+" là "+reverseNumber(num));

    }

    public static int sum2a(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }

    //Kiểm tra số nguyên tố
    public static boolean isPrimeNumber(int n) {
        boolean res = true;
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                res = false;
                break;
            }
        }
        return res;
    }

    //kiểm tra  số có đối xứng k
    public static boolean isDoiXung(int num) {
        boolean dx;
        int rev=reverseNumber(num);
        int clone=num,length = 0;
        while (clone > 0) {
            int aNumber = clone % 10;//lây số cuối
            clone /= 10;//để tiếp tục hàm while lấy số cuối
            length++;//tính chiều dài của số
        }
        if ((length % 2) != 0) {//nếu chiều dài của số là lẻ thì k phải là số dx
            dx = false;
        } else {
            if (rev == num) {
                dx=true;
            } else {
                dx = false;
            }
        }
        return dx;
    }

    //Kiểm tra có phải số chỉnh phương
    public static boolean isSquareNumber(int num) {
        double sqNumber = Math.sqrt(num);
        return ((sqNumber - Math.floor(sqNumber)) == 0);
    }

    // Tính giai thừa
    public static double factorial(int num) {
        double factorial = 1;
        if (num == 1 || num == 0) {
            return factorial;
        } else {
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    //Tính tổng của các giai thừa
    public static double totalOfFactorial(int num) {
        double totalFactorial = 0;
        for (int i = 1; i <= num; i++) {
            totalFactorial += factorial(i);
        }
        return totalFactorial;
    }

    //Tính tổng số tố <n (0<n<50)
    public static double totalPrimeNumber(int n) {
        double total = 0;
        if (n < 0 || n > 49) {
            return total;
        } else {
            for (int i = 2; i <= n; i++) {
                System.out.println(i);
                if (isPrimeNumber(i)) {//Đúng là số nguyên tố
                    total += i;
                } else {// không phải số nguyên tố
                    total += 0;
                }
            }
            return total;
        }
    }

    //Xuất số ngược lại của 1 số nguyên dương
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int aNumber = num % 10; // lấy số cuối của n
            reversed = reversed * 10 + aNumber;// để số cuối vào
            num /= 10; // để lấy số cuối tiếp theo
        }
        return reversed;
    }
}
