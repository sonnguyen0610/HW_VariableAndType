package exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập chuỗi s: ");
//        String s = sc.nextLine();
//        System.out.println("Chuỗi s có các chữ hoa: "+printUppercaseInString(s));

        System.out.print("Nhập chuỗi s: ");
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println("Chuỗi s có các chữ là: "+printNonNumber(s));

    }

    //in ra các ký tự in hoa
    public static String printUppercaseInString(String s) {
        String res="";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                 res=res+s.charAt(i) ;
            }
        }
        return res;
    }
    // in ra không phải số
    public static String printNonNumber(String s) {
        String res="";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                continue;
            }
            res=res+s.charAt(i) ;
        }
        return res;
    }
    // in ra chuỗi c trong chuỗi s

}
