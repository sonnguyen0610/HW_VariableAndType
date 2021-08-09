package exercise;

import java.util.Scanner;

public class Exercise3 {
//    public static void main(String[] args) {
//        Exercise3 ex = new Exercise3();
//        Scanner sc = new Scanner(System.in);
//        //Bài 1
////        String year = sc.nextLine();
////        ex.Bai_1_isLeapYear(Integer.parseInt(year));
//        //Bài 2
//        System.out.print("Day: ");
//        String day = sc.nextLine();
//        System.out.print("Month: ");
//        String month = sc.nextLine();
//        System.out.print("Year: ");
//        String year = sc.nextLine();
//        ex.bai_2_isValid(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year));
//        ex.bai_2_nextDay(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year));
//        ex.bai_2_lastDay(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year));
//    }

    public void Bai_1_isLeapYear(int year) {
        if ((year % 4) == 0 & (year % 100) != 0) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }
    }

    public void bai_2_isValid(int day, int month, int year) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12://tháng có 31 ngày
                if (day >= 1 & day <= 31) {
                    System.out.println("Date is valid");
                } else {
                    System.out.println("Date is invalid");
                }
                break;
            case 4, 6, 9, 11:// tháng có 30 ngày
                if (day >= 1 & day <= 30) {
                    System.out.println("Date is valid");
                } else {
                    System.out.println("Date is invalid");
                }
                break;
            case 2:
                if ((year % 4) == 0 & (year % 100) != 0) {
                    if (day >= 1 & day <= 29) {
                        System.out.println("Date is valid");
                    } else {
                        System.out.println("Date is invalid");
                    }
                } else {
                    if (day >= 1 & day <= 28) {
                        System.out.println("Date is valid");
                    } else {
                        System.out.println("Date is invalid");
                    }
                }
                break;
            default:
                System.out.println("Date is invalid");
        }
    }
    public void bai_2_nextDay(int day, int month, int year) {
        String nextDay = null;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12://tháng có 31 ngày
                if (day >= 1 & day <= 31) {
                    switch (month) {
                        case 1:
                            if (day == 1) {
                                nextDay = (day + 1) + "/" + month + "/" + year;
                            } else if (day == 31) {
                                nextDay = "0" + 1 + "/" + (month + 1) + "/" + year;
                            } else {
                                nextDay = (day + 1) + "/" + month + "/" + year;
                            }
                            break;
                        case 12:
                            if (day == 1) {
                                nextDay = (day + 1) + "/" + month + "/" + year;
                            } else if (day == 31) {
                                nextDay = "01" + "/" + "01" + "/" + (year + 1);
                            } else {
                                nextDay = (day + 1) + "/" + month + "/" + year;
                            }
                            break;
                        default:
                            if (day == 1) {
                                nextDay = (day + 1) + "/" + month + "/" + year;
                            } else if (day == 31) {
                                nextDay = "01" + "/" + (month + 1) + "/" + year;
                            } else {
                                nextDay = (day + 1) + "/" + month + "/" + year;
                            }
                    }
                } else {
                    System.out.println("Date is invalid");
                }
                break;
            case 4, 6, 9, 11:// tháng có 30 ngày
                if (day >= 1 & day <= 30) {
                    if (day == 1) {
                        nextDay = (day + 1) + "/" + month + "/" + year;
                    } else if (day == 30) {
                        nextDay = "01" + "/" + (month + 1) + "/" + year;
                    } else {
                        nextDay = (day + 1) + "/" + month + "/" + year;
                    }
                } else {
                    System.out.println("Date is invalid");
                }
                break;
            case 2:
                if ((year % 4) == 0 & (year % 100) != 0) {
                    if (day >= 1 & day <= 29) {
                        if (day == 1) {
                            nextDay = (day + 1) + "/" + month + "/" + year;
                        } else if (day == 29) {
                            nextDay = "01" + "/" + (month + 1) + "/" + year;
                        } else {
                            nextDay = (day + 1) + "/" + month + "/" + year;
                        }
                    } else {
                        System.out.println("Date is invalid");
                    }
                } else {
                    if (day >= 1 & day <= 28) {
                        if (day == 1) {
                            nextDay = (day + 1) + "/" + month + "/" + year;
                        } else if (day == 28) {
                            nextDay = "01" + "/" + (month + 1) + "/" + year;
                        } else {
                            nextDay = (day + 1) + "/" + month + "/" + year;
                        }
                    } else {
                        System.out.println("Date is invalid");
                    }
                }
                break;
            default:
                System.out.println("Date is invalid");
        }
        System.out.println("Next day: "+nextDay);
    }
    public void bai_2_lastDay(int day, int month, int year) {
        String lastDay = null;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12://tháng có 31 ngày
                if (day >= 1 & day <= 31) {
                    switch (month) {
                        case 1:
                            if (day == 1) {
                                lastDay = (day + 30) + "/" + (month + 11) + "/" + (year - 1);
                            } else if (day == 31) {
                                lastDay = (day - 1) + "/" + month + "/" + year;
                            } else {
                                lastDay = (day - 1) + "/" + month + "/" + year;
                            }
                            break;
                        case 12:
                            if (day == 1) {
                                lastDay = (day + 30) + "/" + (month - 1) + "/" + year;
                            } else if (day == 31) {
                                lastDay = (day - 1) + "/" + month + "/" + year;
                            } else {
                                lastDay = (day - 1) + "/" + month + "/" + year;
                            }
                            break;
                        default:
                            if (day == 1) {
                                lastDay = "31" + "/" + (month - 1) + "/" + year;
                            } else if (day == 31) {
                                lastDay = (day - 1) + "/" + month + "/" + year;
                            } else {
                                lastDay = (day - 1) + "/" + month + "/" + year;
                            }
                    }
                } else {
                    System.out.println("Date is invalid");
                }
                break;
            case 4, 6, 9, 11:// tháng có 30 ngày
                if (day >= 1 & day <= 30) {
                    if (day == 1) {
                        lastDay = "30" + "/" + (month - 1) + "/" + year;
                    } else if (day == 30) {
                        lastDay = (day - 1) + "/" + month + "/" + year;
                    } else {
                        lastDay = (day - 1) + "/" + month + "/" + year;
                    }
                } else {
                    System.out.println("Date is invalid");
                }
                break;
            case 2:
                if ((year % 4) == 0 & (year % 100) != 0) {
                    if (day >= 1 & day <= 29) {
                        if (day == 1) {
                            lastDay = "31" + "/" + "01" + "/" + year;
                        } else if (day == 29) {
                            lastDay = (day - 1) + "/" + month + "/" + year;
                        } else {
                            lastDay = (day - 1) + "/" + month + "/" + year;
                        }
                    } else {
                        System.out.println("Date is invalid");
                    }
                } else {
                    if (day >= 1 & day <= 28) {
                        if (day == 1) {
                            lastDay = "31" + "/" + "01" + "/" + year;
                        } else if (day == 28) {
                            lastDay = (day - 1) + "/" + month + "/" + year;
                        } else {
                            lastDay = (day - 1) + "/" + month + "/" + year;
                        }
                    } else {
                        System.out.println("Date is invalid");
                    }
                }
                break;
            default:
                System.out.println("Date is invalid");
        }
        System.out.println("Last day: "+lastDay);
    }
}
