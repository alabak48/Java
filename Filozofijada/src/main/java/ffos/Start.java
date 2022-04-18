/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anja0
 */
public class Start {

    List<Prijava> prijave;

    public Start() {;
        double najveciProsjek = Integer.MIN_VALUE;
        double najmanjiProsjek = Integer.MAX_VALUE;
        prijave = new ArrayList<>();
        do {
            prijave.add(unesiPrijavu());
        } while (!Unos.unosString("Unesi n za prekid unosa prijave").equals("n"));
        for (Prijava p : prijave) {
            for (Student s : p.getStudenti()) {
                if (s.getProsjek() > najveciProsjek) {
                    najveciProsjek = s.getProsjek();
                }
                if (s.getProsjek() < najmanjiProsjek) {
                    najmanjiProsjek = s.getProsjek();

                }
            }
             
        }
        System.out.println("Ukupan broj prijava (" + prijave.size() + ")");
                System.out.println("Najmanji prosjek: " + najmanjiProsjek);
                System.out.println("Najveći prosjek: " + najveciProsjek);

    }

    public List<Student> unesiStudenta() {
        List<Student> studenti = new ArrayList<>();
        Student s;
        do {
            s = new Student();
            s.setIme(Unos.unosString("Unesi ime"));
            s.setPrezime(Unos.unosString("Unesite prezime"));
            s.setJmbag(Unos.unosInt("Unesite JMBAG"));
            s.setProsjek(Unos.unosDecimal("Unesite svoj prosjek"));
            studenti.add(s);
        } while (!Unos.unosString("Unesite n za prekid unosa studenta").equals("n"));
        return studenti;

    }

    public Prijava unesiPrijavu() {
        Prijava p = new Prijava();
        p.setSifra(Unos.unosInt("Unesi šifru prijave"));
        p.setDatumPrijave(Unos.unosDate("Unesi datum prijave"));
        p.setStudenti(unesiStudenta());
        return p;

    }

    public static void main(String[] args) {
        new Start();
    }
}
