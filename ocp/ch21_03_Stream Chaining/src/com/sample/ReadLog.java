/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jacki
 */
public class ReadLog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrintWriter pw = new PrintWriter(System.out, true);
        
        try(FileReader fr = new FileReader("log.txt");
                BufferedReader br = new BufferedReader(fr)){
            
            String line;
            while((line=br.readLine()) != null){
                pw.println(line);
            }
            
        } catch (IOException ex) {
            pw.println(ex);
        }
        
        //----------------------------
        
        PrintWriter out = new PrintWriter(System.out, false);
        out.println("AAA");
        out.println("BBB");
        out.flush();
        out.println("CCC");
        pw.println("============");
        
    }
    
}
