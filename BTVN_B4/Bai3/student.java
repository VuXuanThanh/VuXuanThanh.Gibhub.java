package Bai3;

import java.util.Scanner;

public class student {
    private String name;
    private String code;
    private int age;

    public void inFor(){
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap ten: ");
        name= scan.nextLine();
        System.out.println("nhap ma sinh vien: ");
        code = scan.nextLine();
        System.out.println("nhap tuoi: ");
        age = scan.nextInt();
    }
    public void outFor(){
        System.out.println("ten: "+name+";"+"ma sv: "+code+";"+"tuoi: "+age);
    }
}
