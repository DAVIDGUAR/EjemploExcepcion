/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg8_excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Ex8_Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Operaciones op = new Operaciones();

        op.sumar(8, 2);
        op.dividirConExcepciones(8, 2);
        op.restar(8, 2);
        op.sumar(8, 0);
        try {
            op.dividirLanzandoExcepcion(8, 0);

        } catch (ArithmeticException ex) {
            System.out.println(ex);

        }
        op.restar(8, 0);

        //como en el metodo hay un throw te obliga a capturar el objeto por si entra en la exception
        
        try {
            op.dividirCaNosaExcepcion(8, 0);
        } catch (DividirExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("fin del programa");
        
        
    }
}
