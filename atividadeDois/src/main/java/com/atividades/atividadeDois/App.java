package com.atividades.atividadeDois;

import java.util.Scanner;

/**
 * Atividade 02
 *As informações de logIn estão incorretas. Tente novamente.
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "=======Tela de Login :D ======" );;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira login:");
        String logIn = scanner.nextLine();
        
        System.out.println("Insira a sua senha: ");
        int passWord = scanner.nextInt();
        String user = "gutierreartur";
        int senhaCadastrada = 12345;
        
        		
        
        if (logIn.equals(user) && passWord == senhaCadastrada) {
        	System.out.println("Usuário logado..");
        } else {
        	System.out.println("As informações de logIn estão incorretas. Tente novamente.");
        }
        
        scanner.close();
        
    }
}
