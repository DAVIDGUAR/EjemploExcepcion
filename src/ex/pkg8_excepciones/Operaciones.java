/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg8_excepciones;

/**
 *
 * @author lvazquezdorna
 */
public class Operaciones {

    public void sumar(int x, int y) {
        System.out.println("Suma :\n " + x + " + " + y + " = " + (x + y));

    }

    public void restar(int x, int y) {
        System.out.println("Resta :\n " + x + " - " + y + " = " + (x - y));

    }

    public void dividirConCondicionales(int x, int y) {
        if (y == 0) {
            System.out.println("No se puede dividir entre 0");
        } else {
            System.out.println("Division:\n " + x + " / " + y + " = " + (x / y));
        }

    }

    public void operar(int x, int y) {
        System.out.println("Suma :\n " + x + " + " + y + " = " + (x + y));
        System.out.println("Resta :\n " + x + " - " + y + " = " + (x - y));
        System.out.println("Division:\n " + x + " / " + y + " = " + (x / y));
    }

    public void dividirConExcepciones(int x, int y) {

        System.out.println("Antes da excepcion");
        try {
            System.out.println("Division:\n " + x + " / " + y + " = " + (x / y));
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        }

        System.out.println("Despues de la excepcion");
    }

    public void dividirLanzandoExcepcion(int x, int y) throws ArithmeticException {
        if (y == 0) {
//            ArithmeticException obx = new ArithmeticException("NO divide entre 0");
//              throw obx;
            throw new ArithmeticException("non se pude dividir entre 0");
        } else {
            System.out.println("Division:\n " + x + " / " + y + " = " + (x / y));
        }
    }

    
    public void dividirCaNosaExcepcion(int x, int y) throws DividirExcepcion {

        if (y == 0) {
            throw new DividirExcepcion("\nNo se puede dividir entre o");
        } else {

            System.out.println("RESULTADO = " + x / y);
        }

    }

    
    
}//final class

