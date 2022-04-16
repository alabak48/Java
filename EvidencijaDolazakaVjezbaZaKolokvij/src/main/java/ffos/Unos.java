/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author anja0
 */
public class Unos {

    public static String unosString(String poruka) {
        String unos = "";
        while (true) {
            unos = JOptionPane.showInputDialog(poruka);
            if (unos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Neispravan unos");
                continue;
            }
            break;
        }
        return unos;
    }

    public static int unosInt(String poruka) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(poruka));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Neispravan unos");
            }
        }
    }

    public static Date unosDate(String poruka) {
        SimpleDateFormat d = new SimpleDateFormat("dd.MM.yyyy.");
        while (true) {
            try {
                return d.parse(JOptionPane.showInputDialog(poruka));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Unesite datum, datum mjesec godina!");
            }
        }

    }
}
