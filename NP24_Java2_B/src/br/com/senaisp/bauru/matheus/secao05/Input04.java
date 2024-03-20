package br.com.senaisp.bauru.matheus.secao05;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(
        		Input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        sc.nextLine(); // primeira linha
        System.out.println(sc.nextLine()); //segunda linha

        
        sc.nextLine(); // pula para a proxima linha *terceira linha
        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper")); // quarta linha
        //Store the next two numbers as xPosition and yPosition
        int xPosition, yPosition;
        xPosition = sc.nextInt();
        yPosition = sc.nextInt();
        //Print these positions
        
        
        System.out.println("X: "+xPosition+ ", Y: "+ yPosition);
        sc.close();
    }    
}
