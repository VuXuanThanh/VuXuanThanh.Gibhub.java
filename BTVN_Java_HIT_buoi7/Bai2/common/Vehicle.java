package Bai2.common;

import java.util.Scanner;

public class Vehicle {
    protected String nhanHieu, Hang;
    protected int namSX;

    public Vehicle(){

    }
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap nhan hieu: ");
        nhanHieu=scan.nextLine();
        System.out.println("Nhap nam san xuat: ");
        namSX=Integer.parseInt(scan.nextLine());
        System.out.println("nhap hang: ");
        Hang=scan.nextLine();
    }
    public void output(){
        System.out.println("nhan hieu: "+nhanHieu);
        System.out.println("Nam san xuat: "+namSX);
        System.out.println("Hang: "+Hang);
    }
    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String hang) {
        Hang = hang;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }
}
