/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Racunalo;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class ObradaRacunalo extends Obrada<Racunalo>{
    
    @Override
    public void setNew(){
        entitet=new Racunalo();
    }
    
    
    public void setPodaci(String vrsta, String proizvodac){
        if(entitet==null){
            entitet = new Racunalo();
        }
        entitet.setVrsta(vrsta);
        entitet.setProizvodac(proizvodac);
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
    public List<Racunalo> read() {
        return session.createQuery("from Racunalo").list();
    }
    
}
