/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class KeyboardInput implements MessageInput {

    private Scanner keyboard = new Scanner(System.in);
    private String line;
    
    //returns a String read from the keyboard
    @Override
    public String readMessage() {
        System.out.println("Reading from keyboard...");
        line = keyboard.nextLine();
        return line;
    }
}
