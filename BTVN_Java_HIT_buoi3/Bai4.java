import java.util.Scanner;

public class Bai4 {
    // Kiểm tra chuỗi hoàn thiện
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String chuoiHT="hello";
        System.out.println("Nhập chuỗi cần kiểm tra:");
        String chuoiKTra=scanner.nextLine();
        int dem=0;
        for(int i=0;i<chuoiKTra.length();i++){
            if(chuoiHT.charAt(dem)==chuoiKTra.charAt(i))
                dem++;
        }
        if(dem==5)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
