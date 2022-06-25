/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.tatacuvalica.controller;

import ffos.tatacuvalica.model.Dijete;
import ffos.tatacuvalica.model.Tata;
import java.util.List;

/**
 *
 * @author anja0
 */
public class ObradaDijete extends Obrada<Dijete>{
     // U formi se nalazi lista koja se sprema u bazu
    // Zato se ovdje piše Obrada<Tata>
    //U paramtere idu sva svojstva koja se nalaze u klasi Tata
     public void setPodaci(String ime, String prezime){
        
        if(entitet == null){
            entitet = new Dijete();
        }
          entitet.setIme(ime);
          entitet.setPrezime(prezime);
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

        // Ovo promijeniti prema klasi koja se obrađuje u formi
    @Override
    public List<Dijete> read() {
        return session.createQuery("from Dijete").list();
    }

    @Override
    public void setNew() {
       entitet = new Dijete();
    }
}
