/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import javax.swing.JOptionPane;

/**
 *
 * @author anja0
 */
public class Start{
    public static void main(String[] args) {
        
        
        
        
 /*       Osoba o = new Osoba();
        o.setIme("Matija");
        o.setPrezime("Skrletović");
        o.setGodinaRodjenja(26);
        o.setStudent(false);
        //System.out.println(o.getIme() + " " + o.getPrezime() + " " + o.getGodinaRodjenja() + " " + o.isStudent());
    
        o = new Osoba();
        o.setIme("Matija");
        o.setPrezime("Labak");
        o.setGodinaRodjenja(31);
        o.setStudent(true);
        //System.out.println(o.getIme() + " " + o.getPrezime() + " " + o.getGodinaRodjenja() + " " + o.isStudent());
        //System.out.println(o.getIme() + " " + o.getPrezime() + " " + o.getGodinaRodjenja() + " " + o.isStudent());
*/
        
        Kolegij k = new Kolegij("Programiranje", "Perić", "Pero");
        //System.out.println(k.getIzvodac().getIme());
        
        Zaposlenik z = new Zaposlenik();
        z.setIme("Ana");
        z.setPrezime("Zimska");
        try {
           z.setGodinaRodjenja(Integer.parseInt(JOptionPane.showInputDialog("ups!"))); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        z.setGodinaRodjenja(23);
        z.pozdrav();
        
        
        Docent d = new Docent();
        d.setIme("Adrian");
        d.setPrezime("Adrić");
        d.setBroj(1);
        d.setKatedra("Odsjek za informacijske znanosti");
        d.setStudent(false);
        d.pozdrav();
        System.out.println(d.getIme() + " " + d.getPrezime() + " " + d.getBroj());
        
        
    }
}
