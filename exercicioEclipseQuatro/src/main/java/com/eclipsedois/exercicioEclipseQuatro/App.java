package com.eclipsedois.exercicioEclipseQuatro;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o primeiro número: ");

        int num1 = scanner.nextInt();

        System.out.print("Entre com o segundo valor: ");

        int num2 = scanner.nextInt();
        
        if (num1 % num2 == 0) {
        	
        	System.out.println("Os números são múltiplos.");
        	
        } else {
        	System.out.println("Os números não são múltiplos.");
        }
        
        int num3 = (num1+num2)/2;
        
        if (num3 >= 7) {
        	System.out.println("A média é maior ou igual a sete.");
        	
        }else {
        	System.out.println("A média não é maior que sete.");
        }
        
        if (num1 % 2 == 0) {
        	System.out.println("O número " + num1 + " é par.");
        } else {
        	System.out.println("O número " + num1 + " é ímpar.");
        }
        
        if (num2 % 2 == 0) {
        	System.out.println("O número " + num2 + " é par.");
        } else {
        	System.out.println("O número " + num2 + " é ímpar.");        }
        
        scanner.close();
    }
     
        
       
    }

