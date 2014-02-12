/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

/**
 *
 * @author Tim
 */

public class Messanger {
    private MessageInput MessageInput;
    private MessageOutput MessageOutput;
    
    // takes any class that implements the Input or Output interfaces
    public Messanger(MessageInput input, MessageOutput output) {
        this.MessageInput = input;
        this.MessageOutput = output;
    }
    
    //delegates work to the proper low-level classes
    public void messege() {
        MessageOutput.sendMessage(MessageInput);
    }
}
