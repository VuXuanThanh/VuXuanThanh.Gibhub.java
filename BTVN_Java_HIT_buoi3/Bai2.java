import java.util.Scanner;
// Tính tổng các số trong chuỗi.
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tong=0;
        System.out.println("Nhập 1 chuỗi kí tự: ");
        String chuoi = scanner.nextLine();
        for(int i=0; i<chuoi.length();i++){
            if(chuoi.charAt(i)>'0'&&chuoi.charAt(i)<'9'){
                tong+=((int)chuoi.charAt(i)-48);
            }
        }
        System.out.println("tổng các số trong chuỗi là: "+tong);
    }
}
