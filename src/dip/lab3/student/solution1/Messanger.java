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
    Reader reader;
    Writer writer;
    
    public Messanger(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }
    
    public void messege() {
        String line = reader.readMessage();
        writer.sendMessage(line);
    }
}
