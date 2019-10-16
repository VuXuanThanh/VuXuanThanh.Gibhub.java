import java.util.Scanner;
// Tìm số lớn thứ 3 trong dãy số có n số nguyên.
public class Bai1 {
    public static void nhap(int []a){
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.println("nhập số thứ "+(i+1)+": ");
            a[i]=scanner.nextInt();
        }
    }
    public static void xuat(int []a){
        for(int i:a){
            System.out.print(i+" ");
        }
    }
    public static void sapXep(int []a){
        int temp=a[0];
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("nhập số các số nguyên: ");
        n=scanner.nextInt();
        int []a= new int [n];
        nhap(a);
        xuat(a);
        sapXep(a);
        System.out.println("\nGiá trị lớn thứ 3 trong dãy số là: "+ a[2]);
    }
}
