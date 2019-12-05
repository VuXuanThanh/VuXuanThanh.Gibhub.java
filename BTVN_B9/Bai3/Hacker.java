package Bai3;

public class Hacker {
    private String ten, diaChi;
    private int namSinh;
    private String soThich;

    public Hacker() {
    }

    public Hacker(String ten, String diaChi, int namSinh,String soThich) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
        this.soThich = soThich;
    }

    public void HienThiThongTin(){
        System.out.println("ten: "+ten);
        System.out.println("Nam sinh: "+namSinh);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("So thich: "+soThich);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }
}
