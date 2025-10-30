package Dados;

import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;


public class ArquivoUtil {

    public static void salvar(String caminho, String conteudo) {
        try (FileWriter writer = new FileWriter(caminho, true)) {
            writer.write(conteudo + "\n");
        } catch (IOException e) {
            System.err.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    public static List<String> ler(String caminho) {
        List<String> linhas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                linhas.add(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler: " + e.getMessage());
        }
        return linhas;
    }
}