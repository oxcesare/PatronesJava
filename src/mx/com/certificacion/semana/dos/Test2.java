/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.semana.dos;

import java.util.stream.Stream;

/**
 *
 * @author cesaralducinruiz
 */
public class Test2 {
    
    
    public static void main(String[] args) {
        
        Stream<Integer> stream = Stream.of(0,2);
        
        System.out.println("stream");
        
        stream.forEach(i -> {
           i = i+1;
            System.out.println(i);
        });
        
    }
}
