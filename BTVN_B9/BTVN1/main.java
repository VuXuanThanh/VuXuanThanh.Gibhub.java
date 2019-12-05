package BTVN1;

public class main {
    public static int TinhTong(int a, int b, int c){
        return a+b+c;
    }
    public static int TinhTheoCongThuc(int a, int b, int c){
        return ((a/b)-c)/2;
    }
    public static String chuyenThanhString(int a, int b, int c){
        return String.valueOf(a)+String.valueOf(b)+String.valueOf(c);
    }
    public static void HienThiHam(int a, int b, int c){
        System.out.println(TinhTong(a,b,c));
        System.out.println(TinhTheoCongThuc(a,b,c));
        System.out.println(chuyenThanhString(a,b,c));
    }
    public static void main(String[] args) {

        HienThiHam(10,9,8);

    }
}
