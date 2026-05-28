package locadora.veiculo;

public class Caminhao extends Veiculo {

    public Caminhao(String placa, String modelo, double valorDiaria) {

        super(placa, modelo, valorDiaria);

    }

    @Override
    public double calcularValorLocacao(long dias) {
        return 0;
    }


}
