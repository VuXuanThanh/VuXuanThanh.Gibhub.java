package Bai3.common;

public class Leader {
    private String ten;
    private int tuoi;
    private int soNgayLD;

    public Leader(){

    }
    public Leader(String ten, int tuoi, int soNgayLD){
        this.ten=ten;
        this.tuoi=tuoi;
        this.soNgayLD=soNgayLD;
    }
    public void hienThiThongTin(){
        System.out.println("thong tin ve leader: ");
        System.out.println("Ten leader: "+ten);
        System.out.println("Tuoi leader: "+tuoi);
        System.out.println("So ngay lanh dao cua leader: "+soNgayLD);
        System.out.println();
    }
}
