package entities;
import java.time.LocalDate;

public class Emprestimo {
    private final LocalDate dataDeEmprestimo;
    private LocalDate dataDeDevolucao;

    public Emprestimo(LocalDate dataDeEmprestimo, LocalDate dataDeDevolucao) {
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public LocalDate getDataDeEmprestimo() {
        return dataDeEmprestimo;
    }

    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao(LocalDate dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }
}
