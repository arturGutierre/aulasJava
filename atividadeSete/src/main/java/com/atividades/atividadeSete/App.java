package com.atividades.atividadeSete;

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
        System.out.println("Insira um número: " );
        float n1 = scanner.nextInt();
        System.out.println("Insira um número: ");
        float n2 = scanner.nextInt();
        
        System.out.println("Igual: " + (n1==n2));
        System.out.println("Diferente: " + (n1 != n2));
        System.out.println("Maior: " + (n1>n2));
        System.out.println("Menor: " + (n1<n2));
        System.out.println("Maior ou igual: " + (n1>=n2));
        System.out.println("Menor ou igual: " + (n1<=n2));
        
        scanner.close();
        
        
        
    }
}
