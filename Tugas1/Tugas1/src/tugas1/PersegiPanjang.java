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
public class PersegiPanjang implements menghitungBidang {

    private double luasPersegiPanjang;
    private double kelilingPersegiPanjang;
    public double panjang;
    public double lebar;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;

    }

    public double HitungLuas(double panjang, double lebar) {
        luasPersegiPanjang = panjang * lebar;
        return luasPersegiPanjang;
    }

    public double HitungLuas(int panjang, double lebar) {
        luasPersegiPanjang = panjang * lebar;
        return luasPersegiPanjang;
    }

    public double HitungLuas(double panjang, int lebar) {
        luasPersegiPanjang = panjang * lebar;
        return luasPersegiPanjang;
    }

    public double HitungLuas(int panjang, int lebar) {
        luasPersegiPanjang = panjang * lebar;
        return luasPersegiPanjang;
    }

    public double HitungKeliling(double panjang, double lebar) {
        kelilingPersegiPanjang = 2 * (panjang + lebar);
        return kelilingPersegiPanjang;
    }

    public double HitungKeliling(int panjang, double lebar) {
        kelilingPersegiPanjang = 2 * (panjang + lebar);
        return kelilingPersegiPanjang;
    }

    public double HitungKeliling(double panjang, int lebar) {
        kelilingPersegiPanjang = 2 * (panjang + lebar);
        return kelilingPersegiPanjang;
    }

    public double HitungKeliling(int panjang, int lebar) {
        kelilingPersegiPanjang = 2 * (panjang + lebar);
        return kelilingPersegiPanjang;
    }
    
    public double gethitungLuasBalok() {
        return luasPersegiPanjang;
    }

    
    public double gethitungKeliling() {
        return kelilingPersegiPanjang;
    }

    @Override
    public double getHitungLuasBalok() {
       return luasPersegiPanjang;
    }

    @Override
    public double getHitungKelilingBalok() {
      return kelilingPersegiPanjang;
    }

    @Override
    public double gethitungLuasLingkaran() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double gethitungKelilingLingkaran() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
