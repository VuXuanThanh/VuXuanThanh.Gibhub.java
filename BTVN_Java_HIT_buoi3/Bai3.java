import java.util.Scanner;

public class Bai3 {
    static int []a;
    static int n;
    public static void nhapMang(){
        Scanner scanner = new Scanner(System.in);
        for(int j=0;j<n;j++){
            System.out.println("nhập a["+j+"]: ");
            a[j]=scanner.nextInt();
        }
    }
    public static void xuatMang(){
        for(int j=0;j<n;j++){
            System.out.print(a[j]+ " ");
        }
    }
    public static void chen(int k){
        for(int j=a.length-1;j>k;j--){
            a[j]=a[j-1];
        }
        a[k]=100;
        n++;
        xuatMang();
    }
    public static void xoa(int x){
        for(int j=x;j<n-1;j++){
            a[j]=a[j+1];
        }
        n--;
        xuatMang();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        n = scanner.nextInt();
        a = new int[n+1];
        int i=1,k,x;
        while(i<=7){
            int chon;
            System.out.println("\nMời nhập số trong menu lần "+i+": ");
            chon =scanner.nextInt();
            switch(chon){
                case 1:
                    nhapMang();
                   break;
                case 2:
                    xuatMang();
                    break;
                case 3:
                    System.out.println("Nhập vị trí cần xóa: ");
                    x=scanner.nextInt();
                    xoa(x);
                    break;
                case 4:
                    System.out.println("nhập vị trí cần chèn: ");
                    k=scanner.nextInt();
                    chen(k);
                    break;
                case 5:
                    System.out.println("đảo ngược mảng: ");
                    for(int j=n-1;j>=0;j--){
                        System.out.print(a[j]+ "  ");
                    }
                    break;
                case 6:
                    System.out.println("giá trị a[1]: "+ a[1]);
                    System.out.println("các số chia hết cho a[1]: ");
                    for(int j=0;j<n;j++){
                        if(a[j]%a[1]==0)
                            System.out.print(a[j]+" ");
                    }
                default:
                    break;
            }
            i++;
        }
    }
}
