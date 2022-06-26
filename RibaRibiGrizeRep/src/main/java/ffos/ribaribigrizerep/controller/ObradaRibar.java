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
public class ObradaRibar extends Obrada<Ribar> {
    
    
    public void setPodaci(String ime, String prezime, List<Riba> riba){
        
        if(entitet == null){
            entitet = new Ribar();
        }
          entitet.setIme(ime);
          entitet.setPrezime(prezime);
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
    public List<Ribar> read() {
        return session.createQuery("from Ribar").list();
    }

    @Override
    public void setNew() {
        entitet = new Ribar();
    }
    
}
