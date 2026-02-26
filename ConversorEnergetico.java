public class ConversorEnergetico extends Conversor {

    public ConversorEnergetico(double valorEntrada, String origem, String destino) {
        super(valorEntrada, origem, destino);
    }

    @Override
    public void calcularConversao() {

        double resultado = 0;

        if (getUnidadeOrigem().equals("J") && getUnidadeDestino().equals("CAL")) {
            resultado = getValorEntrada() / 4.184;
        } 
        else if (getUnidadeOrigem().equals("CAL") && getUnidadeDestino().equals("J")) {
            resultado = getValorEntrada() * 4.184;
        }
        else if (getUnidadeOrigem().equals("J") && getUnidadeDestino().equals("V")) {
            resultado = getValorEntrada() / 1; // assumindo carga padrão = 1C
        }
        else if (getUnidadeOrigem().equals("V") && getUnidadeDestino().equals("CAL")) {
            resultado = getValorEntrada() * 4.184;
        }

        setValorSaida(resultado);
    }
}