/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.finaltest.test1;

/**
 *
 * @author cesaralducinruiz
 * 
 *  A switch works with the byte, short, char,
 *  and int primitive data types. It also works 
 *  with enumerated types (discussed in Enum Types)
 */
public class TestClass {

    public static int getSwitch(int x) {
        return x - 20 / x + x * x;
    }

    public static void main(String args[]) {
        switch (getSwitch(10)) {
            case 1:
            case 2:
            case 3:
            default:
                break;
        }
    }
}
