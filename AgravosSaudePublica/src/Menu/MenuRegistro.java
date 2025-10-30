package Menu;

import Menu.MenuHanseniase;
import Menu.MenuTuberculose;
import Menu.MenuMalaria;
import java.util.Scanner;

public class MenuRegistro {

    public static void exibirMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nREGISTRAR NOTIFICAÇÃO");
            System.out.println("1. Hanseníase");
            System.out.println("2. Tuberculose");
            System.out.println("3. Malária");
            System.out.println("0. Voltar");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 : MenuHanseniase.iniciarRegistro();
                case 2 : MenuTuberculose.iniciarRegistro();
                case 3 : MenuMalaria.iniciarRegistro();
                case 0 : {
                    return;
                }
                default : System.out.println("Opção inválida.");
            }
        }
    }
}