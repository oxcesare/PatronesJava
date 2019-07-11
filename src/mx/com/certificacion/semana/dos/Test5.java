/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.semana.dos;

import java.util.stream.*;
import java.util.*;

/**
 *
 *
 * @author cesaralducinruiz
 *
 * Clase ejemplo para la creacion de un Arraylist y mediante stream ordenar,
 * filtrar y aplicar ciertas operaciones.
 *
 */
public class Test5 {
    
    public static void main(String[] args) {
        
        List<String> list1 = Arrays.asList("cesa", "abcd", "dfgs");
        
        list1.stream().filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);
        
    }
}
