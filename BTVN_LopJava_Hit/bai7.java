import java.util.Scanner;
// em  gộp bài 7,8 ạ!!
public class bai7 {
    public static void main(String[] args) {
        float a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a: ");
        a = scanner.nextFloat();
        System.out.println("nhập số b: ");
        b = scanner.nextFloat();
        System.out.println("nhập số c: ");
        c = scanner.nextFloat();
        System.out.println("max của a va b: "+ Math.max(a,b));
        System.out.println("max của 3 số: "+ Math.max(Math.max(a,b),c));
    }
}
