package it.fi.itismeucci.barletti;
import java.io.File;
import java.sql.Date;
import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
public class App 
{
    public static void main( String[] args )
    {
        Alunno barletti = new Alunno("leonardo", "barletti", new Date(2004, 9, 23));
        Alunno ndoja = new Alunno("flavio", "ndoja", new Date(2004, 12, 31));
        Alunno lanzi = new Alunno("guido", "lanzi", new Date(2004, 3, 29));
        Alunno nencioni = new Alunno("daniele", "nencioni", new Date(2004, 3, 27));

        ArrayList<Alunno> list = new ArrayList<>();
        list.add(barletti);
        list.add(ndoja);
        list.add(lanzi);
        list.add(nencioni);

        Classe classe = new Classe(5, "CIA", "06-TE", list);
        XmlMapper xmlMapper = new XmlMapper();
        try {
            String xml = xmlMapper.writeValueAsString(classe);
            System.out.println("--------");
            Classe c2 = xmlMapper.readValue(xml, Classe.class);
            System.out.println(c2.getAula());
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}
