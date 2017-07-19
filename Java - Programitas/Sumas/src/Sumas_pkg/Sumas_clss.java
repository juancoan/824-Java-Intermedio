/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sumas_pkg;

import java.util.Scanner;

/**
 *
 * @author A
 */
public class Sumas_clss 

{
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    
    {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int numero1; // primer numero
        int numero2; //segundonumero
        int suma; //resultado de ambos
        
        System.out.print("Escriba el primer Entero");
        numero1 = entrada.nextInt();
        
        System.out.print("Escriba el segundo Entero ");
        numero2 = entrada.nextInt();
        
        suma = numero1 + numero2;
        
        System.out.printf("La suma es %d\n", suma);
    }
    
}
