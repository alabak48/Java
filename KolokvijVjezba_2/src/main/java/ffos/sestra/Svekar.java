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
public class Svekar {
    //Za entitet Svekar potrebno je definirati sljedeća svojstva: 
    //šifra(znakovni tip), 
    //čarape (znakovni tip), 
    //gustoća (decimalni broj), 
    //kratka majica (znakovni tip), 
    //stil frizure (znakovni tip) i 
    //boja očiju (znakovni tip) (10).
    
    private String sifra;
    private String carape;
    private double gustoca;
    private String kratkaMajica;
    private String stilFrizure;
    private String bojaOciju;

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getCarape() {
        return carape;
    }

    public void setCarape(String carape) {
        this.carape = carape;
    }

    public double getGustoca() {
        return gustoca;
    }

    public void setGustoca(double gustoca) {
        this.gustoca = gustoca;
    }

    public String getKratkaMajica() {
        return kratkaMajica;
    }

    public void setKratkaMajica(String kratkaMajica) {
        this.kratkaMajica = kratkaMajica;
    }

    public String getStilFrizure() {
        return stilFrizure;
    }

    public void setStilFrizure(String stilFrizure) {
        this.stilFrizure = stilFrizure;
    }

    public String getBojaOciju() {
        return bojaOciju;
    }

    public void setBojaOciju(String bojaOciju) {
        this.bojaOciju = bojaOciju;
    }
    
    
}
