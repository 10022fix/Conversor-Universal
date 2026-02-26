import java.time.LocalDateTime;

public class Conversor {

    private double valorEntrada;
    private double valorSaida;
    private String unidadeOrigem;
    private String unidadeDestino;
    private LocalDateTime dataHora;

    public Conversor() {}

    public Conversor(double valorEntrada, String unidadeOrigem, String unidadeDestino) {
        this.valorEntrada = valorEntrada;
        this.unidadeOrigem = unidadeOrigem;
        this.unidadeDestino = unidadeDestino;
        this.dataHora = LocalDateTime.now();
    }

    public void calcularConversao() {
        // será sobrescrito
    }

    // GETTERS E SETTERS
    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public double getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(double valorSaida) {
        this.valorSaida = valorSaida;
    }

    public String getUnidadeOrigem() {
        return unidadeOrigem;
    }

    public void setUnidadeOrigem(String unidadeOrigem) {
        this.unidadeOrigem = unidadeOrigem;
    }

    public String getUnidadeDestino() {
        return unidadeDestino;
    }

    public void setUnidadeDestino(String unidadeDestino) {
        this.unidadeDestino = unidadeDestino;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}