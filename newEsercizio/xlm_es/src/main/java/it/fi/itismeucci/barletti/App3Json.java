package it.fi.itismeucci.barletti;

import java.io.File;
import java.sql.Date;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App3Json {
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

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("classe.json"), classe);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
