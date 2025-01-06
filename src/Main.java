import entities.Autor;
import entities.Livro;
import entities.enums.GenerosDeLivros;
import service.CadastrarLivrosService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Scanner sc = new Scanner(System.in);
        Autor autor = new Autor();
        CadastrarLivrosService cadastrarLivrosService = new CadastrarLivrosService();

        cadastrarLivrosService.cadastrarLivros(livro, sc, autor);

        sc.close();
    }
}
