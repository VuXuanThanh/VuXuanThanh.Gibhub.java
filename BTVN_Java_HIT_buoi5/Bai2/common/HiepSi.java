package Bai2.common;

import java.util.Scanner;

public class HiepSi {
    public String name;
    public int HP;
    public int MP;

    public HiepSi(){
    }
    public HiepSi(String name, int HP, int MP){
        this.name=name;
        this.HP=HP;
        this.MP=MP;
    }
   public void nhapThongTin(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("nhap ten: ");
       name=scanner.nextLine();
       System.out.println("nhap HP: ");
       HP=scanner.nextInt();
       System.out.println("nhap MP: ");
       MP=scanner.nextInt();
   }
   public void hoiMau(){
        MP+=30;
        HP-=50;
   }
   public void inThongTin(){
       System.out.println("HP: "+HP);
       System.out.println("MP: "+MP);
   }
}
