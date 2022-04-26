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
public class Racunalo {
    //Kreiranje klase Računalo s minimalno 4 svojstva. Kreirajte instancu klase
    // Kreirajte instancu klase računalo s opisanim svojim osobnim računalom
    
    private String ime;
    private boolean laptop;
    private boolean pc;
    private String procesor;
    private Velicina velicina;
    
    
    public Racunalo(){
    
    
    }

    public Velicina getVelicina() {
        return velicina;
    }

    public void setVelicina(Velicina velicina) {
        this.velicina = velicina;
    }
    
    public Racunalo(String ime, Boolean laptop, Boolean pc, String procesor, Int velicina) {
        this.ime = ime;
        this.laptop = laptop;
        this.pc = pc;
        this.procesor = procesor;
        this.velicina = new Velicina();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public boolean isLaptop() {
        return laptop;
    }

    public void setLaptop(boolean laptop) {
        this.laptop = laptop;
    }

    public boolean isPc() {
        return pc;
    }

    public void setPc(boolean pc) {
        this.pc = pc;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }
    
   
}
