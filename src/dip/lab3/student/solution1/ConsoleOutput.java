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
public class ConsoleOutput implements Output {

    
    //outputs a message to the console
    @Override
    public void sendMessage(String line) {
        System.out.println(line);
    }
}
