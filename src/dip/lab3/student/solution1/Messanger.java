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
    private Input input;
    private Output output;
    
    // takes any class that implements the Input or Output interfaces
    public Messanger(Input input, Output output) {
        this.input = input;
        this.output = output;
    }
    
    //delegates work to the proper low-level classes
    public void messege() {
        String line = input.readMessage();
        output.sendMessage(line);
    }
}
