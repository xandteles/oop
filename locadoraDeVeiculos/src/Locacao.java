import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Locacao {

private double valorTotal;
private LocalDate dataInicio;
private LocalDate dataFim;

public Locacao(double valorTotal, LocalDate dataInicio, LocalDate dataFim) {
this.valorTotal = valorTotal;
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
    long diasDeDiferenca = ChronoUnit.DAYS.between(dataInicio, dataFim);

//falta o metodo;
//teste push
//teste novamente
// teste novamente 2.0
}
