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
public class IncrementDecrement {
    public static void main(String[] args) {
        
        int i=1; //1
        i = i+1; //2
        i+=1; //3
        i++; //4
        ++i; //5
        
        int j = 0;
        System.out.println(j++); //0
        System.out.println(++j); //2
        
        int t=1,k=0;
        t = k++;
        k = t-k;
        System.out.println(k+t);
                
    }
}
