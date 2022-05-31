/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Korisnik
 */
@Entity
public class Osoba extends Entitet{
    
  
    private String ime;
    private String prezime;
    
    @ManyToOne
    private Mjesto mjesto;
    
    @ManyToMany
    private List<Racunalo> racunala;

    public List<Racunalo> getRacunala() {
        return racunala;
    }

    public void setRacunala(List<Racunalo> racunala) {
        this.racunala = racunala;
    }
    

    public Mjesto getMjesto() {
        return mjesto;
    }

    public void setMjesto(Mjesto mjesto) {
        this.mjesto = mjesto;
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

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
    
    
    
}
