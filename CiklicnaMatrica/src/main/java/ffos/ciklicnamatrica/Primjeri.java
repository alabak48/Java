/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.ciklicnamatrica;

/**
 *
 * @author anja0
 */
public class Primjeri {
    public static void main(String[] args) {
        
    int[][] draw = new int[400][300];
    for (int i = 0; i < draw.length; i++) {
        for (int b = 0; i < draw[i].length; i++) {
            if (Math.random() > 0.5) {
                int x = 16777215; // num for black
                                  // should normally be 0 but for trial purposes, I used 16777215
                draw[i][b] = x;
            } else {
                int x = 16777215; // num for white
                draw[i][b] = x;
            }
        }
    }
    for (int i = 0; i < draw.length; i++) {
        for (int b = 0; b < draw[i].length; b++) {
            System.out.println(draw[i][b]);
            //should be a random spread of 0 and 16777215 but 16777215 appears only every 300 lines in the output. 
        }
    }
}
    }

