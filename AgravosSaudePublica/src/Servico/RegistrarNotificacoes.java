package Servico;


import Modelo.Hanseniase;
import Modelo.Tuberculose;
import Modelo.*;
import Modelo.DadosComplementares;
import Modelo.DadosGerais;
import Modelo.DadosResidencia;
import Modelo.NotificacaoIndividual;
import Dados.ArquivoUtil;
import Enums.Baciloscopia;
import Enums.ClassificacaoFinalMalaria;
import Enums.Escolaridade;
import Enums.EsquemaTerapeuticoHanseniase;
import Enums.FormaClinicaHanseniase;
import Enums.FormaTuberculose;
import Enums.Gestante;
import Enums.RacaCor;
import Enums.Sexo;
import Enums.ZonaResidencial;

import java.time.LocalDate;


public class RegistrarNotificacoes {

    private static final String CAMINHO_HANSENIASE = "hanseniase.txt";
    private static final String CAMINHO_TUBERCULOSE = "tuberculose.txt";
    private static final String CAMINHO_MALARIA = "malaria.txt";

    public void registrarFichaHanseniase(Hanseniase ficha) {
        String linha = serializarFichaHanseniase(ficha);
        ArquivoUtil.salvar(CAMINHO_HANSENIASE, linha);
        System.out.println("Ficha de Hanseníase registrada com sucesso.");
    }

    public void registrarFichaTuberculose(Tuberculose ficha) {
        String linha = serializarFichaTuberculose(ficha);
        ArquivoUtil.salvar(CAMINHO_TUBERCULOSE, linha);
        System.out.println("Ficha de Tuberculose registrada com sucesso.");
    }

    //  Serializador Hanseníase
    private String serializarFichaHanseniase(Hanseniase ficha) {
        DadosGerais dg = ficha.getDadosGerais();
        NotificacaoIndividual ni = ficha.getNotificacaoIndividual();
        DadosResidencia dr = ficha.getDadosResidenciais();
        DadosComplementares dc = ficha.getDadosComplementares();

        return String.join(";",
                dg.getTipoNotificacao(),
                dg.getAgravoDoenca(),
                dg.getCodigoCID10(),
                dg.getDataNotificacao() != null ? dg.getDataNotificacao().toString() : "",
                dg.getDataDiagnostico() != null ? dg.getDataDiagnostico().toString() : "",
                dg.getUnidadeSaude(),
                dg.getCodigoUnidadeSaude(),
                dg.getUfNotificacao(),
                dg.getMunicipioNotificacao(),
                dg.getCodigoIBGE(),
                dg.getNumeroProntuario(),
                dg.getFormaEntrada(),
                dg.getModoDeteccao(),

                ni.getNomePaciente() != null ? ni.getNomePaciente() : "",
                ni.getDataNotificacao() != null ? ni.getDataNotificacao().toString() : "",
                ni.getDataNascimento() != null ? ni.getDataNascimento().toString() : "",
                ni.getSexo() != null ? ni.getSexo().name() : "",
                ni.getRacaCor() != null ? ni.getRacaCor().name() : "",
                ni.getEscolaridade() != null ? ni.getEscolaridade().name() : "",

                dr.getUf(),
                dr.getMunicipio(),
                dr.getZona() != null ? dr.getZona().name() : "",
                dr.getBairro(),
                dr.getCep(),

                dc.getNumeroProntuario(),
                dc.getOcupacao(),

                String.valueOf(ficha.getNumeroLesoesCutaneas()),
                String.valueOf(ficha.getNumeroNervosAfetados()),
                ficha.getClassificacaoOperacional(),
                ficha.getFormaClinica()  != null ? ficha.getFormaClinica().name() : "",
                String.valueOf(ficha.getGrauIncapacidadeFisica()),
                ficha.getModoEntrada(),
                ficha.getModoDeteccao(),
                ficha.getBaciloscopia()  != null ? ficha.getBaciloscopia().name() : "",
                ficha.getEsquemaTerapeutico() != null ? ficha.getEsquemaTerapeutico().name() : "",
                ficha.getDataInicioTratamento() != null ? ficha.getDataInicioTratamento().toString() : "",
                String.valueOf(ficha.getNumeroContatosRegistrados())
        );
    }

