/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import com.github.javafaker.Faker;
import ffos.controller.ObradaMjesto;
import ffos.controller.ObradaOsoba;
import ffos.controller.ObradaRacunalo;
import ffos.utility.HibernateUtil;
import ffos.view.Izbornik;
import java.util.Locale;

/**
 *
 * @author Korisnik
 */
public class Start {

    public static void main(String[] args) {
       new Izbornik().setVisible(true);
    }
    
    
    
    
    private void pomocno(){
         Faker faker = new Faker(new Locale("hr"));
        HibernateUtil.getSession();
        ObradaMjesto om = new ObradaMjesto();
        
        for (int i = 0; i < 10; i++) {
            om.setNew();
            om.setPodaci(faker.address().cityName());
            try {
                om.create();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        ObradaRacunalo or = new ObradaRacunalo();
        for (int i = 0; i < 20; i++) {
            or.setNew();
            or.setPodaci(faker.book().title(), faker.company().name());
            try {
                or.create();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        ObradaOsoba oo = new ObradaOsoba();
        oo.setPodaci("Pero", "Perić", null, null);
        
        try {
            oo.create();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
;
    }

}
