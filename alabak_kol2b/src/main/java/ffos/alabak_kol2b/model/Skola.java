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
public class Skola extends Entitet{
    
    private String naziv;
    private String vrsta;
    //možeš i ne moraš
    //mappedBy služi da se ne stvara novi entitet u bazi
    //uz pomoć njega sql prepoznaje gdje se on nalazi i kako je mapiran
    @ManyToMany(mappedBy = "skole")
    private List<Ucenik> ucenici = new ArrayList<>();

    public List<Ucenik> getUcenici() {
        return ucenici;
    }

    public void setUcenici(List<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }
    
     @Override
    public String toString() {
        return naziv;
    }
    
    
}
