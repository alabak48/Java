/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.sestra;

/**
 *
 * @author anja0
 */
public class Sestra {
    //Za entitet sestra potrebno je definirati sljedeća svojstva:
    //šifra (znakovni tip), 
    //narukvica(cijeli broj), 
    //novčića (decimalni broj), 
    //kuna (decimalni broj), 
    //boja kose (znakovni tip), n
    //naušnica(cijeli broj) 
    //te svekar (10).
    
    
    // Svojstva uvijek učiniti privatnim
    
    private String sifra;
    private int narukvica;
    private double novcica;
    private double kuna;
    private String bojaKose;
    private int nausnica;
    private Svekar svekar;

    // Odma generirati gettere i settere
    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public int getNarukvica() {
        return narukvica;
    }

    public void setNarukvica(int narukvica) {
        this.narukvica = narukvica;
    }

    public double getNovcica() {
        return novcica;
    }

    public void setNovcica(double novcica) {
        this.novcica = novcica;
    }

    public double getKuna() {
        return kuna;
    }

    public void setKuna(double kuna) {
        this.kuna = kuna;
    }

    public String getBojaKose() {
        return bojaKose;
    }

    public void setBojaKose(String bojaKose) {
        this.bojaKose = bojaKose;
    }

    public int getNausnica() {
        return nausnica;
    }

    public void setNausnica(int nausnica) {
        this.nausnica = nausnica;
    }

    public Svekar getSvekar() {
        return svekar;
    }

    public void setSvekar(Svekar svekar) {
        this.svekar = svekar;
    }
    
    
    
}
