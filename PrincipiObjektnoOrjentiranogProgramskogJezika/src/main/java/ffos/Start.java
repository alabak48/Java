/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

/**
 *
 * @author anja0
 */
public class Start{
    public static void main(String[] args) {
        Osoba o = new Osoba();
        o.setIme("Matija");
        o.setPrezime("Skrletović");
        o.setGodinaRodjenja(26);
        o.setStudent(false);
        System.out.println(o.getIme() + " " + o.getPrezime() + " " + o.getGodinaRodjenja() + " " + o.isStudent());
    
        o = new Osoba();
         o.setIme("Matija");
        o.setPrezime("Labak");
        o.setGodinaRodjenja(31);
        o.setStudent(true);
        System.out.println(o.getIme() + " " + o.getPrezime() + " " + o.getGodinaRodjenja() + " " + o.isStudent());
        System.out.println(o.getIme() + " " + o.getPrezime() + " " + o.getGodinaRodjenja() + " " + o.isStudent());
        
        Kolegij k = new Kolegij("Programiranje", "Perić", "Pero");
        System.out.println(k.getIzvodac().getIme());
    }
}
