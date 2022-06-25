/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alabak_kol2.controller;

import alabak_kol2.model.Mjesto;
import java.util.List;

/**
 *
 * @author anja0
 */
public class ObradaMjesto extends Obrada<Mjesto>{
        public void setPodaci(String naziv){
        if(entitet == null){
            entitet = new Mjesto();
        }
        
        entitet.setNaziv(naziv);
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
    public List<Mjesto> read() {
        return session.createQuery("from Mjesto").list();
    }

    @Override
    public void setNew() {
        
        entitet = new Mjesto();
        
    }
}
