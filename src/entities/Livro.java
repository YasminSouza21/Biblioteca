package entities;
import entities.enums.GenerosDeLivros;

import java.time.LocalDate;

public class Livro {
    private String titulo;
    private Autor autor;
    private LocalDate dataDePublicacao;
    private GenerosDeLivros genero;

    public Livro(String titulo, Autor autor, LocalDate dataDePublicacao, GenerosDeLivros genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataDePublicacao = dataDePublicacao;
        this.genero = genero;
    }

    public Livro(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public LocalDate getDataDePublicacao() {
        return dataDePublicacao;
    }

    public void setDataDePublicacao(LocalDate dataDePublicacao) {
        this.dataDePublicacao = dataDePublicacao;
    }

    public GenerosDeLivros getGenero() {
        return genero;
    }

    public void setGenero(GenerosDeLivros genero) {
        this.genero = genero;
    }
}
