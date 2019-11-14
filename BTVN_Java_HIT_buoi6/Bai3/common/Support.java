package Bai3.common;

public class Support {
    private String ten;
    private int tuoi;
    private Member tenTV;

    public Support() {
    }

    public Support(String ten, int tuoi){
        this.ten=ten;
        this.tuoi=tuoi;
    }
    public Support(String ten, int tuoi, Member tenTV){
        this.ten=ten;
        this.tuoi=tuoi;
        this.tenTV=tenTV;
    }

    public Support(Member tenTV) {
        this.tenTV = tenTV;
    }

    public void hienThi(){
        System.out.println("thong tin ve support: ");
        System.out.println("Ten suport: "+ten);
        System.out.println("Tuoi suport: "+tuoi);
        System.out.println();
    }
    public void inThanhVien(){
        System.out.println(tenTV);
    }
}
