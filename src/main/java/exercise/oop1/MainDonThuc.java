package exercise.oop1;

import java.util.Scanner;

public class MainDonThuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DonThuc dt = new DonThuc(2, 2);
        //Xuất đơn thức
        System.out.println("Don thuc: :" + dt.toString());

        //Tich dơn thuc
        System.out.println("-------------");
        DonThuc dt2 = new DonThuc(3, 2);
        System.out.println("Don thuc 1: :" + dt.toString());
        System.out.println("Don thuc 2: :" + dt2.toString());
        DonThuc dtTich = dt.mulMonomial(dt2);
        System.out.println("Tich 2 don thuc: " + dt.toString());

        //Thuong dơn thuc
        System.out.println("-------------");
        DonThuc dt3 = new DonThuc(3, 2);
        System.out.println("Don thuc 1: :" + dt.toString());
        System.out.println("Don thuc 2: :" + dt3.toString());
        DonThuc dtThuong = dt.divMonomial(dt2);
        System.out.println("Thuong 2 don thuc: " + dt.toString());

        //Dao ham bac 1
        System.out.println("-------------");
        DonThuc dt4 = new DonThuc(2, 4);
        System.out.println("Don thuc: :" + dt4.toString());
        System.out.print("Dao ham bac 1" + dt4.toString() + ": ");
        dt4.firstDerivative();
        System.out.println(dt4);

        //Dao ham bac n
//        System.out.println("-------------");
//        DonThuc dt5 = new DonThuc(2, 3);
//        System.out.println("Don thuc: :" + dt5.toString());
//        System.out.print("Nhap bac can dao ham: ");
//        int n = sc.nextInt();
//        System.out.print("Dao ham bac " + n + " cua " + dt5.toString() + ": ");
//        dt5.nthDerivative(n);
//        System.out.println(dt5);

        //Dao ham bac n
        System.out.println("-------------");
        DonThuc dt6=new DonThuc(2,2);
        System.out.print("Don thuc: "+dt6.toString()+"\nNhap x0 = ");
        int x=sc.nextInt();
        System.out.print("Value = "+dt6.valueDervative(x));
    }
}
