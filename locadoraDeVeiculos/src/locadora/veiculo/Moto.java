package locadora.veiculo;

public class Moto extends Veiculo {

public Moto(String placa, String modelo, double valorDiaria) {

  super(placa, modelo, valorDiaria);

}

    @Override
    public double calcularValorLocacao(long dias) {
        return 0;
    }
}
