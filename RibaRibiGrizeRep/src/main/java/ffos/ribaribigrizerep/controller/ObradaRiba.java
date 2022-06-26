/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.ribaribigrizerep.controller;

import ffos.ribaribigrizerep.model.Riba;
import ffos.ribaribigrizerep.model.Ribar;
import java.util.List;

/**
 *
 * @author anja0
 */
public class ObradaRiba extends Obrada<Riba>{

    
     public void setPodaci(String datumMrjestenja, Ribar ribar){
        
        if(entitet == null){
            entitet = new Riba();
        }
          entitet.setDatumMrjestenja(datumMrjestenja);
          entitet.setRibar(ribar);
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
    public List<Riba> read() {
        return session.createQuery("from Riba").list();
    }

    @Override
    public void setNew() {
        entitet = new Riba();
    }
    
}
