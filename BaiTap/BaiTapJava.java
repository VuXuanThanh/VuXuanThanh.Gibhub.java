package BaiTap;

import java.util.Scanner;
// Khai bao mang
public class BaiTapJava {

    public static int nguyenTo(int n){
        int dem=0;
        for(int j=1;j<=n;j++){
            if(n%j==0)
                dem++;
        }
        if(dem==2)
            return 2;
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            if(nguyenTo(i)==2)
                System.out.println(i);
        }

    }
}