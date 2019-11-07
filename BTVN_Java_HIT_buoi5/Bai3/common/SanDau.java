package Bai3.common;

public class SanDau {
  private Human human1;
  private Human human2;

   public void taoNguoi(){
      human1.nhapThongTin();
      human1.nhapThongTin();
   }
   public void Danh(){
       System.out.println("nguoi 1 danh: ");
       for(int i=0;i<4;i++){
           System.out.println("lan "+ (i+1));
           human2.HP-=human1.dmg;
           if(human2.HP<0){
               break;
           }
           else{
               human1.hienThi();
               human2.hienThi();
           }
       }
       System.out.println("nguoi 2 danh: ");
       for(int i=0;i<5;i++){
           System.out.println("lan "+(i+1));
           human1.HP-=human2.dmg;
           if(human1.HP<0){
               break;
           }
           else{
               human1.hienThi();
               human2.hienThi();
           }
       }
       System.out.println("ket qua winner la: ");
       if(human1.HP<human2.HP){
           human2.hienThi();
       }
       else{
           human1.hienThi();
       }
   }

}
