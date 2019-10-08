import java.util.Scanner;
// Em làm gộp luôn bài 1,2,3,4 anh nhé :))
public class bai1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, This is my first application");
        int n;
        float m;
        String xau;
        System.out.println("Nhập vào 1 xâu kí tự: ");
        xau = scanner.nextLine();
        System.out.println("Nhập 1 số nguyên: ");
        n = scanner.nextInt();
        System.out.println("Nhập 1 số thực: ");
        m = scanner.nextFloat();
        System.out.println("số nguyên vừa nhập: "+ n);
       System.out.println("số thực vừa nhập: "+ m);
        System.out.println("Xâu vừa nhập: " + xau);


    }

}
