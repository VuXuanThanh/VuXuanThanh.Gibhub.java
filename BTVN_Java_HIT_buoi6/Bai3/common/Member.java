package Bai3.common;

public class Member {
    public String ten;
    private int ngayHD;
    private int soNgayNghi;

    public Member(String ten, int ngayHD, int soNgayNghi){
        this.ten=ten;
        this.ngayHD=ngayHD;
        this.soNgayNghi=soNgayNghi;
    }

    public void hienThi(){
        System.out.println("ten: "+ten);
        System.out.println("Ngay hoat dong: "+ngayHD);
        System.out.println("So ngay nghi: "+soNgayNghi);
        System.out.println();
    }
}
