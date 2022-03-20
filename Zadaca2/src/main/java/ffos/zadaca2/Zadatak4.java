/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.zadaca2;

import javax.swing.JOptionPane;

/**
 *
 * @author anja0
 */
public class Zadatak4 {

    // Program unosi cijeli broj
    // Program ispisuje vrijednosti shodno unesenom broju
    // 5: Primljeno
    // 7: U obradi
    // 9: Zaključeno
    // 11: Stornirano
    // Za sve ostale vrijednosti ispisuje: NIje valjani status
    public static void main(String[] args) {
        int broj
                = Integer.parseInt(
                        JOptionPane.showInputDialog("Unesite broj")
                );
        switch (broj) {
            case 5:
                System.out.println("Primljeno");
                break;
            case 7:
                System.out.println("U obradi");
                break;
            case 9:
                System.out.println("Zaključeno");
                break;
            case 11:
                System.out.println("Stornirano");
                break;
            default:
                System.out.println("Nije valjani status");

        }
    }
}
