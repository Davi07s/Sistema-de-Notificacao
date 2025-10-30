package Menu;


import Servico.GerarRelatorio;
import java.util.Scanner;

public class MenuRelatorio {

    public static void iniciarRelatorio() {
        Scanner scanner = new Scanner(System.in);
        GerarRelatorio relatorio = new GerarRelatorio();
        int opcao;

        do {
            System.out.println("\n===============================");
            System.out.println("GERAR RELATÓRIOS");
            System.out.println("===============================");
            System.out.println("[1] Total de notificações por agravo");
            System.out.println("[2] Total de notificações por bairro");
            System.out.println("[3] Total de notificações por mês/ano");
            System.out.println("[4] Total de notificações por faixa etária");
            System.out.println("[5] Total de notificações por sexo");
            System.out.println("[6] Total de notificações por raça/cor");
            System.out.println("[7] Total de notificações por escolaridade");
            System.out.println("[0] Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                scanner.next();
            }

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    relatorio.totalPorAgravo();
                    break;
                case 2:
                    relatorio.totalPorBairro();
                    break;
                case 3:
                    relatorio.totalPorMesAno();
                    break;
                case 4:
                    relatorio.totalPorFaixaEtaria();
                    break;
                case 5:
                    relatorio.totalPorSexo();
                    break;
                case 6:
                    relatorio.totalPorRacaCor();
                    break;
                case 7:
                    relatorio.totalPorEscolaridade();
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }
}