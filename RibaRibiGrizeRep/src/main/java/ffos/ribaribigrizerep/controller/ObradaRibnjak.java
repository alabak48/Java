/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.ribaribigrizerep.controller;

import ffos.ribaribigrizerep.model.Riba;
import ffos.ribaribigrizerep.model.Ribar;
import ffos.ribaribigrizerep.model.Ribnjak;
import java.util.List;

/**
 *
 * @author anja0
 */
public class ObradaRibnjak extends Obrada<Ribnjak>{

    
    
     
    public void setPodaci(String naziv, String opis, List<Riba> riba){
        
        if(entitet == null){
            entitet = new Ribnjak();
        }
          entitet.setNaziv(naziv);
          entitet.setOpis(opis);
          entitet.setRiba(riba);
    } 
    @Override
    public void kontrolaCreate() throws Exception {
    }

    @Override
    public void kontrolaUpdate() throws Exception {
    }

    @Override
    public void kontrolaDelete() throws Exception {
    }

    @Override
    public List<Ribnjak> read() {
        return session.createQuery("from Ribnjak").list();

    }

    @Override
    public void setNew() {
        entitet = new Ribnjak();
    }
    
}
