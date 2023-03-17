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
public class Lingkaran implements menghitungBidang {
    
   
    private double kelilingLingkaran;
    private double luasLingkaran;
    public double r;
    
    public Lingkaran(double r){
        this.r = r;
        hitungKeliling(r);
        hitungLuas(r);      
    }
 
   
    public double hitungKeliling(double r) {
        kelilingLingkaran = 2 * Math.PI * this.r;
        return kelilingLingkaran;
    }
    
    public int hitungKeliling(int r) {
        kelilingLingkaran = 2 * Math.PI * this.r;
        return (int) kelilingLingkaran;
    }

   
    public double hitungLuas(double r) {
        luasLingkaran = Math.PI * this.r * this.r;
        return luasLingkaran;
    }
   
    public int hitungLuas(int r) {
        luasLingkaran = Math.PI * this.r * this.r;
        return (int) luasLingkaran;
    }
    
   
    public void setR(double r) {
        this.r = r;
    }

    public double getR(double r) {
        return r;
    }
    
    public double getHitungKeliling(){
        return kelilingLingkaran; 
    }
    
    public double getHitungLuas(){
        return luasLingkaran;
    }

    @Override
    public double gethitungLuasLingkaran() {
        return luasLingkaran;
    }

    @Override
    public double gethitungKelilingLingkaran() {
        return kelilingLingkaran;
    }

    @Override
    public double getHitungLuasBalok() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getHitungKelilingBalok() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
