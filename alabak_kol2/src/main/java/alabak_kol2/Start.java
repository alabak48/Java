/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alabak_kol2;

import alabak_kol2.controller.Obrada;
import alabak_kol2.controller.ObradaUcenik;
import alabak_kol2.view.Izbornik;

/**
 *
 * @author anja0
 */
public class Start {
public static void main(String[] args) {
        //HibernateUtil.getSession();
        new Izbornik().setVisible(true);
    }
}
