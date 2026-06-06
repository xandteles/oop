package locadora.veiculo;

public class Carro extends Veiculo{
    public Carro(String placa, String modelo, double valorDiaria){
        super(placa, modelo, valorDiaria);

    }

    @Override
    public double calcularValorLocacao(long dias){
        return getValorDiaria() * dias;
    }
}
