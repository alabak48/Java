/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

/**
 *
 * @author anja0
 */
public class Kolegij {
     private String naziv;
     private Osoba izvodac;

    public Kolegij(String naziv, String ime, String prezime) {
        this.naziv = naziv;
        izvodac = new Zaposlenik(prezime, ime);
    }
     
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Osoba getIzvodac() {
        return izvodac;
    }

    public void setIzvodac(Osoba izvodac) {
        this.izvodac = izvodac;
    }

    
}
