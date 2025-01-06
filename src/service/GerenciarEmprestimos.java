package service;

import entities.Emprestimo;

import java.time.Period;

public class GerenciarEmprestimos {

    public String diasParaDevolver(Emprestimo emprestimo){
        Period dias = Period.between(emprestimo.getDataDeEmprestimo(), emprestimo.getDataDeEmprestimo());
        return "Dias para devolver: " + dias;
    }
}
