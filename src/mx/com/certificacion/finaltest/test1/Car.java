/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.finaltest.test1;

import java.util.ArrayList;

/**
 *
 * @author cesaralducinruiz
 * 
 * Puedes guardar un objeto de una clase que implementa una interface
 */
abstract class Vehicle {
}

interface Drivable {
}

public class Car extends Vehicle implements Drivable {

    public static void main(String[] args) {
        //ArrayList<SUV> al3 = new ArrayList<>();
        //Drivable d1 = al3.get(0);
        ArrayList<SUV> al4 = new ArrayList<>(); 
        Car c2 = al4.get(0);
    }
}

class SUV extends Car {
}
