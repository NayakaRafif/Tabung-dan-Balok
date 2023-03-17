/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Tugas1 {

    /**
     *
     */
    public static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        // TODO code application logic here
        int back, pilih;
        
        do {
            System.out.println("Program menghitunng volume dan luas permukaan balok dan tabung.");
            System.out.println("---------------------------------------------------------------");
            System.out.println("Menu:");
            System.out.println("1. Balok");
            System.out.println("2. Tabung");
            System.out.println("3. Exit");
            System.out.print("Pilih :");
            pilih = menu.nextInt();
            
            switch (pilih) {
                
                case 1:
                    System.out.println("\n");
                    menuBalok();
                    break;
                case 2:
                    System.out.println("\n");
                    menuTabung();
                    break;
                case 3:
                    System.out.println("\nTerimakasih");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak tersedia");
                
            }
            System.out.println("\n");
            System.out.println("Back to menu? Yes : 1 || No : 0");
            back = input.nextInt();
            
            
        } while (back == 1);
    }

    static void menuTabung() {
        System.out.println("-- Tabung -- ");
        System.out.print("Input Jari - Jari Alas Tabung:  ");
        double jariAlasTabung = input.nextDouble();
        System.out.print("Input Tinggi:  ");
        double tinggi = input.nextDouble();
        Tabung tabung = new Tabung(jariAlasTabung, tinggi);
        tabung.setR(jariAlasTabung);
        tabung.setTinggi(tinggi);
        System.out.println("\nOUTPUT");
        System.out.println("Luas Alas Tabung:" + tabung.gethitungLuasLingkaran());
        System.out.println("Keliling Alas Tabung:" + tabung.getHitungKeliling());
        System.out.println("Luas Tabung : " + tabung.hitungLuasPermukaanTabung());
        System.out.println("Volume Tabung : " + tabung.hitungVolumeTabung());
    }

    static void menuBalok() {
        System.out.println("--Balok--");
        System.out.print("Input Panjang Balok: ");
        double panjangBalok = input.nextDouble();
        System.out.print("Input Lebar Balok: ");
        double lebarBalok = input.nextDouble();
        System.out.print("Input Tinggi Balok: ");
        double tinggi = input.nextDouble();
        Balok balok = new Balok(panjangBalok, lebarBalok, tinggi);
        balok.setPanjang(panjangBalok);
        balok.setLebar(lebarBalok);
        balok.setTinggi(tinggi);
        System.out.println("\nOUTPUT");
        System.out.println("Luas Persegi panjang: " + balok.HitungLuas(panjangBalok, lebarBalok));
        System.out.println("Keliling Persegi panjang: " + balok.HitungKeliling(panjangBalok, lebarBalok));
        System.out.println("Volume Balok: " + balok.hitungVolumeBalok());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaanBalok());
        
    }
}
