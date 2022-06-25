/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alabak_kol2.model;

import javax.persistence.Entity;

/**
 *
 * @author anja0
 */
@Entity
public class Skola extends Entitet{
    
    private String naziv;
    private String vrsta;

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
