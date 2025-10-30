package Menu;


import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import Enums.*;
import Modelo.Tuberculose;
import Modelo.*;
import Servico.RegistrarNotificacoes;

public class MenuTuberculose {

    public static void iniciarRegistro() {
        Scanner scanner = new Scanner(System.in);
        RegistrarNotificacoes service = new RegistrarNotificacoes();

        System.out.println("\n Registro de Ficha de Tuberculose");

        //  Dados Gerais
        DadosGerais dg = new DadosGerais();
        System.out.print("Tipo de entrada: ");
        dg.setTipoNotificacao(scanner.nextLine());

        System.out.print("Agravo/doença: ");
        dg.setAgravoDoenca(scanner.nextLine());

        System.out.print("Código CID-10: ");
        dg.setCodigoCID10(scanner.nextLine());

        System.out.print("Unidade de saúde: ");
        dg.setUnidadeSaude(scanner.nextLine());

        System.out.print("Código da unidade de saúde: ");
        dg.setCodigoUnidadeSaude(scanner.nextLine());

        System.out.print("UF da notificação: ");
        dg.setUfNotificacao(scanner.nextLine());

        System.out.print("Município da notificação: ");
        dg.setMunicipioNotificacao(scanner.nextLine());

        System.out.print("Código IBGE: ");
        dg.setCodigoIBGE(scanner.nextLine());

        System.out.print("Número do prontuário: ");
        dg.setNumeroProntuario(scanner.nextLine());

        System.out.print("Forma de entrada: ");
        dg.setFormaEntrada(scanner.nextLine());

        System.out.print("Modo de detecção: ");
        dg.setModoDeteccao(scanner.nextLine());

        //  Notificação Individual
        NotificacaoIndividual ni = new NotificacaoIndividual();
        System.out.print("Nome completo do paciente: ");
        ni.setNomePaciente(scanner.nextLine());

        ni.setDataNotificacao(LocalDate.now());

        System.out.print("Data de nascimento (AAAA-MM-DD): ");
        try {
            ni.setDataNascimento(LocalDate.parse(scanner.nextLine()));
        } catch (DateTimeParseException e) {
            System.out.println(" Data inválida. Use o formato AAAA-MM-DD.");
            return;
        }

        System.out.print("Sexo (MASCULINO/FEMININO/IGNORADO): ");
        ni.setSexo(Sexo.valueOf(String.valueOf(Sexo.valueOf(scanner.next().toUpperCase()))));

        System.out.print("Raça/Cor (BRANCA/PARDA/PRETA/AMARELA/INDIGENA/IGNORADO): ");
        ni.setRacaCor(RacaCor.valueOf(String.valueOf(RacaCor.valueOf(scanner.next().toUpperCase()))));

        System.out.print("Escolaridade (NENHUMA/FUNDAMENTAL/MEDIO/SUPERIOR/IGNORADO): ");
        ni.setEscolaridade(Escolaridade.valueOf(String.valueOf(Escolaridade.valueOf(scanner.next().toUpperCase()))));
        scanner.nextLine(); // limpar buffer

        //  Dados Residenciais
        DadosResidencia dr = new DadosResidencia();
        System.out.print("UF de residência: ");
        dr.setUf(scanner.nextLine());

        System.out.print("Município de residência: ");
        dr.setMunicipio(scanner.nextLine());

        System.out.print("Zona Residencial: Urbana, Rural, Periurbana, Ignorado ");
        dr.setZona(ZonaResidencial.valueOf(String.valueOf(ZonaResidencial.valueOf(scanner.next().toUpperCase()))));

        System.out.print("Bairro: ");
        dr.setBairro(scanner.nextLine());

        System.out.print("CEP: ");
        dr.setCep(scanner.nextLine());

        //  Dados Complementares
        DadosComplementares dc = new DadosComplementares();
        System.out.print("Número do prontuário (complementar): ");
        dc.setNumeroProntuario(scanner.nextLine());

        System.out.print("Ocupação: ");
        dc.setOcupacao(scanner.nextLine());

        //  Ficha Tuberculose
        Tuberculose ficha = new Tuberculose();
        ficha.setDadosGerais(dg);
        ficha.setNotificacaoIndividual(ni);
        ficha.setDadosResidenciais(dr);
        ficha.setDadosComplementares(dc);

        System.out.print("Tipo de entrada: ");
        ficha.setTipoEntrada(scanner.nextLine());

        System.out.print("Forma da tuberculose: ");
        ficha.setForma(FormaTuberculose.valueOf(String.valueOf(FormaTuberculose.valueOf(scanner.next().toUpperCase()))));

        System.out.print("Forma extrapulmonar: ");
        ficha.setFormaExtrapulmonar(scanner.nextLine());

        System.out.print("HIV associado (true/false): ");
        ficha.setHiv(Boolean.parseBoolean(scanner.nextLine()));

        System.out.print("AIDS (true/false): ");
        ficha.setAids(Boolean.parseBoolean(scanner.nextLine()));

        System.out.print("Alcoolismo (true/false): ");
        ficha.setAlcoolismo(Boolean.parseBoolean(scanner.nextLine()));

        System.out.print("Diabetes (true/false): ");
        ficha.setDiabetes(Boolean.parseBoolean(scanner.nextLine()));

        System.out.print("Doença mental (true/false): ");
        ficha.setDoencaMental(Boolean.parseBoolean(scanner.nextLine()));

        System.out.print("Uso de drogas (true/false): ");
        ficha.setUsoDrogas(Boolean.parseBoolean(scanner.nextLine()));

        System.out.print("Tabagismo (true/false): ");
        ficha.setTabagismo(Boolean.parseBoolean(scanner.nextLine()));

        System.out.print("Terapia antirretroviral (true/false): ");
        ficha.setTerapiaAntirretroviral(Boolean.parseBoolean(scanner.nextLine()));

        System.out.print("Baciloscopia do escarro: ");
        ficha.setBaciloscopiaEscarro(scanner.nextLine());

        System.out.print("Radiografia de tórax: ");
        ficha.setRadiografiaTorax(scanner.nextLine());

        System.out.print("Histopatologia: ");
        ficha.setHistopatologia(scanner.nextLine());

        System.out.print("Cultura: ");
        ficha.setCultura(scanner.nextLine());

        System.out.print("Teste de sensibilidade: ");
        ficha.setTesteSensibilidade(scanner.nextLine());

        System.out.print("Teste molecular rápido: ");
        ficha.setTesteMolecularRapido(scanner.nextLine());

        System.out.print("Data de início do tratamento (AAAA-MM-DD): ");
        try {
            ficha.setDataInicioTratamento(LocalDate.parse(scanner.nextLine()));
        } catch (DateTimeParseException e) {
            System.out.println(" Data inválida. Use o formato AAAA-MM-DD.");
            return;
        }

        System.out.print("Total de contatos identificados: ");
        ficha.setTotalContatosIdentificados(scanner.nextInt());

        System.out.println("Notificação Registrada. ");

        //  Registrar
        service.registrarFichaTuberculose(ficha);
    }
}