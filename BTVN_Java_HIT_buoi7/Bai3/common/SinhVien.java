package Bai3.common;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    private int maSV;
    private String Nganh;
    public int khoaHoc;

    public SinhVien(){

    }
    @Override
    public void input(){
        Scanner scan = new Scanner(System.in);
        super.input();
        System.out.println("nhap ma sinh vien: ");
        maSV=Integer.parseInt(scan.nextLine());
        System.out.println("nhap nganh: ");
        Nganh=scan.nextLine();
        System.out.println("Nhap khoa hoc: ");
        khoaHoc=scan.nextInt();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Ma sinh vien: "+maSV);
        System.out.println("Nganh hoc: "+Nganh);
        System.out.println("Khoa hoc: "+khoaHoc);
    }
    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
}
