package exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Exercise3 ex = new Exercise3();
        Scanner sc = new Scanner(System.in);
        //Bài 1
//        String year = sc.nextLine();
//        ex.Bai_1_isNamNhuan(Integer.parseInt(year));
        //Bài 2
        System.out.print("Nhập ngày: ");
        String day = sc.nextLine();
        System.out.print("Nhập tháng: ");
        String month = sc.nextLine();
        System.out.print("Nhập năm: ");
        String year = sc.nextLine();
        ex.bai_2_isValid(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year));
    }

    public void Bai_1_isNamNhuan(int year) {
        if ((year % 4) == 0 & (year % 100) != 0) {
            System.out.println("Năm " + year + " là năm nhuận");
        } else {
            System.out.println("Năm " + year + " không là năm nhuận");
        }
    }

    public void bai_2_isValid(int day, int month, int year) {
        String valid = null, nextDay = null, lastDay = null;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12://tháng có 31 ngày
                if (day >= 1 & day <= 31) {
                    System.out.println("Hợp lệ");
                    switch (month) {
                        case 1:
                            if (day == 1) {
                                nextDay = (day + 1) + "/" + month + "/" + year;
                                lastDay = (day + 30) + "/" + (month + 11) + "/" + (year - 1);
                            } else if (day == 31) {
                                nextDay = "0" + 1 + "/" + (month + 1) + "/" + year;
                                lastDay = (day - 1) + "/" + month + "/" + year;
                            } else {
                                nextDay = (day + 1) + "/" + month + "/" + year;
                                lastDay = (day - 1) + "/" + month + "/" + year;
                            }
                            break;
                        case 12:
                            if (day == 1) {
                                nextDay = (day + 1) + "/" + month + "/" + year;
                                lastDay = (day + 30) + "/" + (month - 1) + "/" + year;
                            } else if (day == 31) {
                                nextDay = "01" + "/" + "01" + "/" + (year + 1);
                                lastDay = (day - 1) + "/" + month + "/" + year;
                            } else {
                                nextDay = (day + 1) + "/" + month + "/" + year;
                                lastDay = (day - 1) + "/" + month + "/" + year;
                            }
                            break;
                    }
                } else {
                    System.out.println("Không hợp lệ");
                }
                break;
            case 4, 6, 9, 11:// tháng có 30 ngày
                if (day >= 1 & day <= 30) {
                    System.out.println("Hợp lệ");
                    if (day == 1) {
                        nextDay = (day + 1) + "/" + month + "/" + year;
                        lastDay = "30" + "/" + (month - 1) + "/" + year;
                    } else if (day == 30) {
                        nextDay = "01" + "/" + (month + 1) + "/" + year;
                        lastDay = (day - 1) + "/" + month + "/" + year;
                    } else {
                        nextDay = (day + 1) + "/" + month + "/" + year;
                        lastDay = (day - 1) + "/" + month + "/" + year;
                    }
                } else {
                    System.out.println("Không hợp lệ");
                }
                break;
            case 2:
                if ((year % 4) == 0 & (year % 100) != 0) {
                    if (day >= 1 & day <= 29) {
                        System.out.println("Hợp lệ");
                    } else {
                        System.out.println("Không hợp lệ");
                    }
                } else {
                    if (day >= 1 & day <= 28) {
                        System.out.println("Hợp lệ");
                    } else {
                        System.out.println("Không hợp lệ");
                    }
                }
                break;
        }
        System.out.println("Next day: "+nextDay+"\nLast day: "+lastDay);
    }
}
