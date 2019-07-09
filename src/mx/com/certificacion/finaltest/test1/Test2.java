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
 * 1 byte son 8 bits  es decir su valor es de 127 
 * 
 */
public class Test2 {

    public static int m1(int i) {
        return ++i;
    }

    public static void main(String[] args) {
        int k = m1(args.length);
        k += 3 + ++k;
        System.out.println(k);
        System.out.println(methodX(Byte.MAX_VALUE));
    }

    public static double methodX(byte by) {
        double d = 10.0;
        return (long) by / d * 3;
    }

}
