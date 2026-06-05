package locadora.veiculo;

public class Moto extends Veiculo {


    public Motoca(String placa, String modelo, double valorDiaria){

        super(placa, modelo, valorDiaria);
    }

@Override
    public double calcularValorLocacao(int dias){
        return getValorDiaria() * dias - 50;
    }

}

