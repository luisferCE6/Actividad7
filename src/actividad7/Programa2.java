/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Programa2 {
    
    Scanner scan2 = new Scanner(System.in);
    
    public void Fobinacci(){
       
        int a, b, limite, i, auxiliar; 
        int[] array;
        
            System.out.println("Ingrese el número de numeros de Fibonacci que desea mostrar");
            
            limite = scan2.nextInt();
            array = new int[limite];
            a = 0;
            b = 1; 
            
            for (i = 0; i < limite; i++)  
            {
                auxiliar = a;
                a = b; 
                b = auxiliar + a; 
                array[i]=a;
            }
            
            for (int j = 0; j < array.length; j++) {
               System.out.println("Fibonacci: " + array[j]);          
        }
    }
}
