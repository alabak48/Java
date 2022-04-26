/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

/**
 *
 * @author Korisnik
 */
public class Start {
    public static void main(String[] args) {
        // malo osoba je varijabla instance
        Osoba osoba = new Osoba();
        osoba.setIme("Anja");
        osoba.setPrezime("Labak");
        osoba.setStudent(true);
     
        System.out.println(osoba.getIme());
        System.out.println(osoba.isStudent());
        
        osoba = new Osoba();
        
        osoba.setIme("Zrinka");
        osoba.setPrezime("Zimska");
        osoba.setStudent(true);
    
        
        // linija je ekvivalent linije od 25-27. Ovo je moguće samo ako definiramo
        //konstruktor
        osoba = new Osoba("Ana", "Gal", true);
        
        Racunalo racunalo = new Racunalo();
        racunalo.setIme("Dell");
        racunalo.setProcesor("AMD");
        racunalo.setPc(true);
  
        
        Zaposlenik zaposlenik = new Zaposlenik();
       
    }
}
