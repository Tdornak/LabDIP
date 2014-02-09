/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Tim
 */
public class GuiWriter implements Writer {

    private final JOptionPane gui = new JOptionPane();
    
    @Override
    public void sendMessage(String line) {
        JOptionPane.showMessageDialog(null, line);
    }
    
}
