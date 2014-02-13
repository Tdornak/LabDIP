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
public class Startup {
    
    public static void main(String[] args) {
        MessageInput input = new GoodMorningInput();
        MessageOutput output = new ConsoleOutput();
        Messenger m1 = new Messenger(input, output);
        m1.messege();
        
    }
}
