/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import java.util.Scanner;

/**
 *
 * @author Korisnik
 */
public class UnosJedneOsobe {

    public static void main(String[] args) {
        /*    
        Scanner ulaz = new Scanner(System.in);
        Osoba o = new Osoba();
        System.out.println("Unesi ime");
        o.setIme(ulaz.nextLine());
        
        System.out.println("Unesi prezime: ");
        o.setPrezime(ulaz.nextLine());
        
        System.out.print(o);
                
        
        ulaz.close();
         */
        Osoba o = new Osoba();
        o.setIme(Unos.unosString("Unesi ime"));
        o.setPrezime(Unos.unosString("Unesi prezime"));
        System.out.println(o);
        
        
    }

}
