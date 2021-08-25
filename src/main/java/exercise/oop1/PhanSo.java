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

    //khoi tao phan so rong
    public PhanSo() {
    }

    //Xuat phan so
    public void print() {
        if (_tuSo == _mauSo) {
            System.out.println(1);
        } else {
            System.out.format("%d/%d", _tuSo, _mauSo);
        }
    }

    //So sánh 2 phan so
    public void isBigger(PhanSo ps) {
        PhanSo thisPS = new PhanSo(this._tuSo, this._mauSo);
        thisPS = thisPS.truPhanSo(ps);
        if (thisPS.ktPhanSoAm()) {
            System.out.format("%d/%d < %d/%d", this._tuSo, this._mauSo, ps._tuSo, ps._mauSo);
        } else if (!thisPS.ktPhanSoAm()) {
            System.out.format("%d/%d > %d/%d", this._tuSo, this._mauSo, ps._tuSo, ps._mauSo);
        } else {
            System.out.format("%d/%d = %d/%d", this._tuSo, this._mauSo, ps._tuSo, ps._mauSo);
        }
    }

    //Kiem tra phan so am dương
    public boolean ktPhanSoAm() {
        if (this._tuSo > 0 && this._mauSo > 0) {
            return false;
        }
        return true;
    }

    //Quy dong 2 phan so
    public PhanSo[] quyDong2PS(PhanSo ps1) {
        PhanSo newPS1 = new PhanSo();
        PhanSo newPS2 = new PhanSo();
        if (this._mauSo % ps1._mauSo == 0) {
            int temp = this._mauSo / ps1._mauSo;
            newPS1._tuSo = ps1._tuSo * temp;
            newPS1._mauSo = ps1._mauSo * temp;
            newPS2._tuSo = this._tuSo;
            newPS2._mauSo = this._mauSo;
        } else {
            newPS1._tuSo = ps1._tuSo * this._mauSo;
            newPS1._mauSo = ps1._mauSo * this._mauSo;
            newPS2._tuSo = this._tuSo * ps1._mauSo;
            newPS2._mauSo = this._mauSo * ps1._mauSo;
        }

        PhanSo[] arrPS = new PhanSo[]{newPS1.rutGon(), newPS2, rutGon()};
        return arrPS;
    }

    //UCLN
    public int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return UCLN(b, a % b);
        }
    }

    //Kiem tra phan so toi gian nhan vao string
    public boolean ktToiGian() {
        PhanSo ps = new PhanSo(this._tuSo, this._mauSo);
        for (int i = 2; i <= ps._tuSo && i <= ps._mauSo; i++) {
            if (ps._tuSo == ps._mauSo) {
                return true;
            } else if ((ps._tuSo % i == 0) && (ps._mauSo % i == 0)) {
                return false;
            }
        }
        return true;
    }

    //Rut gon phan so
    public PhanSo rutGon() {
        PhanSo newPS = new PhanSo();
        int ucln = UCLN(this._tuSo, this._mauSo);
        newPS._tuSo = this._tuSo / ucln;
        newPS._mauSo = this._mauSo / ucln;
        return newPS;
    }

    //Cong phan so
    public PhanSo congPhanSo(PhanSo ps2) {
        PhanSo ps1 = new PhanSo();
        if (this._mauSo == ps2._mauSo) {
            ps1._tuSo = this._tuSo + ps2._tuSo;
            ps1._mauSo = ps2._mauSo;
        } else {
            ps1._tuSo = (this._tuSo * ps2._mauSo) + (ps2._tuSo * this._mauSo);
            ps1._mauSo = this._mauSo * ps2._mauSo;
        }
        return ps1;
    }

    //Tru phan so
    public PhanSo truPhanSo(PhanSo ps2) {
        PhanSo ps1 = new PhanSo();
        if (this._mauSo == ps2._mauSo) {
            ps1._tuSo = this._tuSo - ps2._tuSo;
            ps1._mauSo = ps2._mauSo;
        } else {
            ps1._tuSo = (this._tuSo * ps2._mauSo) - (ps2._tuSo * this._mauSo);
            ps1._mauSo = this._mauSo * ps2._mauSo;
        }
        return ps1;
    }

    //tich phan so
    public PhanSo nhanPhanSo(PhanSo ps) {
        PhanSo ps1 = new PhanSo();
        ps1._tuSo = this._tuSo * ps._tuSo;
        ps1._mauSo = this._mauSo * ps._mauSo;
        return ps1;
    }

    //thuong phan so
    public PhanSo chiaPhanSo(PhanSo ps) {
        PhanSo ps1 = new PhanSo();
        ps1._tuSo = this._tuSo * ps._mauSo;
        ps1._mauSo = this._mauSo * ps._tuSo;
        return ps1;
    }
}
