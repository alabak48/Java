/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.zarucnik;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class Program {
    
    List<Zarucnik> zarucnici;
    
    public Program(){
        zarucnici = new ArrayList<>();
        do{
            unesiZarucnika();
        }while(!Unos.unosString("q za prekid").equals("q"));
    
        for(Zarucnik z : zarucnici){
            System.out.println(z.isEkstroventno());
        }
        //Zadnji dio
        int suma=0;
        for(Zarucnik z : zarucnici){
            if(!z.getOstavljen().isAsocijalno()){
                continue;
            }
            
            /*if(z.isEkstroventno()){
                suma+=1;
            }*/
            
            suma+=z.isEkstroventno() ? 1 : 0;
            suma+=z.isIndiferentno()? 1 : 0;
            suma+=z.isIntroventno()? 1 : 0;
        }
    }
    
    private void unesiZarucnika(){
        Zarucnik z = new Zarucnik();
        z.setSifra(Unos.unosInt("Unesi šifru?"));
        z.setPrstena(Unos.unosInt("Unesi broj prstena!"));
        z.setEkstroventno(Unos.unosBoolean("Dali se ekstrovertan?"));
        z.setIndiferentno(Unos.unosBoolean("Da li si indiferentan?"));
        z.setIntroventno(Unos.unosBoolean("Dali si introvertan?"));
        z.setKuna(Unos.unosInt("Imaš li kuna za svatove?"));
        Ostavljen o = new Ostavljen();
        
        o.setSifra(Unos.unosInt("Unesi šifru"));
        o.setAsocijalno(Unos.unosBoolean("Da li si asocijalna?"));
        o.setStilFrizure(Unos.unosString("Stil frizure?"));
        o.setGustoca(Unos.unosDouble("Gustoća suza nakon rastanka"));
        o.setHlace(Unos.unosString("Vrsta hlača?"));
        o.setMajica(Unos.unosString("Vrsta majice?"));
        
        z.setOstavljen(o);
        zarucnici.add(z);
              
                
    }
    
    
    public static void main(String[] args) {
        new Program();
    }
}
