/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class FileInput implements MessageInput {

    private File file = new File("file.txt");
    private Scanner input;
    private String line;
    
    
    //returns a String read from a file
    @Override
    public String readMessage() {
        
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
        
        while (input.hasNext()) {
            line += input.nextLine();
        }
        input.close();
        return line;
    }
}
