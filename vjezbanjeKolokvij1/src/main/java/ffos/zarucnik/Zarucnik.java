/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.zarucnik;

/**
 *
 * @author anja0
 */
public class Zarucnik {
    /* Primljeni kod je bez sintaksnih grešaka (25). Sve datoteke koje imaju sintaksne greške se brišu
    dok se projekt ne dovede do sintaksno ispravnog koda te se provjerava funkcionalnost na
    sintaksno ispravnom kodu. */
    //KLASE VELIKIM SLOVOM!!
    
    /*Aplikacija omogućuje unos više entiteta tipa zaručnik. Projekt u
    NetBeans-u se zove KolokvijVjezba_1 (5), paket u kojem se nalaze sve klase se zove
    ffos.Zarucnik (5). Za entitet zaručnik potrebno je definirati sljedeća svojstva:
    šifra (cijeli broj),
    indiferentno (logička vrijednost), 
    prstena (cijeli broj), kuna (decimalni broj), 
    ekstroventno(logička vrijednost), 
    introvertno (logička vrijednost) te 
    ostavljen (10). 
    
    Za entitet Ostavljen
    potrebno je definirati sljedeća svojstva: šifra (cijeli broj), 
    stil frizure (znakovni tip), asocijalno
    (logička vrijednost), majica (znakovni tip), hlače (znakovni tip) i gustoća (decimalni broj) (10).
    
    
    Program unosi entitet tipa zaručnik dok se ne prekine unos (slovo q) (10). 
    
    Unos svih podataka se kontrolira(try catch) i onemogućen je nastavak rada dok se ne unese tražena vrijednost (10). 
    
    Nakon završetka unosa aplikacija ispisuje vrijednost svojstva ekstroventno s svih instanca unesenih
    entiteta tipa zaručnik (10). 
    
    Za sve logičke tipove podataka u entitetu ostavljen zbraja se unos
    istinitih (true) vrijednosti na svim unesenim instancama entiteta zaručnik(15). */

    private int sifra;
    private boolean indiferentno;
    private int prstena;
    private double kuna;
    private boolean introvertno;
    private Ostavljen ostavljen;

    public Ostavljen getOstavljen() {
        return ostavljen;
    }

    public void setOstavljen(Ostavljen ostavljen) {
        this.ostavljen = ostavljen;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public boolean isIndiferentno() {
        return indiferentno;
    }

    public void setIndiferentno(boolean indiferentno) {
        this.indiferentno = indiferentno;
    }

    public int getPrstena() {
        return prstena;
    }

    public void setPrstena(int prstena) {
        this.prstena = prstena;
    }

    public double getKuna() {
        return kuna;
    }

    public void setKuna(double kuna) {
        this.kuna = kuna;
    }

    public boolean isIntrovertno() {
        return introvertno;
    }

    public void setIntrovertno(boolean introvertno) {
        this.introvertno = introvertno;
    }
    
}
 