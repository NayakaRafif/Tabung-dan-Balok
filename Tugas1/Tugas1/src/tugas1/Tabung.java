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
public class Tabung extends Lingkaran implements menghitungRuang {



    private double tinggi;

    Tabung(double r, double tinggi) {
        super(r);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolumeTabung() {
        return super.getHitungLuas()*tinggi;
    }

    @Override
    public double hitungLuasPermukaanTabung() {
        return super.getHitungKeliling()*(getR(r)+tinggi);
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolumeBalok() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double hitungLuasPermukaanBalok() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
