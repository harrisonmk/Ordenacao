
package projeto;

import java.util.ArrayList;
import java.util.Collections;


public class Main {


    public static void main(String[] args) {
        
        
       ArrayList<Produto> lista1 = new ArrayList<>();

        Produto produto1 = new Produto("1", "Arroz", 3.50);
        Produto produto2 = new Produto("2", "feijao", 4.50);
        Produto produto3 = new Produto("5", "macarrao", 5.50);
        Produto produto4 = new Produto("4", "cacau", 10.50);
        Produto produto5 = new Produto("0", "mateiga", 40.50);

        lista1.add(produto1);
        lista1.add(produto2);
        lista1.add(produto3);
        lista1.add(produto4);
        lista1.add(produto5);

        Collections.sort(lista1);

        for (Produto lista2 : lista1){
            
            System.out.println (lista2);
        }  
        
        
    }
    
}
