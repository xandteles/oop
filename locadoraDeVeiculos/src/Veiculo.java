public abstract class Veiculo {

protected String placa, modelo;
protected double valorDiaria;

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

    public String getplaca() {

return placa;
}

public double calcularValorLocacao() {


}

}
