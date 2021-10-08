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
public class Programa1 {
    
    Scanner scan = new Scanner(System.in);
    
    public void Primos(){
                   
            int n = 2;
            int total = 1;
            int array[];
            int limite;
            int cont = 0;
                     
            System.out.println("Ingrese la acntidad de números primos que desea ver: ");
            limite = scan.nextInt();
            array = new int[limite];
            
            while (total <= limite)
            {

                Boolean esPrimo = true;

                for (int i = 2; i < n; i++)
                {
                    if (n % i == 0)
                    {
                        esPrimo = false;                       
                    }
                }   
                
                if (esPrimo)
                {
                    array[cont] = n;
                    cont++;
                    total++;
                }                     
                n++;
            }          
           
            for (int i = 0; i < array.length; i++) {
            System.out.println("Numeros primos: " + array[i]);
        }
    }
}

