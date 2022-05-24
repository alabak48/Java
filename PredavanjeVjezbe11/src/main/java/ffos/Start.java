/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import ffos.controller.ObradaMjesto;
import ffos.controller.ObradaOsoba;
import ffos.controller.ObradaRacunalo;
import ffos.utility.HibernateUtil;


/**
 *
 * @author Korisnik
 */
public class Start {
    
    public static void main(String[] args) {
        //HibernateUtil.getSession();
        ObradaMjesto om = new ObradaMjesto();
        om.setPodaci("");
        
        try {
            om.create();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        ObradaRacunalo or = new ObradaRacunalo();
        or.setPodaci("Prijenosno", "HP");
        try {
            or.create();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
    
        ObradaOsoba oo = new ObradaOsoba();
        oo.setPodaci("Pero", "Perić", null, null);
        try {
            oo.create();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
