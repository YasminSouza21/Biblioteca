package service;

import entities.Autor;
import entities.Livro;
import entities.enums.GenerosDeLivros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CadastrarLivrosService {

    public void cadastrarLivros(Livro livro, Scanner sc, Autor autor){

        System.out.println("---------------------------------------------");
        System.out.println("Digite o nome do livro: ");
        String nomeLivro = sc.nextLine();
        System.out.println("Digite o nome do Autor");
        String nomeAutor = sc.nextLine();
        System.out.println("Digite a data de publicação do livro: ");
        System.out.print("Ano: ");
        int ano = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Dia: ");
        int dia = sc.nextInt();
        System.out.println("Escolha o genero do livro pela numeração: ");
        GenerosDeLivros.interarNomeGeneros();
        int generoDoLivro = sc.nextInt();
        GenerosDeLivros genero = GenerosDeLivros.escolherGenero(generoDoLivro);
        System.out.println("---------------------------------------------");
        
        System.out.println("Confira se as informações estão corretas antes de confirmar o cadastro do livro.");
        System.out.println("Nome livro: " + nomeLivro);
        System.out.println("Nome autor: " + nomeAutor);
        System.out.println("Data de publicação: " + LocalDate.of(ano, mes, dia).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Genero: " + genero.name());
    }
}
