/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author anja0
 */
public class Start {

    List<Kolegij> kolegiji;

    public Start() {
        kolegiji = new ArrayList<>();
        do {
            kolegiji.add(unesiKolegij());
        } while (!Unos.unosString("Unesi k za prekid unosa kolegija").equals("k"));
        for (Kolegij k : kolegiji) {
            if (k.getIzostanci().size() >= k.getDozvoljenBrojIzostanaka()) {
                System.err.println(k.getNaziv() + " [" + k.getIzostanci().size() + " ]"  );
            }else{
                System.out.println(k.getNaziv() + " [" + k.getIzostanci().size() + " ]"  );
            }

        }
    }

    private Kolegij unesiKolegij() {
        Kolegij k = new Kolegij();
        k.setNaziv(Unos.unosString("Unesite naziv kolegija"));
        k.setSifra(Unos.unosInt("Unesite šifru kolegija"));
        k.setDozvoljenBrojIzostanaka(Unos.unosInt("Unesite dozvoljen broj izostanaka na kolegiju"));
        k.setIzostanci(unosIzostanci());
        return k;
    }

    private List<Izostanak> unosIzostanci() {

        List<Izostanak> izostanci = new ArrayList<>();
        Izostanak i;

        do {
            i = new Izostanak();
            i.setDatumIzostanka(Unos.unosDate("Unesite datum"));
            i.setRazlogIzostanka(Unos.unosString("Unesite razlog izostanak"));
            izostanci.add(i);
        } while (!Unos.unosString("Unesi k za prekid unosa izostanka").equals("k"));
        return izostanci;

    }

    public static void main(String[] args) {
        new Start();
    }
}
