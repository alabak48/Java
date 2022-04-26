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
public class RadScanner {
    public static void main(String[] args) {
        
        Scanner ulaz = new Scanner(System.in);
        
        System.out.println("Unesi broj!");
        
        int i = Integer.parseInt(ulaz.nextLine());
        
        System.out.println(i);
    }
    
}
