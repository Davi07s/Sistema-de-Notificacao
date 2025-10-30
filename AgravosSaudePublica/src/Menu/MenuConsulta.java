package Menu;



import Servico.ConsultarNotificacoes;
import java.util.Scanner;

public class MenuConsulta {

    public static void iniciarConsulta() {
        Scanner scanner = new Scanner(System.in);
        ConsultarNotificacoes consulta = new ConsultarNotificacoes();
        int opcao;

        do {
            System.out.println("\n===============================");
            System.out.println("CONSULTA DE NOTIFICAÇÕES");
            System.out.println("===============================");
            System.out.println("[1] Consultar por nome do paciente");
            System.out.println("[2] Listar notificações por bairro");
            System.out.println("[3] Listar notificações por período");
            System.out.println("[4] Listar notificações por agravo");
            System.out.println("[0] Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                scanner.next();
            }

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 :
                    System.out.print("Digite o nome do paciente: ");
                    String nome = scanner.nextLine();
                    consulta.consultarPorNome(nome);
                    break;

                case 2 :
                    System.out.print("Digite o nome do bairro: ");
                    String bairro = scanner.nextLine();
                    consulta.consultarPorBairro(bairro);
                    break;

                case 3 :
                    System.out.print("Data inicial (AAAA-MM-DD): ");
                    String inicio = scanner.nextLine();
                    System.out.print("Data final (AAAA-MM-DD): ");
                    String fim = scanner.nextLine();
                    consulta.consultarPorPeriodo(inicio, fim);
                    break;

                case 4 :
                    System.out.print("Digite o nome do agravo (ex: Malaria): ");
                    String agravo = scanner.nextLine();
                    consulta.consultarPorAgravo(agravo);
                    break;

                case 0 : System.out.println("Retornando ao menu principal...");

                default : System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }
}