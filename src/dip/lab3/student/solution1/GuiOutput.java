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
public class GuiOutput implements MessageOutput {

    private final JOptionPane gui = new JOptionPane();
    
    
    //Outputs a message to the gui
    @Override
    public void sendMessage(MessageInput line) {
        JOptionPane.showMessageDialog(null, line.readMessage());
    }
}
