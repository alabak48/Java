/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.troskovinaprojektu;

/**
 *
 * @author anja0
 */
public class Projekt {
    private int sifra;
    private String naziv;
    private boolean indikacijaZavrsenosti;
    private Voditelj voditelj;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public boolean isIndikacijaZavrsenosti() {
        return indikacijaZavrsenosti;
    }

    public void setIndikacijaZavrsenosti(boolean indikacijaZavrsenosti) {
        this.indikacijaZavrsenosti = indikacijaZavrsenosti;
    }

    public Voditelj getVoditelj() {
        return voditelj;
    }

    public void setVoditelj(Voditelj voditelj) {
        this.voditelj = voditelj;
    }
    
}
