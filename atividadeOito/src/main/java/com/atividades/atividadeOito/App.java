package com.atividades.atividadeOito;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Digite a sua idade: " );
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        
        if (idade >=5 && idade <=7) {
        	System.out.println("Categoria Infantil A.");
        } else if (idade >=8 && idade <=11) {
        	System.out.println("Categoria Infantil B.");
        } else if (idade >=12 && idade <=13) {
        	System.out.println("Categoria Juvenil A.");
        } else if (idade >= 14 && idade <= 17) {
        	System.out.println("Categoria Juvenil B.");
        } else if (idade < 5) {
        	System.out.println("Não faz parte de nenhuma categoria.");
        } else {	
        	System.out.println("Categoria Adultos.");
        }
        
        scanner.close();
        
    }
}
    	