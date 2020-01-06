package com.atividades.atividadeSeis;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Oie" );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Idade: ");
        int idadeAnos = scanner.nextInt();
        
        System.out.println("Meses: ");
        int meses = scanner.nextInt();
        
        System.out.println("Dias: ");
        int dias = scanner.nextInt();
        
        int idadeMeses = (idadeAnos*12) + meses;
        
        int idadeDias = (idadeMeses*30) + dias;
        
        System.out.println("A idade em dias é " + idadeDias);
      
        
        scanner.close();
    }
}
