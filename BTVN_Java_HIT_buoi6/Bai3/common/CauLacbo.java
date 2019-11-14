package Bai3.common;

public class CauLacbo {
    private Leader A;
    private Support B;
    private Member C;

    public CauLacbo(){
    }
    public CauLacbo(Leader A, Support B){
        this.A=A;
        this.B=B;
    }

    public CauLacbo(Member C){
        this.C=C;
    }

    public Member getC(Member C) {
        return C;
    }

    public void hienThiThongTin(){
        System.out.println("Leader: ");
        A.hienThiThongTin();
        System.out.println("Support: "+B);
        B.hienThi();
        System.out.println();
    }
    public void Display(Member C){
        C.hienThi();
    }
}
