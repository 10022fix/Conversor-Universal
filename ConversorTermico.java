public class ConversorTermico extends Conversor {

    public ConversorTermico(double valorEntrada, String origem, String destino) {
        super(valorEntrada, origem, destino);
    }

    @Override
    public void calcularConversao() {

        double resultado = 0;

        if (getUnidadeOrigem().equals("C") && getUnidadeDestino().equals("F")) {
            resultado = (getValorEntrada() * 9/5) + 32;
        } 
        else if (getUnidadeOrigem().equals("C") && getUnidadeDestino().equals("K")) {
            resultado = getValorEntrada() + 273.15;
        }
        else if (getUnidadeOrigem().equals("F") && getUnidadeDestino().equals("C")) {
            resultado = (getValorEntrada() - 32) * 5/9;
        }
        else if (getUnidadeOrigem().equals("K") && getUnidadeDestino().equals("F")) {
            resultado = (getValorEntrada() - 273.15) * 9/5 + 32;
        }

        setValorSaida(resultado);
    }
}