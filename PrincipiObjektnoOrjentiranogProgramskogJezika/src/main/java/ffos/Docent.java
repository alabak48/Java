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
public class Docent extends Zaposlenik{
    private int BrojRadova;
    
    public Docent(){
        setIme("Ana");
        setPrezime("Anić");
    }

    public int getBrojRadova() {
        return BrojRadova;
    }

    public void setBrojRadova(int BrojRadova) {
        this.BrojRadova = BrojRadova;
    }
    
    @Override
    public void pozdrav(){
        System.out.println("hi!");
    }

}
