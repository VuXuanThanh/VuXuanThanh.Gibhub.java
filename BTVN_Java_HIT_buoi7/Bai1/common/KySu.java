package Bai1.common;

import java.util.Scanner;

public class KySu extends Person {
    private String Nganh;
    public int namTotNghiep;


    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        hoTen=scan.nextLine();
        System.out.println("Nhap ngay sinh:  ");
        ngaySinh=Integer.parseInt(scan.nextLine());
        System.out.println("Nhap que: ");
        que=scan.nextLine();
        System.out.println("nhap nganh: ");
        Nganh =scan.nextLine();
        System.out.println("Nhap nam tot nghiep: ");
        namTotNghiep=scan.nextInt();
    }
    public void output(){
        System.out.println("Ho & ten: "+hoTen);
        System.out.println("Ngay sinh: "+ngaySinh);
        System.out.println("Que quan: "+que);
        System.out.println("Nganh: "+Nganh);
        System.out.println("Nam tot nghiep: "+namTotNghiep);
    }


}
