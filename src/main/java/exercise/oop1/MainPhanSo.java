package exercise.oop1;

public class MainPhanSo {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(5, 8);
        PhanSo ps2 = new PhanSo(2, 4);
        //Xuat phan so
        ps1.print();
        System.out.print("\t");
        ps2.print();
        //Ktra toi gian
        if (ps1.ktToiGian()) {
            System.out.println();
            ps1.print();
            System.out.print(" Phan so toi gian");
        } else {
            System.out.println();
            ps1.print();
            System.out.print(" Phan so chua toi gian");
        }
        if (ps2.ktToiGian()) {
            System.out.println();
            ps2.print();
            System.out.println(" Phan so toi gian");
        } else {
            System.out.println();
            ps2.print();
            System.out.println(" Phan so chua toi gian");
        }
        //Tong
        System.out.print("\nTong:  ");
        PhanSo psCong = ps1.congPhanSo(ps2).rutGon();
        psCong.print();
        //Hieu
        System.out.print("\nHieu:  ");
        PhanSo psHieu = ps1.truPhanSo(ps2).rutGon();
        psHieu.print();
        //Tich
        System.out.print("\nTich:  ");
        PhanSo psTich = ps1.nhanPhanSo(ps2);
        psTich.print();
        //Rut gon
        System.out.print("\nPhan so tich sau khi rut gon: ");
        PhanSo psRutGon = psTich.rutGon();
        psRutGon.print();
        //Thuong
        System.out.print("\nThuong:  ");
        PhanSo psThuong = ps1.chiaPhanSo(ps2).rutGon();
        psThuong.print();
        //Quy dong
        System.out.print("\n2 phan so da quy dong: ");
        PhanSo[] psQuyDong = ps1.quyDong2PS(ps2);
        psQuyDong[0].print();
        psQuyDong[1].print();
        //Phan so am dương
        if (ps1.ktPhanSoAm()) {
            System.out.println();
            ps1.print();
            System.out.println(" la phan so am");
        } else {
            System.out.println();
            ps1.print();
            System.out.println(" la phan so duong");
        }
        // so sanh 2 pha so
        ps1.isBigger(ps2);
    }
}
