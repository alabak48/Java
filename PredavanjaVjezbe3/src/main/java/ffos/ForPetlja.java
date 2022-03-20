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
public class ForPetlja {
    public static void main(String[] args) {
       
        for(int i=0;i<10;i++){
            System.out.println("Osijek");
        }
       
        for(int i=0;i<10;i++){
            System.out.println(i+1);
        }
      
    // zbroj prvih 100 brojeva
    int suma=0;
    for(int i=1;i<=100;i++){
        //suma=suma+;
        suma+=i;
    }
        System.out.println(suma);
        
        for(int i=0;i<10;i++){
        if(i==2){
        continue;
        }
        if(i==5){
        break;
        }
            System.out.println(i);
        }
    
        
    for(int i=1;i<=10;i++){
    for(int j=1;j<=10;j++){
        System.out.print(i*j + "");
    }
        System.out.println("");
    }
       
    // DZ FORMIRATI ISPIS BROJEVA
    //JEDINICE ISPOD JEDINICA,
    //DESETICE ISPOD DESETICA,
    //STOTICE ISPOD STOTICA,
    //BROJEVE PORAVNATI DESNO
    
    
    //beskonačna petlja
    
    for(;;){
        System.out.println(Math.random());
}
    
    }
}
