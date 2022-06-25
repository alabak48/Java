/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.alabak_kol2b.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author anja0
 */
@Entity
public class Ucenik extends Entitet{
   private String datumRodjenja;
   private String ime;
   private String prezime;
   @ManyToMany
   private List<Skola> skole = new ArrayList<>(); 

    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(String datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public List<Skola> getSkole() {
        return skole;
    }

    public void setSkole(List<Skola> skole) {
        this.skole = skole;
    }

    @Override
    public String toString() {
        return ime + " " + prezime; //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
}
