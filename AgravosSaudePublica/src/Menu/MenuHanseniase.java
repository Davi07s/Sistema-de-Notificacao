package Menu;



import java.time.LocalDate;
import java.util.Scanner;

import Enums.*;
import Modelo.Hanseniase;
import Modelo.*;
import Servico.RegistrarNotificacoes;

public class MenuHanseniase {

    public static void iniciarRegistro() {
        Scanner scanner = new Scanner(System.in);
        RegistrarNotificacoes service = new RegistrarNotificacoes();

        System.out.println("\n Registro de Ficha de Hanseníase");

        //  Dados Gerais
        DadosGerais dg = new DadosGerais();
        System.out.print("Tipo de notificação: ");
        dg.setTipoNotificacao(scanner.nextLine());

        System.out.print("Agravo/doença: ");
        dg.setAgravoDoenca(scanner.nextLine());

        System.out.print("Código CID-10: ");
        dg.setCodigoCID10(scanner.nextLine());

        System.out.print("Data de notificação (AAAA-MM-DD): ");
        dg.setDataNotificacao(LocalDate.parse(scanner.nextLine()));

        System.out.print("Data do diagnóstico (AAAA-MM-DD): ");
        dg.setDataDiagnostico(LocalDate.parse(scanner.nextLine()));

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
        ni.setDataNascimento(LocalDate.parse(scanner.nextLine()));

        System.out.print("Sexo (MASCULINO/FEMININO/IGNORADO): ");
        ni.setSexo(Sexo.valueOf(String.valueOf(Sexo.valueOf(scanner.next().toUpperCase()))));

        System.out.print("Raça/Cor (BRANCA/PARDA/PRETA/AMARELA/INDIGENA/IGNORADO): ");
        ni.setRacaCor(RacaCor.valueOf(String.valueOf(RacaCor.valueOf(scanner.next().toUpperCase()))));

        System.out.print("Escolaridade (analfabeto/fundamental incompleto/MEDIO/SUPERIOR/IGNORADO): ");
        ni.setEscolaridade(Escolaridade.valueOf(String.valueOf(Escolaridade.valueOf(scanner.next().toUpperCase()))));
        scanner.nextLine(); // limpar buffer

        // Dados Residenciais
        DadosResidencia dr = new DadosResidencia();
        System.out.print("UF de residência: ");
        dr.setUf(scanner.nextLine());

        System.out.print("Município de residência: ");
        dr.setMunicipio(scanner.nextLine());

        System.out.print("Bairro: ");
        dr.setBairro(scanner.nextLine());

        System.out.print("CEP: ");
        dr.setCep(scanner.nextLine());

        // Dados Complementares
        DadosComplementares dc = new DadosComplementares();
        System.out.print("Número do prontuário (complementar): ");
        dc.setNumeroProntuario(scanner.nextLine());

        System.out.print("Ocupação: ");
        dc.setOcupacao(scanner.nextLine());

        // Ficha Hanseníase
        Hanseniase ficha = new Hanseniase();
        ficha.setDadosGerais(dg);
        ficha.setNotificacaoIndividual(ni);
        ficha.setDadosResidenciais(dr);
        ficha.setDadosComplementares(dc);

        System.out.print("Número de lesões cutâneas: ");
        ficha.setNumeroLesoesCutaneas(scanner.nextInt());

        System.out.print("Número de nervos afetados: ");
        ficha.setNumeroNervosAfetados(scanner.nextInt());

        scanner.nextLine(); // limpar buffer

        System.out.print("Classificação operacional: ");
        ficha.setClassificacaoOperacional(scanner.nextLine());

        System.out.print("Forma clínica (INDTERMINADA/TUBERCULOIDE/DIMORFA/VIRCHOWIANA): ");
        ficha.setFormaClinica(FormaClinicaHanseniase.valueOf(String.valueOf(FormaClinicaHanseniase.valueOf(scanner.next().toUpperCase()))));

        System.out.print("Grau de incapacidade física (0/1/2): ");
        ficha.setGrauIncapacidadeFisica(scanner.nextInt());

        scanner.nextLine(); // limpar buffer

        System.out.print("Modo de entrada: ");
        ficha.setModoEntrada(scanner.nextLine());

        System.out.print("Modo de detecção: ");
        ficha.setModoDeteccao(scanner.nextLine());

        System.out.print("Baciloscopia (POSITIVA/NEGATIVA/NAO_REALIZADA/IGNORADO): ");
        ficha.setBaciloscopia(Baciloscopia.valueOf(String.valueOf(Baciloscopia.valueOf(scanner.next().toUpperCase()))));

        System.out.print("Esquema terapêutico (PQT_PB_6_DOSES/PQT_MB_12_DOSES/OUTROS): ");
        ficha.setEsquemaTerapeutico(EsquemaTerapeuticoHanseniase.valueOf(String.valueOf(EsquemaTerapeuticoHanseniase.valueOf(scanner.next().toUpperCase()))));

        System.out.print("Data de início do tratamento (AAAA-MM-DD): ");
        ficha.setDataInicioTratamento(LocalDate.parse(scanner.next()));

        System.out.print("Número de contatos registrados: ");
        ficha.setNumeroContatosRegistrados(scanner.nextInt());

        System.out.print("Notificação registrada.");

        //  Registrar
        service.registrarFichaHanseniase(ficha);
    }
}