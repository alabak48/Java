/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Mjesto;
import ffos.model.Osoba;
import ffos.model.Racunalo;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class ObradaOsoba extends Obrada<Osoba>{
    
    
    @Override
    public void setNew(){
        entitet=new Osoba();
    }
    public void setPodaci(String ime, String prezime, Mjesto mjesto,
            List<Racunalo> racunala){
        if(entitet==null){
            entitet = new Osoba();
        }
        entitet.setIme(ime);
        entitet.setPrezime(prezime);
        entitet.setMjesto(mjesto);
        entitet.setRacunala(racunala);
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
    public List<Osoba> read() {
        return session.createQuery("from Osoba").list();
    }
    
}
