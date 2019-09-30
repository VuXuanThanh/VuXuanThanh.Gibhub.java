package basic;

public class ontap {
    private static int max(int[] a,int n){
        int temp = a[0];
        for (int i : a){
            if( i > temp ) temp = i;
        }
        return temp;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Gia tri lon nhat cua mang a la: " + max(arr,arr.length));
    }
}
