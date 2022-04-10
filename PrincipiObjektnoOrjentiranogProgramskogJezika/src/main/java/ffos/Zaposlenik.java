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
public class Zaposlenik extends Osoba{
    private String Katedra;

    public String getKatedra() {
        return Katedra;
    }

    public void setKatedra(String Katedra) {
        this.Katedra = Katedra;
    }

    public Zaposlenik() {
    }
    
  public Zaposlenik(String prezime, String ime){
        setPrezime(prezime);
        setIme(ime);
    }    
  
    @Override
    public void pozdrav() {
        System.out.println("Dobar dan!");
    }

    
    
}
