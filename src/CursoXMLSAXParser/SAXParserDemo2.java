/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoXMLSAXParser;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 *
 * @author cesar_ar
 * Clase principal para ejecutar el ejemplo de SAX PARSER para buscar informacion especifica en un archivo XML
 * 
 */
import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserDemo2 {

    public static void main(String[] args) {

        try {
            File inputFile = new File("C:\\Users\\cesar_ar\\Documents\\NetBeansProjects\\ProyectoEuler\\src\\CursoXMLSAXParser\\nuevo1.txt");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            UserHandler2 userhandler = new UserHandler2();
            saxParser.parse(inputFile, userhandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
