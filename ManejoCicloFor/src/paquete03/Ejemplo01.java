/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String posicion;
        int edad;
        double estatura;
        String acumulador = "Listado de Jugadores \n";
        int limite;
        int numero = 1;
        
        System.out.println("Ingrese el numero de veces que se desse ingresar la informacion");
        limite = entrada.nextInt();
        entrada.nextLine();
        
        for (int i = 0; i < limite; i++) {
            
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su posicion");
            posicion = entrada.nextLine();
            System.out.println("Ingrese su edad");
            edad = entrada.nextInt();
            System.out.println("Ingrese su estatura");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            acumulador = String.format("%s%d. %s -%s-, edad %d, estatura %.2f \n"
                    , acumulador,numero,nombre,posicion,edad, estatura);
            
            numero = numero + 1;
            // System.out.printf("%d", i);
        }
        // System.out.printf("%d\n", i);
        System.out.printf("%s",acumulador);

    }
}

