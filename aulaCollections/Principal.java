import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String[] args) {
        // ArrayList<String> listaEstados = new ArrayList<String>();
        
        // listaEstados.add("Minas Gerais");
        // listaEstados.add("Sampa");
        // listaEstados.add("January's lake");
        // listaEstados.add("Stóp");

        // Iterator i = listaEstados.iterator();
        // while (i.hasNext()){
        //     String estado = i.next().toString();
        //     System.out.println(estado);
        // }
        // System.out.println("***" + listaEstados.get(2) + "***");
        // }

        ArrayList <Pessoa> listaPessoas = new ArrayList<Pessoa>();

        listaPessoas.add(new Pessoa("MauMau", 32));
        listaPessoas.add(new Pessoa("uaMuaM", 23));
        listaPessoas.add(new Pessoa("Ogust", 25));
        listaPessoas.add(new Pessoa("tsugO", 52));

        Iterator i = listaPessoas.iterator();
        while(i.hasNext()){
            String p = i.next().toString();
            System.out.println(p);
        }
        System.out.println("*** " + listaPessoas.get(2) + " ***");
}