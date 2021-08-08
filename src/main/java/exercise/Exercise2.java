package exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 ex = new Exercise2();
        Scanner sc = new Scanner(System.in);
        //Bài 1
//        System.out.print("Nhập số: ");
//        String anyNum = sc.nextLine();
//        ex.bai_1(Integer.parseInt(anyNum));
        //Bài 2
//        String anyChar = sc.nextLine();
//        ex.bai_2(anyChar);
        //Bài 3
//        System.out.print("Pt: ax+b=0"+"\nNhập a: ");
//        String a=sc.nextLine();
//        System.out.print("Nhập b: ");
//        String b=sc.nextLine();
//        ex.bai_3_PTBac1(Integer.parseInt(a),Integer.parseInt(b));
        //Bài 4
//        System.out.print("Pt: a(x)^2+bx+c=0" + "\nNhập a: ");
//        String a = sc.nextLine();
//        System.out.print("Nhập b: ");
//        String b = sc.nextLine();
//        System.out.print("Nhập c: ");
//        String c = sc.nextLine();
//        ex.bai_4_PTBac2(Integer.parseInt(a),Integer.parseInt(b),Integer.parseInt(c));
        //Bài 5
//        System.out.print("Kiểm tra min của a, b, c, d" + "\nNhập a: ");
//        String a = sc.nextLine();
//        System.out.print("Nhập b: ");
//        String b = sc.nextLine();
//        System.out.print("Nhập c: ");
//        String c = sc.nextLine();
//        System.out.print("Nhập d: ");
//        String d = sc.nextLine();
//        ex.bai_5_Min(Integer.parseInt(a),Integer.parseInt(b),Integer.parseInt(c),Integer.parseInt(d));
        //Bài 6
//        System.out.print("Sắp xếp tăng dần a, b, c, d" + "\nNhập a: ");
//        String a = sc.nextLine();
//        System.out.print("Nhập b: ");
//        String b = sc.nextLine();
//        System.out.print("Nhập c: ");
//        String c = sc.nextLine();
//        System.out.print("Nhập d: ");
//        String d = sc.nextLine();
//        ex.bai_6_SortAsc(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c), Integer.parseInt(d));
        //Bài 7
//        System.out.print("Nhập số km: ");
//        String km = sc.nextLine();
//        ex.bai_7_TaxiMoney(Integer.parseInt(km));
        //Bài 8
//        System.out.print("How many days in the month? \nEnter month: ");
//        int month = sc.nextInt();
//        System.out.print("Enter year: ");
//        int year = sc.nextInt();
//        ex.bai_8_DayInMonth(month, year);
        //Bài 9
