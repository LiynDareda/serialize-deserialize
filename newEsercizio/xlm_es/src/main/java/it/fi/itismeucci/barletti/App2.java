package it.fi.itismeucci.barletti;

import java.io.File;
import java.sql.Date;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App2 {
    public static void main( String[] args )
    {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            System.out.println("--------");
            Classe c2 = xmlMapper.readValue(new File("classe.xml"), Classe.class);
            System.out.println("--------");

            System.out.println(c2.getAula());

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
