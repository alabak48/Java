/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.troskovinaprojektu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anja0
 */
public class Start {

    List<Projekt> projekti;

    public Start() {
        int zavrseniProjekti = 0;
        double sum = 0;
        projekti = new ArrayList<>();
        unosProjekta();
        for (Projekt p : projekti) {
            if (p.isIndikacijaZavrsenosti()) {
                sum += p.getVoditelj().getPlaca();
                zavrseniProjekti++;

                System.out.println(p.getNaziv() + ":  " + p.getVoditelj().getPlaca());
            }

        }

        System.out.println("Prosjek mjesečnih plaća završenih projekata: " + sum / zavrseniProjekti);

    }

    private void unosProjekta() {
        Projekt p;
        do {
            p = new Projekt();
            p.setSifra(Unos.unosInt("Unesi šifru projekta"));
            p.setNaziv(Unos.unosString("Unesite naziv projekta"));
            p.setIndikacijaZavrsenosti(Unos.unosBoolean("Da li je projekt gotov (true/false)"));
            p.setVoditelj(unesiVoditelja());
            projekti.add(p);
        } while (!Unos.unosString("Unesite g za prekid unosa").equals("g"));

    }

    public Voditelj unesiVoditelja() {
        Voditelj v = new Voditelj();
        v.setIme(Unos.unosString("Unesi ime voditelja"));
        v.setPrezime(Unos.unosString("Unosite prezime voditelja"));
        v.setPlaca(Unos.unosDecimal("Unesi godišnju plaću voditelja"));
        return v;
    }

    public static void main(String[] args) {
        new Start();
    }
}
