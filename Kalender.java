package tugasstrukturdata;

import java.util.Scanner;

public class Kalender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hari = 0, tanggal, bulan, tahun;
        boolean Tanggal, Bulan, Valid;
        String hasil, namaBulan = null;
        
        System.out.print("Masukkan Tanggal : ");
        tanggal = input.nextInt();
        System.out.print("Masukkan Bulan : ");
        bulan = input.nextInt();
        System.out.print("Masukkan Tahun : ");
        tahun = input.nextInt();
        
        if(bulan == 1){
            hari = 31;
            namaBulan = "Januari";
        }
        else if(bulan == 2){
            if((tahun % 4 == 0 && tahun % 100!=0) || tahun % 400 == 0){
                hari = 29;
                namaBulan = "Februari";
            }
            else{
                hari = 28;
                namaBulan = "Februari";
            } 
        }
        else if(bulan == 3){
            hari = 31;
            namaBulan = "Maret";
        }
        else if(bulan == 4){
            hari = 30;
            namaBulan = "April";
        }
        else if(bulan == 5){
            hari = 31;
            namaBulan = "Mei";
        }
        else if(bulan == 6){
            hari = 30;
            namaBulan = "Juni";
        }
        else if(bulan == 7){
            hari = 31;
            namaBulan = "Juli";
        }
        else if(bulan == 8){
            hari = 30;
            namaBulan = "Agustus";
        }
        else if(bulan == 9){
            hari = 31;
            namaBulan = "September";
        }
        else if(bulan == 10){
            hari = 30;
            namaBulan = "Oktober";
        }
        else if(bulan == 11){
            hari = 31;
            namaBulan = "November";
        }
        else if(bulan == 12){
            hari = 30;
            namaBulan = "Desember";
        }
        else{
            hari = -1;
            namaBulan = Integer.toString(bulan);
        }
        
        Tanggal = tanggal >=1 && tanggal <= hari;
        Bulan = bulan >=1 && bulan <=12;
        Valid = Tanggal && Bulan;
        
        if(Valid){
            hasil = " Merupakan tanggal yang valid.";
        }
        else{
            hasil = " Merupakan tanggal yang tidak valid.";
        }
        
        System.out.println("\n"+tanggal+" "+namaBulan+" "+tahun+hasil);
    }
}
