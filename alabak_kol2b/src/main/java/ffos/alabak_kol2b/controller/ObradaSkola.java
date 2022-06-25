/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.alabak_kol2b.controller;

import com.github.javafaker.Name;
import ffos.alabak_kol2b.model.Skola;
import java.util.List;

/**
 *
 * @author anja0
 */
public class ObradaSkola extends Obrada<Skola>{

    
    public void setPodaci(String naziv, String vrsta){
        
        if(entitet == null){
            entitet = new Skola();
        }
        
        entitet.setNaziv(naziv);
        entitet.setVrsta(vrsta);
        
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
    public List<Skola> read() {
        return session.createQuery("from Skola").list();
    }

    @Override
    public void setNew() {
       entitet = new Skola();
    }

}
