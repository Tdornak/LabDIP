/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


/**
 *
 * @author Tim
 */
public class FileOutput implements Output {

    private PrintWriter output;
    
    
    //Outputs a message to a file
    @Override
    public void sendMessage(String line) {
        try {
            output = new PrintWriter("file.txt");
            output.println(line);
            output.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
    }
}
