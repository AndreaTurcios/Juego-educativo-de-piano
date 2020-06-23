/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoandreat;

import java.util.Scanner;

/**
 *
 * @author Nanos
 */
public class Contador_Puntaje_UC1 
{
    public static void main (String [] args) 
    {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        System.out.println("Ingrese el puntaje: ");
        int num = sc.nextInt();
        cont = cont + num;
        System.out.println("El puntaje final es de: " + suma);
    }
}