//        System.out.print("Xét có phải tap giác không?" + "\nNhập cạnh 1: ");
//        String a = sc.nextLine();
//        System.out.print("Nhập cạnh 2: ");
//        String b = sc.nextLine();
//        System.out.print("Nhập cạnh 3: ");
//        String c = sc.nextLine();
//        ex.bai_9_Tamgiac(Double.valueOf(a), Double.valueOf(b), Double.valueOf(c));

    }

    public void bai_1(int anyNum) {
        String str;
        switch (anyNum) {
            case 1:
                str = "Số 1";
                break;
            case 2:
                str = "Số 2";
                break;
            case 3:
                str = "Số 3";
                break;
            case 4:
                str = "Số 4";
                break;
            case 5:
                str = "Số 5";
                break;
            case 6:
                str = "Số 6";
                break;
            case 7:
                str = "Số 7";
                break;
            case 8:
                str = "Số 8";
                break;
            case 9:
                str = "Số 9";
                break;
            default:
                str = "Không đọc được!";
                break;
        }
        System.out.println(str);
    }

    public void bai_2(String anyChar) {
        String anyCase;
        char[] arrAnyChar = anyChar.toCharArray();
        if (arrAnyChar.length > 1) {
            System.out.println("Nhập 1 lý tự");
        } else {
            for (int a = 0; a < arrAnyChar.length; a++) {
                if (Character.isUpperCase(arrAnyChar[a])) {
                    for (int j = 0; j < arrAnyChar.length; j++) {
                        if (arrAnyChar[j] >= 65 && arrAnyChar[j] <= 90) {
                            arrAnyChar[j] += 32;
                        }
                    }
                } else if (Character.isLowerCase(arrAnyChar[a])) {
                    for (int i = 0; i < arrAnyChar.length; i++) {
                        if (arrAnyChar[i] >= 97 && arrAnyChar[i] <= 122) {
                            arrAnyChar[i] -= 32;
                        }
                    }
                } else {
                    System.out.println("Nhập chữ hoa hoặc thường");

                }
            }
            anyCase = String.valueOf(arrAnyChar);
            System.out.println(anyCase);
        }

    }

    public void bai_3_PTBac1(int a, int b) {
        int x = 0;
        if (a == 0 & b == 0) {
            System.out.println("Phương trình vô số nghiệm");
        } else if (a == 0 & b != 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (a != 0) {
            x = (-b) / a;
            System.out.println("Phương trình có 1 nghiệm duy nhất: x = " + x);
        }
    }

    public void bai_4_PTBac2(int a, int b, int c) {
        int x1 = 0, x2 = 0;
        float delta = (b * b) - (4 * a * c);
        if (a == 0) {
            bai_3_PTBac1(b, c);
        } else {
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                x1 = x2 = (-b) / (2 * a);
            } else if (delta > 0) {
                x1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
                x1 = (int) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phương trình có 2 nghiệm: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }

    public void bai_5_Min(int a, int b, int c, int d) {
        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);
        System.out.println("Min: " + Math.min(min1, min2));
    }

    public void bai_6_SortAsc(int a, int b, int c, int d) {
        int temp;
        int[] sortAsc = {a, b, c, d};
        for (int i = 0; i <= sortAsc.length - 1; i++) {
            for (int j = 0; j < sortAsc.length - i - 1; j++) {
                if (sortAsc[j] > sortAsc[j + 1]) {
                    temp = sortAsc[j];
                    sortAsc[j] = sortAsc[j + 1];
                    sortAsc[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < sortAsc.length; i++) {
            System.out.print(sortAsc[i] + " ");
        }
    }

    public void bai_7_TaxiMoney(int km) {
        int result = 0;
        if (km <= 1 & km > 0) {
            result = km * 15000;
        } else if (km > 1 & km <= 5) {
            result = km * 13500;
        } else if (km > 5 & km <= 120) {
            result = km * 11000;
        } else if (km > 120) {
            result = km * 11000 * (10 / 100);
        } else {
            System.out.println("Cannot charge");
        }
        System.out.print("Số tiền phải trả: " + result);
    }

    public void bai_8_DayInMonth(int month, int year) {
        if (month >= 1 & month <= 12) {
            if (year < 1) {
                System.out.println("Input valid year, please!");
            } else {
                switch (month) {
                    case 1,3,5,7,8,10,12:
                        System.out.println("Have 31 days in month");
                        break;
                    case 4,6,9,11:
                        System.out.println("Have 30 days in month");
                        break;
                    case 2:
                        if ((year % 4) == 0) {
                            System.out.println("Have 29 days in month");
                            break;
                        } else {
                            System.out.println("Have 28 days in month");
                            break;
                        }
                }
            }
        } else {
            System.out.println("Input valid month, please!");
        }
    }

    public void bai_9_Tamgiac(double a, double b, double c) {
        if ((a + b > c) & (a + c > b) & (b + c > a)) {
            System.out.print("Là tam giác");
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println(" vuông");
            } else if (a == b && b == c) {
                System.out.println(" đều");
            } else if (a == b || a == c || b == c) {
                System.out.println(" cân");
            } else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b) {
                System.out.println(" tù");
            } else {
                System.out.println(" nhọn");
            }
        } else {
            System.out.println("Không phải tam giác");
        }

    }
}
