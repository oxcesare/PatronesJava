/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mx.patrones.facade;

/**
 *
 * @author Oxcesare
 */
public class ClienteImpresora {
    public static void main(String[] args) {
        
        
        Impresora a = new Impresora();
        a.setHoja("A4");
        a.setTexto("Teknei");
        a.setColor(true);
        a.setTipoDocumento("PDF");
        
        
        Impresora b = new Impresora();
        a.setHoja("A4");
        a.setTexto("Teknei 2");
        a.setColor(true);
        a.setTipoDocumento("PDF");
        
        
        
        
    }
}
