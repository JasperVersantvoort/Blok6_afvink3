import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Genen_boom {

    public static void main(String[] args) throws IOException {
        ArrayList<ArrayList<String>> chr_gen = new ArrayList<>();
        chr_gen = bestand_lezer();
        System.out.println(chr_gen.get(1).get(2));

        Boom_maker(chr_gen);
    }

    public static ArrayList<ArrayList<String>> bestand_lezer() throws IOException {

        String line;
        ArrayList<String> chromosoom = new ArrayList<>();
        ArrayList<String> gen_name = new ArrayList<>();
        ArrayList<ArrayList<String>> chr_gen = new ArrayList<>();

        BufferedReader infile = new BufferedReader(new FileReader("Homo_sapiens_genes.txt"));
        infile.readLine();
        while ((line = infile.readLine()) != null) {
            chromosoom.add(line.split("\t")[6]);
            gen_name.add(line.split("\t")[2]);
        }

        chr_gen.add(chromosoom);
        chr_gen.add(gen_name);

        return (chr_gen);


    }

    private static void Boom_maker(ArrayList<ArrayList<String>> chr_gen) {
        LinkedList<LinkedList<String>> Linked_chr_gen = new LinkedList<>();
        LinkedList<String> linked_chr= new LinkedList<>();

        for (int i = 0; i<chr_gen.size();i++){
            if(linked_chr.contains(chr_gen.get(0).get(i))){

            }else{
                linked_chr.add(chr_gen.get(0).get(i));
        }

        }


    }
}

