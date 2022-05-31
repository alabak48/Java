/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Mjesto;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class ObradaMjesto extends Obrada<Mjesto>{
    
    @Override
    public void setNew(){
        entitet=new Mjesto();
    }
    
    public void setPodaci(String naziv){
        if(entitet==null){
            entitet = new Mjesto();
        }
        
        entitet.setNaziv(naziv);
        
    }

    @Override
    public void kontrolaCreate() throws Exception {
        if(entitet.getNaziv()==null || entitet.getNaziv().isEmpty()){
            throw new Exception("Naziv obavezno");
        }
    }

    @Override
    public void kontrolaUpdate() throws Exception {
        
    }

    @Override
    public void kontrolaDelete() throws Exception {
        
    }

    @Override
    public List<Mjesto> read() {
        // from Mjesto je HQL
        return session.createQuery("from Mjesto").list();
    }
    
}
