package ninagruppe.dings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EintragsProtokollierer
{
    private static Iterable<Eintrag> eintragsListe;
    private static String filepath;

    public EintragsProtokollierer(Iterable<Eintrag> iterable)
    {

        eintragsListe = iterable;
        filepath = "c:\\temp\\eintraege.txt";

    }

    public static void readLines() throws IOException
    {
        File file = new File(filepath);

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null)
        {
            System.out.println(line);
        }
        br.close();
        fr.close();
    }

    public static void writeInFile() throws IOException
    {
        FileWriter writer = new FileWriter(filepath);

        for (Eintrag eintrag : eintragsListe)
        {
            writer.write(eintrag.getText() + "\n");
        }

    }
}