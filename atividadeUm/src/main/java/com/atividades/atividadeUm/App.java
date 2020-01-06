package com.atividades.atividadeUm;

import java.util.Scanner;

/**
 * Atividade 01
 *
 */
public class App 

{
	
	
	
    public static void main( String[] args )
    
   
    {
    	Scanner scanner1 = new Scanner(System.in);
    	System.out.print("Digite a idade de sua mãe: ");
    	int idadeMae = scanner1.nextInt();
    	
    	
    	System.out.print("Digite a sua idade: ");
    	int idadeSua = scanner1.nextInt();
    	
    	int diferenca = (idadeMae - idadeSua);
    	
    	System.out.println("Minha mãe é " + diferenca + " anos mais velha do que eu.");
    	
    	
    	scanner1.close();
    	
    	
    	
    	
    	
        
    }
}
