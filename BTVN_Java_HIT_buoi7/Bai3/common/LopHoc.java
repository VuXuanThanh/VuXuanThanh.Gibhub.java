package Bai3.common;

import java.util.Scanner;

public class LopHoc {
    private String maLop,tenLop;
    private int ngayMo;
     SinhVien[] x;
    private int n;
    private String giaoVien;


    public LopHoc() {

    }

    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma lop: ");
        maLop=scan.nextLine();
        System.out.println("nhap ten lop: ");
        tenLop=scan.nextLine();
        System.out.println("nhap ngay mo: ");
        ngayMo=Integer.parseInt(scan.nextLine());
        System.out.println("nhap n: ");
        n=Integer.parseInt(scan.nextLine());
        System.out.println("nhap ten giao vien: ");
        giaoVien=scan.nextLine();
        x = new SinhVien[n];
        for(int i=0;i<x.length;i++){
            x[i] = new SinhVien();
            x[i].input();
        }
    }

    public void output(){
        System.out.println("Ngay mo: "+ngayMo);
        System.out.println("Ten lop: "+tenLop);
        System.out.println("ten giao vien: "+giaoVien);
        System.out.println("thong tin sinh vien: ");
        for(SinhVien sv: x){
            sv.output();
        }
        System.out.println("Lop co "+n+" sinh vien!!!");
    }
    public void sapXep(){
        int temp;
        for(int i=0;i<x.length;i++){
           for(int j=i+1;j<x.length;j++){
               if(x[i].khoaHoc>x[j].khoaHoc){
                       temp=x[j].khoaHoc;
                       x[j].khoaHoc=x[i].khoaHoc;
                       x[i].khoaHoc=temp;

               }
           }
        }
        for(SinhVien sv: x){
            System.out.println(sv.khoaHoc);
        }
    }
    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(int ngayMo) {
        this.ngayMo = ngayMo;
    }

    public SinhVien[] getX() {
        return x;
    }

    public void setX(SinhVien[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }
}
