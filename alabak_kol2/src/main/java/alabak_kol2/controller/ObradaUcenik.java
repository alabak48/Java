/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alabak_kol2.controller;

import alabak_kol2.model.Mjesto;
import alabak_kol2.model.Skola;
import alabak_kol2.model.Ucenik;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.annotations.common.util.impl.Log;

/**
 *
 * @author anja0
 */
public class ObradaUcenik extends Obrada<Ucenik>{

     public void setPodaci(String datumRodjenja, String ime, String prezime, Mjesto mjesto, Skola skola){
        if(entitet == null){
            Ucenik u = new Ucenik();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                u.setIme(ime);
                u.setPrezime(prezime);
                u.setMjesto(mjesto);
                u.setSkola(skola);
                u.setDatumRodjenja(datumRodjenja);
            } catch (Exception e) {
            }
        }else{
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            try {
                entitet.setIme(ime);
                entitet.setPrezime(prezime);
                entitet.setMjesto(mjesto);
                entitet.setSkola(skola);
                entitet.setDatumRodjenja(datumRodjenja);
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
