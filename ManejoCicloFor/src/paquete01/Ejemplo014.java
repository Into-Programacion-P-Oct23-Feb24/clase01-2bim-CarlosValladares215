/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se pueden acumular los valores obtenidos,
        // para presentarlos una sola vez al final del codigo, si es necesario.
        int cadenaFinal = 0;
        for (int i = 1; i <= 10; i++) {
            cadenaFinal = i + cadenaFinal;
        }
        
        for (int i = 1; i < 11; i++) {
            cadenaFinal = i + cadenaFinal;
        }
        System.out.printf("%s", cadenaFinal);

    }

}