    //  Serializador Tuberculose
    private String serializarFichaTuberculose(Tuberculose ficha) {
        DadosGerais dg = ficha.getDadosGerais();
        NotificacaoIndividual ni = ficha.getNotificacaoIndividual();
        DadosResidencia dr = ficha.getDadosResidenciais();
        DadosComplementares dc = ficha.getDadosComplementares();

        return String.join(";",
                dg.getTipoNotificacao(),
                dg.getAgravoDoenca(),
                dg.getCodigoCID10(),
                dg.getDataNotificacao() != null ? dg.getDataNotificacao().toString() : "",
                dg.getDataDiagnostico() != null ? dg.getDataDiagnostico().toString() : "",
                dg.getUnidadeSaude(),
                dg.getCodigoUnidadeSaude(),
                dg.getUfNotificacao(),
                dg.getMunicipioNotificacao(),
                dg.getCodigoIBGE(),
                dg.getNumeroProntuario(),
                dg.getFormaEntrada(),
                dg.getModoDeteccao(),

                ni.getNomePaciente() != null ? ni.getNomePaciente() : "",
                ni.getDataNotificacao() != null ? ni.getDataNotificacao().toString() : "",
                ni.getDataNascimento() != null ? ni.getDataNascimento().toString() : "",
                ni.getSexo() != null ? ni.getSexo().name() : "",
                ni.getRacaCor() != null ? ni.getRacaCor().name() : "",
                ni.getEscolaridade() != null ? ni.getEscolaridade().name() : "",

                dr.getUf(),
                dr.getMunicipio(),
                dr.getZona()!= null ? dr.getZona().name() : "",
                dr.getBairro(),
                dr.getCep(),

                dc.getNumeroProntuario(),
                dc.getOcupacao(),

                ficha.getTipoEntrada(),
                ficha.getForma() != null ? ficha.getForma().name() : "",
                ficha.getFormaExtrapulmonar(),
                String.valueOf(ficha.isHiv()),
                String.valueOf(ficha.isAids()),
                String.valueOf(ficha.isAlcoolismo()),
                String.valueOf(ficha.isDiabetes()),
                String.valueOf(ficha.isDoencaMental()),
                String.valueOf(ficha.isUsoDrogas()),
                String.valueOf(ficha.isTabagismo()),
                String.valueOf(ficha.isTerapiaAntirretroviral()),
                ficha.getBaciloscopiaEscarro(),
                ficha.getRadiografiaTorax(),
                ficha.getHistopatologia(),
                ficha.getCultura(),
                ficha.getTesteSensibilidade(),
                ficha.getTesteMolecularRapido(),
                ficha.getDataInicioTratamento() != null ? ficha.getDataInicioTratamento().toString() : "",
                String.valueOf(ficha.getTotalContatosIdentificados())
        );
    }


    public void registrarFichaMalaria(Malaria ficha) {
        String linha = serializarFichaMalaria(ficha);
        ArquivoUtil.salvar(CAMINHO_MALARIA, linha);
        System.out.println("Ficha de Malária registrada com sucesso.");
    }

    private String serializarFichaMalaria(Malaria ficha) {
        DadosGerais dg = ficha.getDadosGerais();
        NotificacaoIndividual ni = ficha.getNotificacaoIndividual();
        DadosResidencia dr = ficha.getDadosResidenciais();
        DadosComplementares dc = ficha.getDadosComplementares();

        return String.join(";",
                // Dados Gerais
                dg.getTipoNotificacao(),
                dg.getAgravoDoenca(),
                dg.getCodigoCID10(),
                dg.getDataNotificacao() != null ? dg.getDataNotificacao().toString() : "",
                dg.getDataDiagnostico() != null ? dg.getDataDiagnostico().toString() : "",
                dg.getUnidadeSaude(),
                dg.getCodigoUnidadeSaude(),
                dg.getUfNotificacao(),
                dg.getMunicipioNotificacao(),
                dg.getCodigoIBGE(),
                dg.getNumeroProntuario(),
                dg.getFormaEntrada(),
                dg.getModoDeteccao(),

                // Notificação Individual
                ni.getNomePaciente() != null ? ni.getNomePaciente() : "",
                ni.getDataNotificacao() != null ? ni.getDataNotificacao().toString() : "",
                ni.getDataNascimento() != null ? ni.getDataNascimento().toString() : "",
                ni.getSexo() != null ? ni.getSexo().name() : "",
                ni.getRacaCor() != null ? ni.getRacaCor().name() : "",
                ni.getEscolaridade() != null ? ni.getEscolaridade().name() : "",

                // Dados Residenciais
                dr.getUf(),
                dr.getMunicipio(),
                dr.getBairro(),
                dr.getCep(),

                // Dados Complementares
                dc.getNumeroProntuario(),
                dc.getOcupacao(),



                // Dados específicos da Malária
                ficha.getDataPrimeirosSintomas() != null ? ficha.getDataPrimeirosSintomas().toString() : "",
                ficha.getDataInvestigacao() != null ? ficha.getDataInvestigacao().toString() : "",
                ficha.getAtividadeUltimos15Dias(),
                ficha.getTipoLamina(),
                ficha.getComSintomas()  != null ? ficha.getComSintomas().name() : "",
                ficha.getDataExame() != null ? ficha.getDataExame().toString() : "",
                ficha.getResultadoExame(),
                String.valueOf(ficha.getParasitosPorMm3()),
                ficha.getParasitemiaCruzes(),
                ficha.getEsquemaTratamento(),
                ficha.getDataInicioTratamento() != null ? ficha.getDataInicioTratamento().toString() : "",
                ficha.getClassificacaoFinal()  != null ? ficha.getClassificacaoFinal().name() : "",
                ficha.getLocalProvavelInfeccao(),
                ficha.getMunicipioProvavelInfeccao(),
                ficha.getUfProvavelInfeccao(),
                ficha.getPaisProvavelInfeccao(),
                String.valueOf(ficha.isCasoAutoctone())
        );
    }
}