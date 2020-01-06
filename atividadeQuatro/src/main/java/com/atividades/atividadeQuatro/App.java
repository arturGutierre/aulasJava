package com.atividades.atividadeQuatro;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "======COTAÇÃO=====" );
        double cotacao = 4.06;
        
        System.out.println("Digite o valor em dólar: ");
        Scanner scanner = new Scanner(System.in);
        double qntDolar = Math.round(scanner.nextDouble());
        double conversao = Math.round((qntDolar * cotacao));
        
        System.out.println("O valor em reais é :" + conversao);
        
        scanner.close();
        
        
        
    }
}
