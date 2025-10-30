package Menu;



import Servico.ConsultarNotificacoes;

import java.util.Scanner;

public class MenuPrincipal {

    public static void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===============================");
            System.out.println("MENU PRINCIPAL - SINAN DIGITAL");
            System.out.println("===============================");
            System.out.println("[1] Registrar ficha de Hanseníase");
            System.out.println("[2] Registrar ficha de Tuberculose");
            System.out.println("[3] Registrar ficha de Malária");
            System.out.println("[4] Consultar notificações");
            System.out.println("[5] Gerar relatórios");
            System.out.println("[0] Sair");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                scanner.next();
            }

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    MenuHanseniase.iniciarRegistro();
                    break;
                case 2:
                    MenuTuberculose.iniciarRegistro();
                    break;
                case 3:
                    MenuMalaria.iniciarRegistro();
                    break;
                case 4:
                    System.out.println("Consulta de notificações.");
                    MenuConsulta.iniciarConsulta();

                    break;
                case 5:
                    System.out.println("Relatórios.");
                    MenuRelatorio.iniciarRelatorio();

                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println(" Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }
}