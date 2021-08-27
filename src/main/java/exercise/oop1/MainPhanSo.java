package exercise.oop1;

import java.util.Scanner;

public class MainPhanSo {
    public static void main(String[] args) {
//        PhanSo ps1 = new PhanSo(5, 8);
//        PhanSo ps2 = new PhanSo(2, 4);

        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap phan so dang a/b: ");
        String strPS=sc.nextLine();
        PhanSo ps=PhanSo.fromString(strPS);
        System.out.println(ps);

        //tinh tong
        System.out.print("Nhap phan so dang a/b: ");
        String strPS2=sc.nextLine();
        PhanSo ps2=PhanSo.fromString(strPS);
        ps.plus(ps2);



    }
}
