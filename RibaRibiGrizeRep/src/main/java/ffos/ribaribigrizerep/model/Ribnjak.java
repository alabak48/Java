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
public class Ribnjak extends Entitet{
    
    private String naziv;
    private String opis;
    @OneToMany(mappedBy = "ribnjak")
    private List<Riba> riba = new ArrayList<>();

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public List<Riba> getRiba() {
        return riba;
    }

    public void setRiba(List<Riba> riba) {
        this.riba = riba;
    }
}
