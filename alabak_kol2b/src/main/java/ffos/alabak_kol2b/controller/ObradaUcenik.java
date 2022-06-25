/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.alabak_kol2b.controller;

import ffos.alabak_kol2b.model.Skola;
import ffos.alabak_kol2b.model.Ucenik;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anja0
 */
public class ObradaUcenik extends Obrada<Ucenik>{
    public void setPodaci(String datumRodjenja, String ime, String prezime, List<Skola> skola){
        if(entitet == null){
            Ucenik u = new Ucenik();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                u.setIme(ime);
                u.setPrezime(prezime);
                u.setDatumRodjenja(datumRodjenja);
                u.setSkole(skola);
            } catch (Exception e) {
            }
        }else{
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            try {
                entitet.setIme(ime);
                entitet.setPrezime(prezime);
                entitet.setDatumRodjenja(datumRodjenja);
                entitet.setSkole(skola);
           } catch (Exception e) {
            }
        }
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
    public List<Ucenik> read() {
        return session.createQuery("from Ucenik").list();
    }

    @Override
    public void setNew() {
        entitet = new Ucenik();
    }

 

  
}
