/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.zarucnik;

/**
 *
 * @author Korisnik
 */
public class Zarucnik {
    private int sifra;
    private boolean indiferentno;
    private int prstena;
    private double kuna;
    private boolean ekstroventno;
    private boolean introventno;
    private Ostavljen ostavljen;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public boolean isIndiferentno() {
        return indiferentno;
    }

    public void setIndiferentno(boolean indiferentno) {
        this.indiferentno = indiferentno;
    }

    public int getPrstena() {
        return prstena;
    }

    public void setPrstena(int prstena) {
        this.prstena = prstena;
    }

    public double getKuna() {
        return kuna;
    }

    public void setKuna(double kuna) {
        this.kuna = kuna;
    }

    public boolean isEkstroventno() {
        return ekstroventno;
    }

    public void setEkstroventno(boolean ekstroventno) {
        this.ekstroventno = ekstroventno;
    }

    public boolean isIntroventno() {
        return introventno;
    }

    public void setIntroventno(boolean introventno) {
        this.introventno = introventno;
    }

    public Ostavljen getOstavljen() {
        return ostavljen;
    }

    public void setOstavljen(Ostavljen ostavljen) {
        this.ostavljen = ostavljen;
    }
    
}
