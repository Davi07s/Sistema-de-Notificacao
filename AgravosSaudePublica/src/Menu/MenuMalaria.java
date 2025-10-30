package Menu;


import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import Enums.*;
import Modelo.Malaria;
import Modelo.*;
import Servico.RegistrarNotificacoes;

public class MenuMalaria {

    public static void iniciarRegistro() {
        Scanner scanner = new Scanner(System.in);
        RegistrarNotificacoes service = new RegistrarNotificacoes();

        System.out.println("\n Registro de Ficha de Malaria \n");

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
        ni.setSexo(Sexo.valueOf(scanner.next().toUpperCase()));

        System.out.print("Raça/Cor (BRANCA/PARDA/PRETA/AMARELA/INDIGENA/IGNORADO): ");
        ni.setRacaCor(RacaCor.valueOf(String.valueOf(RacaCor.valueOf(scanner.next().toUpperCase()))));

        System.out.print("Escolaridade (NENHUMA/FUNDAMENTAL/MEDIO/SUPERIOR/IGNORADO): ");
        ni.setEscolaridade(Escolaridade.valueOf(String.valueOf(Escolaridade.valueOf(scanner.next().toUpperCase()))));
        scanner.nextLine(); //limpeza do buffer

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
        System.out.print("Número do prontuário: ");
        dc.setNumeroProntuario(scanner.nextLine());

        System.out.print("Ocupação: ");
        dc.setOcupacao(scanner.nextLine());



        Malaria ficha = new Malaria();
        ficha.setDadosGerais(dg);
        ficha.setNotificacaoIndividual(ni);
        ficha.setDadosResidenciais(dr);
        ficha.setDadosComplementares(dc);

        System.out.print("Data dos primeiros sintomas (AAAA-MM-DD): ");
        try {
            ficha.setDataPrimeirosSintomas(LocalDate.parse(scanner.nextLine()));
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida.");
            return;
        }

        System.out.print("Data da investigação (AAAA-MM-DD): ");
        try {
            ficha.setDataInvestigacao(LocalDate.parse(scanner.nextLine()));
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida.");
            return;
        }

        System.out.print("Atividade nos últimos 15 dias: ");
        ficha.setAtividadeUltimos15Dias(scanner.nextLine());

        System.out.print("Tipo de lâmina: ");
        ficha.setTipoLamina(scanner.nextLine());

        System.out.print("Paciente com sintomas (true/false): ");
        ficha.setComSintomas(Sintomas.valueOf(scanner.next().toUpperCase()));

        System.out.print("Data do exame (AAAA-MM-DD): ");
        try {
            ficha.setDataExame(LocalDate.parse(scanner.nextLine()));
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida.");
            return;
        }

        System.out.print("Resultado do exame: ");
        ficha.setResultadoExame(scanner.nextLine());

        System.out.print("Parasitos por mm³: ");
        ficha.setParasitosPorMm3(scanner.nextInt());
        scanner.nextLine(); // limpar buffer

        System.out.print("Parasitemia (cruzes): ");
        ficha.setParasitemiaCruzes(scanner.nextLine());

        System.out.print("Esquema de tratamento: ");
        ficha.setEsquemaTratamento(scanner.nextLine());

        System.out.print("Data de início do tratamento (AAAA-MM-DD): ");
        try {
            ficha.setDataInicioTratamento(LocalDate.parse(scanner.nextLine()));
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida.");
            return;
        }

        System.out.print("Classificação final: confirmado, descartado");
        ficha.setClassificacaoFinal(ClassificacaoFinalMalaria.valueOf(scanner.nextLine()));

        System.out.print("Local provável de infecção: ");
        ficha.setLocalProvavelInfeccao(scanner.nextLine());

        System.out.print("Município provável de infecção: ");
        ficha.setMunicipioProvavelInfeccao(scanner.nextLine());

        System.out.print("UF provável de infecção: ");
        ficha.setUfProvavelInfeccao(scanner.nextLine());

        System.out.print("País provável de infecção: ");
        ficha.setPaisProvavelInfeccao(scanner.nextLine());

        System.out.print("Caso autóctone (true/false): ");
        ficha.setCasoAutoctone(Autoctone.valueOf(scanner.next().toUpperCase()));

        System.out.println("Notificação registrada.");


        service.registrarFichaMalaria(ficha);

    }
}