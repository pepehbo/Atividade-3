import java.util.Scanner;

public class PesquisaAudiencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 0;
        int[] audiencia = new int[5]; // Para canais 2, 4, 5, 7, 12
        int[] canais = {2, 4, 5, 7, 12};

        while (true) {
            System.out.print("Digite o número do canal (2, 4, 5, 7, 12) ou 0 para encerrar: ");
            int canal = scanner.nextInt();
            if (canal == 0) break;

            if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 12) {
                System.out.print("Digite o número de pessoas assistindo ao canal: ");
                int pessoas = scanner.nextInt();
                totalPessoas += pessoas;

                // Armazenar a audiência para o canal correspondente
                for (int i = 0; i < canais.length; i++) {
                    if (canais[i] == canal) {
                        audiencia[i] += pessoas;
                        break;
                    }
                }
            } else {
                System.out.println("Canal inválido. Tente novamente.");
            }
        }

        // Exibir percentual de audiência
        System.out.println("Percentual de audiência por canal:");
        for (int i = 0; i < canais.length; i++) {
            double percentual = totalPessoas > 0 ? (audiencia[i] / (double) totalPessoas) * 100 : 0;
            System.out.printf("Canal %d: %.2f%%\n", canais[i], percentual);
        }

        scanner.close();
    }
}