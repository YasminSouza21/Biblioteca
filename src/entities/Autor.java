package entities;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private List<Livro> livros = new ArrayList<>();

    public Autor(String nome) {
        this.nome = nome;
    }

    public Autor(){};

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

}
