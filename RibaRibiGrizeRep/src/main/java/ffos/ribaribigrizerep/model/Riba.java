/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.ribaribigrizerep.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author anja0
 */
@Entity
public class Riba extends Entitet{

    private String datumMrjestenja;
    @ManyToOne
    private Ribar ribar;
    @ManyToOne
    private Ribnjak ribnjak;

    public Ribnjak getRibnjak() {
        return ribnjak;
    }

    public void setRibnjak(Ribnjak ribnjak) {
        this.ribnjak = ribnjak;
    }

    public Ribar getRibar() {
        return ribar;
    }

    public void setRibar(Ribar ribar) {
        this.ribar = ribar;
    }

   
   
    
    public String getDatumMrjestenja() {
        return datumMrjestenja;
    }

    public void setDatumMrjestenja(String datumMrjestenja) {
        this.datumMrjestenja = datumMrjestenja;
    }

}
