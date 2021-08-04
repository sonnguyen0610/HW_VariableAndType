public class App {
    public static void main(String[] args) {
        //Bai 4: Nhập năm sinh của 1 người +tính tuổi
        int birthY = 1999;
        int presentY = 2021;
        int age = presentY - birthY;
        System.out.println("Bài 4:");
        System.out.println("BirthDay: " + birthY + "\tThis year: " + presentY + "\nAge: " + age);
        System.out.println("-------------");
        //Bai 5: Nhập a&b. Tính tổng, hiệu, tích, thương của a&b
        int a = 10;
        int b = 5;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println("Bài 5:");
        System.out.println("Tong: " + sum + "\nHieu: " + sub + "\nTich: " + mul + "\nThuong: " + div);
        System.out.println("-------------");
        //Bai 6: Nhập tên sp, số lượng, đơn giá. Tính tiền=số lượng*đơn giá & thuế=10%tiền
        System.out.println("Bài 6:");
        String nameProduct = "Juice";
        int amount = 100;
        double price = 5.1;
        double total = amount * price;
        double tax = (total * 10) / 100;
        System.out.println("juice has " + amount + " pieces, price is " + price + " $" + "\nTotal: " + total + " and tax: " + tax);
        System.out.println("-------------");
        //Bai 7: Nhập điểm thi & Toán,Lý,Hoá hệ số 3. Tính điểm trung bình
        System.out.println("Bài 7:");
        double toan = 8.5;
        double ly = 8.5;
        double hoa = 4;
        double van = 7.0;
        double anh = 5;
        double su = 7.8;
        double dia = 8.5;
        double GDCD = 3;
        double averageSub = (toan * 3 + ly * 3 + hoa * 3 + van + anh + su + dia + GDCD) / 14;
        System.out.println("Diem trung binh: " + averageSub);
        System.out.println("-------------");
        //Bai 8: Nhập bán kính đường tròn. Tính chu vi & diện tích
        System.out.println("Bài 8:");
        final double PI = 3.14;
        int banKinh = 4;
        double chuVi = 2 * banKinh * PI;
        double dienTich = banKinh * banKinh * PI;
        System.out.println("Chu vi: " + chuVi + "\tDien tich: " + dienTich);
        System.out.println("-------------");
        //Bai 9: Nhập vào số xe (tối đa 5 chữ số). Tính số nút
        System.out.println("Bài 9:");
        String soXe = "99999";
        System.out.println("Số xe: " + soXe);
        int nut;
        int tongNut = 0;
        for (int i = 0; i <= soXe.length() - 1; i++) {
            nut = Integer.parseInt(String.valueOf(soXe.charAt(i)));
//            System.out.println(nut);
            tongNut = tongNut + nut;
        }
        System.out.println("Tong so nut la: " + tongNut);
        if (tongNut > 10) {
            String stringTongNut = String.valueOf(tongNut);
            char kq = stringTongNut.charAt(stringTongNut.length() - 1);
            System.out.println("Kết quả là: " + kq);
        } else {
            System.out.println("Kết quả là: " + tongNut);
        }
        System.out.println("-------------");
        //Bai 10: Nhập 2 số nguyên. Tính min & max
        System.out.println("Bài 10:");
        int num1 = 20;
        int num2 = 21;
        System.out.println("Số a= " + num1 + "\tSố b= " + num2);
        if (num1 > num2) {
            System.out.println("Số " + num1 + " là max");
            System.out.println("Số " + num2 + " là min");
        } else {
            System.out.println("Số " + num1 + " là min");
            System.out.println("Số " + num2 + " là max");
        }
        System.out.println("-------------");
    }
}
