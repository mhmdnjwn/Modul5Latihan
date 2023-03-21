package Latihan1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Komsumsi> listKomsumsi = new ArrayList<>();
        Komsumsi<Makanan, Minuman> breakfast = new Komsumsi<>();
        Komsumsi<Makanan, Minuman> launch = new Komsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKomsumsi(roti, susu);
        listKomsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Nasi Putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");
        launch.setKomsumsi(nasi, air);
        listKomsumsi.add(launch);

        System.out.println("Menu Komsumsi");
        for (Komsumsi<Makanan,Minuman> komsumsi: listKomsumsi){
            Makanan makanan = komsumsi.getM();
            Minuman minuman = komsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }
    }
}
