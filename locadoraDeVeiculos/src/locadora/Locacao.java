package locadora;

import locadora.veiculo.Veiculo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Locacao {

private double valorTotal;
private LocalDate dataInicio;
private LocalDate dataFim;

private Veiculo veiculo;

public Locacao(double valorTotal, LocalDate dataInicio, LocalDate dataFim, Veiculo veiculo) {
this.valorTotal = valorTotal;
this.dataInicio = dataInicio;
this.dataFim = dataFim;
this.veiculo = veiculo;

}

    public LocalDate getDataFim() {
        return dataFim;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public double getValorTotal() {
        return valorTotal;
    }


void iniciarLocacao(){
    System.out.println("=============================");
    System.out.println("LOCAÇÃO INICIADA COM SUCESSO!");
    System.out.println("=============================");
}

void finalizarLocacao(){
    long dias = ChronoUnit.DAYS.between(dataInicio, dataFim);
    this.valorTotal = veiculo.getValorDiaria();
}
}
