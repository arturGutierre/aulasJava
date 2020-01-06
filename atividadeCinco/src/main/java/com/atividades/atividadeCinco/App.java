package com.atividades.atividadeCinco;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("======CÁLCULO DE COMISSÃO======");
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("ID VENDEDOR: ");
        String idVendedor = scanner.nextLine();
        System.out.println("ID PEÇA: ");
        scanner.nextInt();
        System.out.println("PREÇO UNITÁRIO: R$ ");
        float precoPeca = scanner.nextInt();
        System.out.println("QUANTIDADE DE PEÇAS: ");
        float qntPeca = scanner.nextInt();
        double valorCompra = precoPeca*qntPeca;
        System.out.println("VALOR DA COMPRA: R$ " + valorCompra);
        double valorComissao = (valorCompra*0.05);
        System.out.println("A comissão do ID " + idVendedor + "é R$ " + valorComissao);
        
        scanner.close();
    }
}
