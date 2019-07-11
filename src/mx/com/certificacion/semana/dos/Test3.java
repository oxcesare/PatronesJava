/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.semana.dos;


import java.util.stream.*;
/**
 *
 * @author cesaralducinruiz
 * 
 * Clase que ejemplifica el uso del método Of
 * 
 * Recibe tipos de datos primtiivos
 * 
 * Recibe tipos de datos objeto 
 */
public class Test3 {
 
    public static void main(String[] args) {
        
        //Stream<Float> tipoFloat = Stream.of(args)
        
        Test4 test4 = new Test4();
        
        
        /* Creando un Stream del tipo objeto, en este caso de
           la clase Test4
        */
        Stream<Test4> tipoFloat = Stream.of(new Test4());

                
        
    }
    
    
    
    
}


class Test4{

    public Test4() {
        System.out.println("Constuctor");
    }
    
    
}
