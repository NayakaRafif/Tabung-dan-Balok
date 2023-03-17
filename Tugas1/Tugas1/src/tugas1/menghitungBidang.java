/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author HP
 */
public interface menghitungBidang {
    public default double hitungKelilingLingkaran(double r){
        System.out.println("Ini hitung Keliling Lingkaran");
        return 0;
    }
    public default double hitungLuasLingkaran(double r){
        System.out.println("Ini hitung Luas Lingkaran");
        return 0;
    }
    public default int hitungKelilingBalok(int r){
        System.out.println("Ini hitung Keliling Persegi Panjang");
        return 0;
    }
    public default int hitungLuasKelilingBalok(int r){
        System.out.println("Ini hitung Luas Persegi Panjang");
        return 0;
    }
    public double gethitungLuasLingkaran();
    public double gethitungKelilingLingkaran();
    public double getHitungLuasBalok();
    public double getHitungKelilingBalok();
    
    
}
