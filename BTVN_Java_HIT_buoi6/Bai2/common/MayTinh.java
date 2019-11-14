package Bai2.common;

public class MayTinh {

    public float TinhTong(float a, float b){
        return a+b;
    }
    public float TinhTong(float a, float b, float c){
        return a+b+c;
    }
    public float TinhTong(float []arr){
        float tong=0;
        for(int i=0;i<arr.length;i++){
            tong+=arr[i];
        }
        return tong;
    }


}
