package com.eclipsedois.exercicioEclipseDois;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
        System.out.println( "Insira um número: " );
        int x = scanner.nextInt();
        
        if (x >= 0 && x != -0) {
        	System.out.println("O número é positivo.");
        } else {
        	System.out.println("O número é negativo");
        }
        
        
        
        scanner.close();
    }
}
