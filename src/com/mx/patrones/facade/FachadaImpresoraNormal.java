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
public class FachadaImpresoraNormal {

    Impresora impresora;

    public FachadaImpresoraNormal(String texto) {
        super();
        impresora = new Impresora();
        impresora.setColor(true);
        impresora.setHoja("A4");
        impresora.setTipoDocumento("PDF");
        impresora.setTexto(texto);
    }

    public void imprimir() {

        impresora.imprimirDocumento();
    }
}
