package Bai4.common;

public class SanDau {
    private Human human1;
    private Human human2;

    public void taoNguoi(){
      human1.nhapThongTin();
      human2.nhapThongTin();
    }
    public void Danh(){
        while(human2.HP>0&&human1.HP>0){
            human1.HP-=human2.dmg;
            human2.HP-=human1.dmg;
            human1.hienThi();
            human2.hienThi();
        }
        if(human2.HP>human1.HP){
            System.out.println(human2.name);
        }
        else{
            System.out.println(human1.name);
        }
    }
}
