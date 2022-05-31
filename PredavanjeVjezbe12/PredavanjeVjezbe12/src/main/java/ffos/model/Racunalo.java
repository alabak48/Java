/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.model;

import javax.persistence.Entity;

/**
 *
 * @author Korisnik
 */
@Entity
public class Racunalo extends Entitet{
    
    private String vrsta;
    private String proizvodac;

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public String getProizvodac() {
        return proizvodac;
    }

    public void setProizvodac(String proizvodac) {
        this.proizvodac = proizvodac;
    }

    @Override
    public String toString() {
        return vrsta;
    }
    
    
    
}
