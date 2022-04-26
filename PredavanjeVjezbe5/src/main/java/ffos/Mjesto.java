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
public class Mjesto {
    private String naziv;
    private Opcina opcina;

    
    public Mjesto(){
        this.opcina = new Opcina();
    }   
  
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Opcina getOpcina() {
        return opcina;
    }

    public void setOpcina(Opcina opcina) {
        this.opcina = opcina;
    }
    
    
}
