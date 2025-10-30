package Servico;


import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class ConsultarNotificacoes {

    private static final List<String> ARQUIVOS = List.of("malaria.txt", "hanseniase.txt", "tuberculose.txt");

    public void consultarPorNome(String nome) {
        System.out.println("\n Resultados para nome: " + nome);
        for (String arquivo : ARQUIVOS) {
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    if (linha.toLowerCase().contains(nome.toLowerCase())) {
                        System.out.println(" [" + arquivo + "] " + linha);
                    }
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler " + arquivo);
            }
        }
    }

    public void consultarPorBairro(String bairro) {
        System.out.println("\n Notificações no bairro: " + bairro);
        for (String arquivo : ARQUIVOS) {
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    if (linha.toLowerCase().contains(bairro.toLowerCase())) {
                        System.out.println(" [" + arquivo + "] " + linha);
                    }
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler " + arquivo);
            }
        }
    }

    public void consultarPorPeriodo(String inicio, String fim) {
        System.out.println("\nNotificações entre " + inicio + " e " + fim);
        LocalDate dataInicio = LocalDate.parse(inicio);
        LocalDate dataFim = LocalDate.parse(fim);

        for (String arquivo : ARQUIVOS) {
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    String[] partes = linha.split(";");
                    for (String parte : partes) {
                        try {
                            LocalDate data = LocalDate.parse(parte);
                            if (!data.isBefore(dataInicio) && !data.isAfter(dataFim)) {
                                System.out.println(" [" + arquivo + "] " + linha);
                                break;
                            }
                        } catch (Exception ignored) {}
                    }
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler " + arquivo);
            }
        }
    }

    public void consultarPorAgravo(String agravo) {
        System.out.println("\n Notificações para agravo: " + agravo);
        for (String arquivo : ARQUIVOS) {
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    if (linha.toLowerCase().contains(agravo.toLowerCase())) {
                        System.out.println(" [" + arquivo + "] " + linha);
                    }
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler " + arquivo);
            }
        }
    }
}