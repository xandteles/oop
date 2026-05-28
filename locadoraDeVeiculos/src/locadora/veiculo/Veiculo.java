package locadora.veiculo;

import locadora.Locacao;

public abstract class Veiculo {

protected String placa, modelo;
protected double valorDiaria = 150.0;

private Locacao loc;

public Veiculo(String placa, String modelo, double valorDiaria){

this.placa = placa;
this.modelo = modelo;
this.valorDiaria = valorDiaria;
}

    public double getValorDiaria() {
        return valorDiaria;
    }

    public String getModelo() {
        return modelo;
    }

    public String getplaca() {return placa;}



public abstract double calcularValorLocacao(long dias) ;




}
