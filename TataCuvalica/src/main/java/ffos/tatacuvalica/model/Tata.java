/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.tatacuvalica.model;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author anja0
 */
@Entity
public class Tata extends Entitet{
    
    private String ime;
    private String prezime;
    private String datumRodjenja;
    @OneToMany
    private List<Dijete> dijete = new ArrayList<>();

    public List<Dijete> getDijete() {
        return dijete;
    }

    public void setDijete(List<Dijete> dijete) {
        this.dijete = dijete;
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

    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(String datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
    
    
    
}
