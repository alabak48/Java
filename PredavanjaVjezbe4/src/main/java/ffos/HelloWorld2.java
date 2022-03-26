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
public class HelloWorld2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "Hello world, ");
            if (i == 100) {
                System.out.print("Hello world.");
            } else {
                System.out.print("Hello World, ");
            }
        }
// kraće
        for (int i = 0; i < 100; i++) {
            System.out.print("Hello World" + (i != 99 ? ", " : ""));
        }
    }
}
