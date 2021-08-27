package exercise.oop1;

public class DonThuc {//a.x^n
    /*
§ Khai báo kiểu dữ liệu đơn thức (DONTHUC)
§ Nhập/Xuất đơn thức
§ Tính tích, thương hai đơn thức
§ Tính đạo hàm cấp 1 của đơn thức
§ Tính đạo hàm cấp n của đơn thức
§ Tính giá trị đơn thức tại x = x0
     */

    private int a;
    private int x;
    private int n;//số mũ

    //Nhap don thuc
    public DonThuc(int a, int n) {
        this.a = a;
        this.n = n;
    }

    public DonThuc(int x0) {
        this.x = x0;
    }

    @Override
    public String toString() {
        return String.format(" %d(x)^%d ", this.a, this.n);
    }

    //tich
    public DonThuc mulMonomial(DonThuc dt) {
        this.a = this.a * dt.a;
        this.n = this.n + dt.n;
        return this;
    }

    //thuong
    public DonThuc divMonomial(DonThuc dt) {
        this.a = this.a / dt.a;
        this.n = this.n - dt.n;
        return this;
    }

    //đạo hàm bậc 1
    public void firstDerivative() {
        this.a *= this.n;
        this.n--;
    }

    //Dao ham bac n
    public void nthDerivative(int n) {
        if (n > this.n) {
            System.out.println("Can not Derivative of " + n);
        } else {
            while (n > 0) {
                this.a *= this.n;
                this.n--;
                n--;
            }
        }
    }

    //Tinh gia tri don thuc khi biết x=X0 2^3
    public long valueDervative(int x) {
        long res = 1;
        if (this.n == 1) {
            return this.a * x;
        } else if (this.n == 0) {
            return this.a;
        } else {
            for (int i = 0; i < this.n; i++) {
                res = res * x;
            }
            return this.a * res;
        }
    }
}
