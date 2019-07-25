package tugasstrukturdata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertListUrut {
    public static void main(String[] args) {
        List daftarAngka = new ArrayList ();
        daftarAngka.add("2");
        daftarAngka.add("5");
        daftarAngka.add("1");
        daftarAngka.add("3");
        daftarAngka.add("4");

        System.out.println("Sebelum Diurutkan");
        System.out.println(daftarAngka);

        Collections.sort(daftarAngka);
        System.out.println("Setelah Diurutkan");
            System.out.println(daftarAngka);
    }

}