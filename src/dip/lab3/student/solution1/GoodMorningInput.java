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
public class GoodMorningInput implements MessageInput {

    private final String message = "Good morning!!";
    
    @Override
    public String readMessage() {
        return message;
    }
    
}
