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

public class Messenger {
    private MessageInput messageInput;
    private MessageOutput messageOutput;
    
    // takes any class that implements the Input or Output interfaces
    public Messenger(MessageInput input, MessageOutput output) {
        this.messageInput = input;
        this.messageOutput = output;
    }
    
    //delegates work to the proper low-level classes
    public void messege() {
        messageOutput.sendMessage(messageInput);
    }
}
