import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal{

    static List<Conversor> lista = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== CONVERSOR UNIVERSAL ===");
            System.out.println("1 - Nova Conversão Térmica");
            System.out.println("2 - Nova Conversão Energética");
            System.out.println("3 - Listar Conversões");
            System.out.println("4 - Deletar Conversão");
            System.out.println("0 - Sair");
            System.out.println("\nAqui digite seu valor: ");


            opcao = sc.nextInt();

            switch(opcao) {

                case 1:
                    System.out.print("Valor: ");
                    double valorT = sc.nextDouble();
                    ConversorTermico ct = new ConversorTermico(valorT, "C", "F");
                    ct.calcularConversao();
                    lista.add(ct);
                    System.out.println(" Seu Valor Foi Salvo!");
                    break;

                case 2:
                    System.out.print("Valor: ");
                    double valorE = sc.nextDouble();
                    ConversorEnergetico ce = new ConversorEnergetico(valorE, "J", "CAL");
                    ce.calcularConversao();
                    lista.add(ce);
                    System.out.println("Salvo!");
                    break;

                case 3:
                    for (int i = 0; i < lista.size(); i++) {
                        Conversor c = lista.get(i);
                        System.out.println(i + " - " +
                                c.getValorEntrada() + " " +
                                c.getUnidadeOrigem() + " -> " +
                                c.getValorSaida() + " " +
                                c.getUnidadeDestino());
                    }
                    break;

                case 4:
                    System.out.print("Digite o índice para deletar: ");
                    int indice = sc.nextInt();
                    if (indice >= 0 && indice < lista.size()) {
                        lista.remove(indice);
                        System.out.println("Removido!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
            }

        } while(opcao != 0);
        System.out.println("Obrigado, Programa fechando...");
        System.out.println("\n0Bye");
        sc.close();
    }
}