package tugasstrukturdata;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] x = {2, 4, 6};
        int[] z = {8, 10, 16};
        int sumX = 0;
        int sumZ = 0;
        int jumlah;
        
        for(int num : x){
            sumX = sumX+num;
        }
        for(int num : z){
            sumZ = sumZ+num;
        }
        jumlah = sumX + sumZ;
        
        System.out.println("Jumlah Nilai Kedua Array : "+jumlah);
        
        int[] xz = new int[x.length+z.length];
        System.arraycopy(x, 0, xz, 0, z.length);
        System.arraycopy(z, 0, xz, x.length, z.length);
        
        System.out.println("Menggabungkan Kedua Array");
        System.out.println(Arrays.toString(xz));
    }
}
