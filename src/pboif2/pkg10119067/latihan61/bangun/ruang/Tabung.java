/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119067.latihan61.bangun.ruang;

/**
 *
 * @author Danhago
 * NAMA     : Andreas Danhago P.I
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi: Bangun Ruang
 */
public class Tabung extends BangunRuang{
    private int tinggi;

    public Tabung(int r,int tinggi) {
        super(r);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    public double hitungAlas() {
        return 3.14 * (getR() * getR());
    }

    public double hitungVolume() {
        return hitungAlas() * getTinggi();
    }

    public void tampilHasil() {
        System.out.println("Volume Tabung : " + hitungVolume() + " cm3");
    }

    private double getR() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void tampilHasil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
