/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.ribaribigrizerep.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author anja0
 */
@Entity
public class Ribar extends Entitet{
    
    private String ime;
    private String prezime;
    @OneToMany(mappedBy = "ribar")
    private List<Riba> riba = new ArrayList<>();
    
    
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

    public List<Riba> getRiba() {
        return riba;
    }

    public void setRiba(List<Riba> riba) {
        this.riba = riba;
    }
    
}
