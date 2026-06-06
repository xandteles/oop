package locadora;

import locadora.veiculo.Veiculo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Locacao implements Locavel {

private double valorTotal;
private LocalDate dataInicio;
private LocalDate dataFim;

private Veiculo veiculo;
private Cliente cliente;

public Locacao(Cliente cliente, Veiculo veiculo, LocalDate dataInicio, LocalDate dataFim) {
this.cliente = cliente;
this.veiculo = veiculo;
this.dataInicio = dataInicio;
this.dataFim = dataFim;
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

    @Override
    public void iniciarLocacao(){
        System.out.println("=============================");
        System.out.println("LOCAÇÃO INICIADA COM SUCESSO!");
        System.out.println("=============================");
    }

    @Override
    public void finalizarLocacao(){
        long dias = ChronoUnit.DAYS.between(dataInicio, dataFim);
        this.valorTotal = veiculo.calcularValorLocacao(dias);
        System.out.println("=============================");
        System.out.println("LOCAÇÃO FINALIZADA!");
        System.out.println("Total de dias: " + dias);
        System.out.println("Valor total: R$ " + valorTotal);
        System.out.println("=============================");
    }
}
