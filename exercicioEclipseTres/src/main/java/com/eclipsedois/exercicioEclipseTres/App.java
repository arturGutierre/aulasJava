package com.eclipsedois.exercicioEclipseTres;

import java.util.Scanner;

public class App

{
    public static void main(String args[])
    {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o primeiro número: ");

        int num1 = scanner.nextInt();

        System.out.print("Entre com o segundo valor: ");

        int num2 = scanner.nextInt();

        System.out.println("Selecione a operação: ");
        System.out.println("\n\n1- SOMA ");
        System.out.println("2- DIMINUI");
        System.out.println("3- MULTIPLICA");
        System.out.println("4- DIVIDE ");
        System.out.println("5- SAIR");
       


        int opc = scanner.nextInt();

        switch(opc)
        {
            case 1:

                int soma = num1 + num2;
                System.out.println("A soma é: "+soma);

                break;

            case 2:

                int diminui = num1 - num2;
                System.out.println("A subtração é: "+diminui);

                break;

            case 3:

                int multiplica = num1 * num2;

                System.out.println("A multiplicação é: "+multiplica);

                break;

            case 4:

                if (num1 < num2){
                    System.out.println("Não foi possível realizar o cálculo. \n");
                }
                else
                {
                int divide = num1 / num2;

                System.out.println("A divisao é: "+divide);
                }

                break;
                
                
            case 5:

                
                System.out.println("Até logo!");

                break;


                default:

                    System.out.print("Operação Inválida!");


                  scanner.close();

        }

    }
}
        