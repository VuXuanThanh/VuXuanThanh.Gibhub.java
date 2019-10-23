package Bai3;

import java.util.Scanner;

public class javaClass {
    private student stdList[];
    private int ratingStar;
    private int n;
    private String leader;

    public void inStudent(){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("nhap so sinh vien: ");
        n = scan.nextInt();
        this.n =n;
        for(int i=1;i<=n;i++){
            stdList[i].inFor();
        }
    }
    public void showStudent(){
        for(int i=1;i<=n;i++){
            stdList[i].outFor();
        }
    }
    public void InputClassInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap ten leader: ");
         this.leader = scan.nextLine();
         this.ratingStar= scan.nextInt();
        inStudent();
    }
    public void ShowClassInfo(){
        System.out.println(leader);
        System.out.println(ratingStar);
        showStudent();
    }

}
