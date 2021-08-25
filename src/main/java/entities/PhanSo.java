package entities;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public void print(){
        System.out.format("%d/%d\n",tuSo,mauSo);
    }
    public void init(int tuSo, int mauSo){
        this.tuSo=tuSo;
        this.mauSo=mauSo;
    }
//    public static void formString(String str){//ham bên ngoài đối tượng (tên lớp.tên hàm)
//        System.out.println(str);//Khong gọi được các thành phần trong class
//    }
//    public  PhanSo fromString(String str){
//        String[]parts=str.split("/");
//        this.tuSo=Integer.parseInt(parts[0]);
//        this.mauSo=Integer.parseInt(parts[1]);
//        return this;
//    }
public  static PhanSo fromString(String str){
    String[]parts=str.split("/");
    PhanSo ps=new PhanSo();
    ps.tuSo=Integer.parseInt(parts[0]);
    ps.mauSo=Integer.parseInt(parts[1]);
    return ps;
}
}
