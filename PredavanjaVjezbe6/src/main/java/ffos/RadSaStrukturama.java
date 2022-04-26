/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author Korisnik
 */
public class RadSaStrukturama {

    public RadSaStrukturama() {
        //loš način
        ArrayList lista = new ArrayList();
        lista.add("Osijek");
       lista.add(new Osoba());
       
        //dobra praksa
       List<Osoba> osobe = new ArrayList<>();
       Osoba o;
       do{
       o = new Osoba();
       o.setIme(Unos.unosString("Unesi ime"));
       o.setPrezime(Unos.unosString("Unesi prezime"));
       o.setGodine(Unos.unosInt("Unesi godine"));
       osobe.add(o);
       }while(!Unos.unosString("NAPIŠI DA ZA PREKID ILI NE ZA DALJE").equals("Da"));
               {
        Set<String> imena = new HashSet<>();
       for(Osoba osoba:osobe){
           imena.add(osoba.getIme());
       }
    for(String ime: imena){
        System.out.println(ime);
    }
    
    }
    
    
    //Prebrojati koliko ima osoba s jedinstvenim imenom
    }
    public static void main(String[] args) {
        new RadSaStrukturama();
    
    
    }
}
