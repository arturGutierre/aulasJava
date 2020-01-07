package com.eclipsedois.exercicioEclipseUm;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
        System.out.println( "Insira um número: " );
        int x = scanner.nextInt();
        
        System.out.println("Insira um número: ");
        int y = scanner.nextInt();
        
        System.out.println("Insira um número:");
        int z = scanner.nextInt();
        System.out.println("\n");
        
        
        
        if( ( x > y && x > z ) && ( y > z ) ) { 
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }
        else if( ( x > y && x > z ) && ( z > y ) ) { 
            System.out.println(x);
            System.out.println(z);
            System.out.println(y);
        }
        else if( ( y > x && y > z ) && ( x > z ) ) { 
            System.out.println(y);
            System.out.println(x);
            System.out.println(z);
        }
        else if( ( y > x && y > z ) && ( z > x ) ) { 
            System.out.println(y);
            System.out.println(z);
            System.out.println(x);
        }
        else if( ( z > x && z > y ) && ( x > y ) ) { 
            System.out.println(z);
            System.out.println(x);
            System.out.println(y);
        }
        else if( ( z > x && z > y ) && ( y > x ) ) { 
            System.out.println(z);
            System.out.println(y);
            System.out.println(x);
        }
        
        scanner.close(); 
    }
}
        
      
        