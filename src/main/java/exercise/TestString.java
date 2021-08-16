package exercise;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bài 1
//        System.out.print("Nhập chuỗi s: ");
//        String s = sc.nextLine();
//        System.out.println("Chuỗi s có các chữ hoa: "+printUppercaseInString(s));

        //Bài 2
//        System.out.print("Nhập chuỗi s: ");
//        String s = sc.nextLine();
//        System.out.println(s);
//        System.out.println("Chuỗi s có các chữ là: " + printNonNumber(s));

        //Bài 3
//        System.out.print("Nhập chuỗi s: ");
//        String s=sc.nextLine();
//        System.out.print("Nhập kí tự muốn thay đổi trong chuỗi s: ");
//        String oldS=sc.nextLine();
//        System.out.print("Nhập ký tự thay đổi: ");
//        String newS=sc.nextLine();
//        replaceString(s,oldS,newS);

        //Bài 4
//        System.out.print("Nhập chuỗi s: ");
//        String s = sc.nextLine();
//        System.out.println("Số lượng ký tự là: " + countChar(s));

        //Bài 7
        System.out.print("Nhập chuỗi s: ");
        String s = sc.nextLine();
        countConsonantVowel(s);
    }

    //in ra các ký tự in hoa
    public static String printUppercaseInString(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                res = res + s.charAt(i);
            }
        }
        return res;
    }

    // in ra không phải số
    public static String printNonNumber(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                continue;
            }
            res = res + s.charAt(i);
        }
        return res;
    }

    // thay thế chuỗi con trong chuỗi s bằng 1 chuỗi đã cho c
    public static void replaceString(String s, String oldChars, String newChars) {
        System.out.println("Thay thế '" + newChars + "' thành '" + newChars + "' : " + s.replace(oldChars, newChars));
    }

    // đếm từ trong chuỗi
    public static int countChar(String s) {
        String[] str = s.split("\\s+");//dấu cộng để có thể tính 1 hoặc nhiều khoảng trắng
        return str.length;
    }

    //đếm số ượng nguyên am, phụ âm
    public static void countConsonantVowel(String s) {
        int countVowel = 0;
        int countConsonant = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(s.charAt(i))) {
                continue;
            } else if (c == 'a' || c == 'o' || c == 'e' || c == 'u' || c == 'i'||c == 'A' || c == 'O' || c == 'E' || c == 'U' || c == 'I') {
                countVowel++;
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                countConsonant++;
            }
        }
        System.out.println("Số lượng ký tự nguyên âm là: " + countVowel);
        System.out.println("Số lượng ký tự phụ âm là: " + countConsonant);
    }

}
