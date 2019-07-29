package tugasstrukturdata;

import java.util.Scanner;

public class ReverseSum {
    public static void main(String[] args) {
        int x, z, a, b, m = 0, n = 0, all;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Pertama : ");
        x = s.nextInt();
        System.out.print("Masukkan Bilangan Kedua : ");
        z = s.nextInt();
        
        do{
            a = x % 10;
            m = m * 10+a;
            x = x / 10;
        }
        while(x>0);
        do{
            b = z % 10;
            n = n * 10 + b;
            z = z / 10;
        }
        while(z>0);
        
        System.out.println("Hasil reverse bilangan pertama : "+m);
        System.out.println("Hasil reverse bilangan kedua : "+n);
        
        System.out.println("Penjumlahan Kedua Bilangan Reverse");
        all = m + n;
        System.out.println(all);
    }
}