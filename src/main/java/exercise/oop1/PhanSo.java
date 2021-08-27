package exercise.oop1;

public class PhanSo {
    /*Phân số
         Khai báo kiểu dữ liệu phân số (PHANSO)
         Nhập/Xuất phân số
         Rút gọn phân số
         Tính tổng, hiệu, tích, thương hai phân số
         Kiểm tra phân số tối giản
         Quy đồng hai phân số
         Kiểm tra phân số âm hay dương
         So sánh hai phân số
     */
    private int _tuSo;
    private int _mauSo;

    //Nhap phan so
    public PhanSo(int tuSo, int mauSo) {
        this._tuSo = tuSo;
        this._mauSo = mauSo;
    }

    public PhanSo() {
    }

    public int get_tuSo() {
        return _tuSo;
    }

    public int get_mauSo() {
        return _mauSo;
    }

    //Xuat phan so
    public void print() {
        if (this._tuSo == this._mauSo) {
            System.out.println(1);
        } else {
            System.out.format("%d/%d", this._tuSo, this._mauSo);
        }
    }

    @Override
    public String toString() {
        if (this._tuSo == this._mauSo) {
            return 1 + "";
        } else {
            return String.format("%d/%d", this._tuSo, this._mauSo);
        }
    }

    //So sánh 2 phan so
    public int compareTo(PhanSo ps) {
        long tmp1 = (long) this._tuSo * ps._mauSo;
        long tmp2 = (long) ps._tuSo * this._mauSo;
        if (tmp1 > tmp2) {
            return 1;//this > ps
        } else if (tmp1 < tmp2) {
            return -1;// this < ps
        }
        return 0; //this = ps
    }

    //Kiem tra phan so am dương
    public boolean isNegative() {
        if (this._tuSo == 0)
            return false;

        if (this._tuSo > 0 && this._mauSo > 0)
            return false;

        if (this._tuSo < 0 && this._mauSo < 0)
            return false;

        return true;
    }

    //UCLN
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    //Kiem tra phan so toi gian nhan vao string
    public boolean isReducible() {
        int gcd = gcd(Math.abs(this._tuSo), Math.abs(this._mauSo));
        if (gcd == 1) {
            return false;
        }
        return true;
    }

    //Rut gon phan so
    public void rutGon() {
        int gcd = gcd(Math.abs(this._tuSo), Math.abs(this._mauSo));//tru ra so am sẽ bị loi nên dể trij tuyệt đối
        this._tuSo = this._tuSo / gcd;
        this._mauSo = this._mauSo / gcd;
    }

    //Cong phan so
    public void plus(PhanSo ps2) {
        if (this._mauSo == ps2._mauSo) {
            this._tuSo = this._tuSo + ps2._tuSo;
            this._mauSo = ps2._mauSo;
        } else {
            this._tuSo = (this._tuSo * ps2._mauSo) + (ps2._tuSo * this._mauSo);
            this._mauSo = this._mauSo * ps2._mauSo;
        }
    }

    //Tru phan so
    public void sub(PhanSo ps2) {
        if (this._mauSo == ps2._mauSo) {
            this._tuSo = this._tuSo - ps2._tuSo;
            this._mauSo = ps2._mauSo;
        } else {
            this._tuSo = (this._tuSo * ps2._mauSo) - (ps2._tuSo * this._mauSo);
            this._mauSo = this._mauSo * ps2._mauSo;
        }
    }

    //tich phan so
    public void mul(PhanSo ps) {
        this._tuSo = this._tuSo * ps._tuSo;
        this._mauSo = this._mauSo * ps._mauSo;
    }

    //thuong phan so
    public void div(PhanSo ps) {
        this._tuSo = this._tuSo * ps._mauSo;
        this._mauSo = this._mauSo * ps._tuSo;
    }

    public static PhanSo fromString(String str) {
        String[] parts = str.split("/");
        PhanSo ps = new PhanSo();
        ps._tuSo = Integer.parseInt(parts[0]);
        ps._mauSo = Integer.parseInt(parts[1]);
        return ps;
    }
}
