package com.atividades.atividadeTres;

import java.util.Scanner;

/**
 * Atividade 03
 *
 */
public class App {
	


    public static void main( String[] args )
    {

        System.out.println( "=======MÉDIA DE ESTOQUE :D ======" );;
        Scanner scanner = new Scanner(System.in);
        System.out.println("QUANTIDADE MÍNIMA: ");
        int qntMin = scanner.nextInt();
        
        System.out.println("QUANTIDADE MÁXIMA: ");
        int qntMax = scanner.nextInt();
        
        int estoque = (qntMin + qntMax) / 2;
        
        
        System.out.println("O ESTOQUE MÉDIO É " + estoque + " .");
        
        scanner.close();
    }
}

        
        
        
        
        
        
