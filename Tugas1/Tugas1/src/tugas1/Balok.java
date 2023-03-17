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
public class Balok extends PersegiPanjang implements menghitungRuang{
    double tinggi;
    
Balok(double panjang, double lebar, double tinggi) {
        super(panjang,lebar);
        this.tinggi = tinggi;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolumeTabung() {
        return super.gethitungLuasLingkaran()*tinggi;
    }

    @Override
    public double hitungLuasPermukaanTabung() {
        return (2*(panjang*lebar)+(lebar*tinggi)+(tinggi*panjang));
    }

    @Override
    public double hitungVolumeBalok() {
        return super.gethitungLuasBalok()*tinggi;
    }

    @Override
    public double hitungLuasPermukaanBalok() {
        return 2*(panjang*lebar +lebar*tinggi+tinggi*panjang);
    }
    
}
