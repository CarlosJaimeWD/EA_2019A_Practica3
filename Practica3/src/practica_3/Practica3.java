/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author carlosjaime
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("input.txt"));
        StringBuilder sb = new StringBuilder();
        StringBuilder vocalA = new StringBuilder();
        StringBuilder vocalE = new StringBuilder();
        StringBuilder vocalI = new StringBuilder();
        StringBuilder vocalO = new StringBuilder();
        StringBuilder vocalU = new StringBuilder();
        
        int a = 0,e = 0,i = 0,o = 0,u = 0;
        
        while(in.hasNext()) {
            sb.append(in.next());
        }
        in.close();
        String outString = sb.toString();
        System.out.println(outString);
        
        for (char c : outString.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a':
                    vocalA.append(c);
                    a++;
                break;
                case 'e':
                    vocalE.append(c);
                    e++;
                break;
                case 'i':
                    vocalI.append(c);
                    i++;
                break;
                case 'o':
                    vocalO.append(c);
                    o++;
                break;
                case 'u':
                    vocalU.append(c);
                    u++;
                break;
            }
        }
        System.out.println("a: " + a);
        System.out.println("e: " + e);
        System.out.println("i: " + i);
        System.out.println("o: " + o);
        System.out.println("u: " + u);
        System.out.println("");
        System.out.println(vocalA);
        System.out.println(vocalE);
        System.out.println(vocalI);
        System.out.println(vocalO);
        System.out.println(vocalU);
    }
    
}
