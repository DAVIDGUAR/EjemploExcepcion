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
public class DividirExcepcion extends Exception{

 

//contructor por defecto 
       public DividirExcepcion() {
           //llama al constructor por defecto de la superclase
           //no hace falta ponerlo xq lo llama directamente
           //super();
           
    } 
    
     public DividirExcepcion (String mensaje){
         super(mensaje);
     }
       
}
