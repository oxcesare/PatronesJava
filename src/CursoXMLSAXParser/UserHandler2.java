/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoXMLSAXParser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author cesar_ar Versión 2 de la clase que hara que busque un elemento en
 * especifico del archivo XML utilizando SAX PARSER
 */
public class UserHandler2 extends DefaultHandler {

    boolean bFirstName = false;
    boolean bLastName = false;
    boolean bNickName = false;
    boolean bMarks = false;
    String rollNo = null;

    @Override
    public void startElement(String uri,
            String localName, String qName, Attributes attributes)
            throws SAXException {

        if (qName.equalsIgnoreCase("student")) {
            rollNo = attributes.getValue("rollno");
        }
        if (("593").equals(rollNo)
                && qName.equalsIgnoreCase("student")) {
            System.out.println("Start Element :" + qName);
        }
        if (qName.equalsIgnoreCase("firstname")) {
            bFirstName = true;
        } else if (qName.equalsIgnoreCase("lastname")) {
            bLastName = true;
        } else if (qName.equalsIgnoreCase("nickname")) {
            bNickName = true;
        } else if (qName.equalsIgnoreCase("marks")) {
            bMarks = true;
        }
    }

    @Override
    public void endElement(String uri,
            String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("student")) {
            if (("593").equals(rollNo)
                    && qName.equalsIgnoreCase("student")) {
                System.out.println("End Element :" + qName);
            }
        }
    }

    @Override
    public void characters(char ch[],
            int start, int length) throws SAXException {

        if (bFirstName && ("593").equals(rollNo)) {
            //age element, set Employee age
            System.out.println("First Name: "
                    + new String(ch, start, length));
            bFirstName = false;
        } else if (bLastName && ("593").equals(rollNo)) {
            System.out.println("Last Name: "
                    + new String(ch, start, length));
            bLastName = false;
        } else if (bNickName && ("593").equals(rollNo)) {
            System.out.println("Nick Name: "
                    + new String(ch, start, length));
            bNickName = false;
        } else if (bMarks && ("593").equals(rollNo)) {
            System.out.println("Marks: "
                    + new String(ch, start, length));
            bMarks = false;
        }
    }

}
