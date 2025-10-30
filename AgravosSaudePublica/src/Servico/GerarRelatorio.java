package Servico;




import java.io.*;
import java.util.*;

public class GerarRelatorio {

    private static final List<String> ARQUIVOS = List.of("malaria.txt", "hanseniase.txt", "tuberculose.txt");

    public void totalPorAgravo() {
        Map<String, Integer> contagem = new HashMap<>();
        for (String arquivo : ARQUIVOS) {
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    String[] partes = linha.split(";");
                    String agravo = partes[1]; // posição do agravo
                    contagem.put(agravo, contagem.getOrDefault(agravo, 0) + 1);
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler " + arquivo);
            }
        }
        System.out.println("\nTotal por agravo:");
        contagem.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public void totalPorBairro() {
        Map<String, Integer> contagem = new HashMap<>();
        for (String arquivo : ARQUIVOS) {
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    String[] partes = linha.split(";");
                    String bairro = partes[27]; // posição do bairro
                    contagem.put(bairro, contagem.getOrDefault(bairro, 0) + 1);
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler " + arquivo);
            }
        }
        System.out.println("\nTotal por bairro:");
        contagem.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    // Os métodos abaixo seguem o mesmo padrão:
    public void totalPorMesAno() { /* agrupar por partes[3] = dataNotificacao */ }
    public void totalPorFaixaEtaria() { /* calcular idade com base em nascimento */ }
    public void totalPorSexo() { /* partes[16] = sexo */ }
    public void totalPorRacaCor() { /* partes[17] = raca/cor */ }
    public void totalPorEscolaridade() { /* partes[18] = escolaridade */ }
}