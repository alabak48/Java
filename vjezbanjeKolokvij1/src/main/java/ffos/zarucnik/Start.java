/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.zarucnik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anja0
 */
public class Start {

    private Zarucnik zarucnik;
    private Ostavljen ostavljen;
    String s = "";
    int sum = 0;

    public Start() {
        unosZarucnika();
    }

    public static void main(String[] args) {
        new Start();
        // Scanner se mora zatvoriti inače će se skroz izvoditi (.close)

    }

    private void unosZarucnika() {

        List<Zarucnik> lstZarucnik = new ArrayList();
        Scanner ulaz = new Scanner(System.in);

        System.out.println(s);
        while (!ulaz.next().equals("q")) {
            zarucnik = new Zarucnik();
            provjeraInteger("sifra", ulaz);
            provjeraBoolean("indefinirano", ulaz);
            provjeraInteger("prstena", ulaz);
            while (true) {
                try {
                    System.out.println("Unesite kuna");
                    s = ulaz.next();
                    zarucnik.setKuna(Double.parseDouble(s));
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            provjeraBoolean("introvertno", ulaz);
            lstZarucnik.add(zarucnik);
        }
        ulaz.close();

        for (Zarucnik zarucnik1 : lstZarucnik) {
            if(zarucnik1.isIndiferentno()) {
                sum += 1;
            }
            if(zarucnik1.isIntrovertno()) {
                sum += 1;
            }
            System.out.println(zarucnik1.isIntrovertno());
        }
        System.out.println(sum);

    }

    private void provjeraInteger(String naziv, Scanner ulaz) {
        while (true) {
            if (naziv == "sifra") {
                try {
                    System.out.println("Unesite sifru");
                    s = ulaz.next();
                    zarucnik.setSifra(Integer.parseInt(s));
                    break;
                } catch (Exception e) {
                    System.out.println("Molimo unesite cijeli broj");
                }
            } else {
                try {
                    System.out.println("Unesite prstena");
                    s = ulaz.next();
                    zarucnik.setPrstena(Integer.parseInt(s));
                    break;
                } catch (Exception e) {
                    System.out.println("Morate unjeti cijeli broj");
                }
            }
        }
    }

    private void provjeraBoolean(String naziv, Scanner ulaz) {
        while (true) {
            if (naziv == "indefinirano") {
                try {
                    System.out.println("Unesite indefinirano: true ili false");
                    s = ulaz.next().toLowerCase();
                    if (s.equals("true") || s.equals("false")) {
                        zarucnik.setIndiferentno(Boolean.parseBoolean(s));
                        break;
                    } else {
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("Morate napisati: true ili false");
                }
            } else {
                try {
                    System.out.println("Unesite introvetno: true ili false");
                    s = ulaz.next().toLowerCase();
                    if (s.equals("true") || s.equals("false")) {
                        zarucnik.setIntrovertno(Boolean.parseBoolean(s));
                        break;
                    } else {
                        continue;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /*    Program unosi entitet tipa zaručnik dok se ne prekine unos (slovo q) (10). 
    
    Unos svih podataka se kontrolira(try catch) i onemogućen je nastavak rada dok se ne unese tražena vrijednost (10). 
    
    Nakon završetka unosa aplikacija ispisuje vrijednost svojstva ekstroventno s svih instanca unesenih
    entiteta tipa zaručnik (10). 
    
    Za sve logičke tipove podataka u entitetu ostavljen zbraja se unos
    istinitih (true) vrijednosti na svim unesenim instancama entiteta zaručnik(15). */
}
