package modul1;

import java.util.Scanner;

public class Segitiga<T extends Number> {
    private T alas;
    private T tinggi;

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai alas: ");
        this.alas = (T) Integer.valueOf(input.nextInt());
        System.out.print("Masukkan nilai tinggi: ");
        this.tinggi = (T) Integer.valueOf(input.nextInt());
    }

    public int getResultAsInt() {
        return (this.alas.intValue() * this.tinggi.intValue()) / 2;
    }

    public double getResultAsDouble() {
        return (this.alas.intValue() * this.tinggi.intValue()) / 2.0;
    }

    public static void main(String[] args) {
        Segitiga<Integer> luasTipeInt = new Segitiga<>();
        Segitiga<Double> luasTipeDouble = new Segitiga<>();

        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        while (pilihan != 3) {
            System.out.println("HITUNG LUAS SEGITIGA");
            System.out.println("Menu:");
            System.out.println("1. Hitung luas segitiga dengan tipe integer");
            System.out.println("2. Hitung luas segitiga dengan tipe double");
            System.out.println("3. Keluar");
            System.out.print("Pilihan anda: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    luasTipeInt.input();
                    int hasilLuasInt = luasTipeInt.getResultAsInt();
                    System.out.println("Luas segitiga dengan tipe integer: " + hasilLuasInt);
                    break;
                case 2:
                    luasTipeDouble.input();
                    double hasilLuasDouble = luasTipeDouble.getResultAsDouble();
                    System.out.println("Luas segitiga dengan tipe double: " + hasilLuasDouble);
                    break;
                case 3:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
            System.out.println();
        }
    }
}