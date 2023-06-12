
package projeto;

import java.util.Objects;


public class Produto implements Comparable <Produto> {
    
    
      private String ID;
    private String nome;
    private Double preco;

    public Produto(String ID, String nome, double preco) {
        this.ID = ID;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.ID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Produto outroObjeto) {

        //Colocando o - antes do atributo a ordem vai ficar decrescente
        return -this.ID.compareTo(outroObjeto.getID());
    }

    @Override
    public String toString() {
        return "\nID: " + this.ID
                + "\nNome: " + this.nome
                + "\nPreco: " + this.preco;
}
    
}
