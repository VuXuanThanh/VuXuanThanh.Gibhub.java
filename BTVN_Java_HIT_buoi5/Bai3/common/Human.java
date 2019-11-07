package Bai3.common;

import java.util.Scanner;

public class Human {
    public String name;
    public int HP;
    public int dmg;

    Scanner scanner = new Scanner(System.in);
    public void nhapThongTin(){
        System.out.println("nhap ten: ");
        name=scanner.nextLine();
        System.out.println("nhap HP:");
        HP=scanner.nextInt();
        System.out.println("nhap dmg: ");
        dmg=scanner.nextInt();
        scanner.nextLine();
    }
    public void hienThi(){
        System.out.println("ten: "+name);
        System.out.println("HP: "+HP);
        System.out.println("dmg: "+dmg);
    }
}
