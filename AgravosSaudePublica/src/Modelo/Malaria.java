package Modelo;

import java.time.LocalDate;

import Enums.*;

public class Malaria extends FichaNotificacao {
    private LocalDate dataPrimeirosSintomas;
    private LocalDate dataInvestigacao;
    private String atividadeUltimos15Dias;
    private String tipoLamina;
    private Sintomas comSintomas;
    private LocalDate dataExame;
    private String resultadoExame;
    private int parasitosPorMm3;
    private String parasitemiaCruzes;
    private String esquemaTratamento;
    private LocalDate dataInicioTratamento;
    private ClassificacaoFinalMalaria classificacaoFinal;
    private String localProvavelInfeccao;
    private String municipioProvavelInfeccao;
    private String ufProvavelInfeccao;
    private String paisProvavelInfeccao;
    private Autoctone casoAutoctone;

    public Malaria(DadosComplementares dadosComplementares, DadosGerais dadosGerais, DadosResidencia dadosResidenciais,
                   NotificacaoIndividual notificacaoIndividual, String atividadeUltimos15Dias, Autoctone casoAutoctone,
                   ClassificacaoFinalMalaria classificacaoFinal, Sintomas comSintomas, LocalDate dataExame, LocalDate dataInicioTratamento,
                   LocalDate dataInvestigacao, LocalDate dataPrimeirosSintomas, String esquemaTratamento,
                   String localProvavelInfeccao, String municipioProvavelInfeccao, String paisProvavelInfeccao,
                   String parasitemiaCruzes, int parasitosPorMm3, String resultadoExame, String tipoLamina,
                   String ufProvavelInfeccao) {
        super(dadosComplementares, dadosGerais, dadosResidenciais, notificacaoIndividual);
        this.atividadeUltimos15Dias = atividadeUltimos15Dias;
        this.casoAutoctone = casoAutoctone;
        this.classificacaoFinal = classificacaoFinal;
        this.comSintomas = comSintomas;
        this.dataExame = dataExame;
        this.dataInicioTratamento = dataInicioTratamento;
        this.dataInvestigacao = dataInvestigacao;
        this.dataPrimeirosSintomas = dataPrimeirosSintomas;
        this.esquemaTratamento = esquemaTratamento;
        this.localProvavelInfeccao = localProvavelInfeccao;
        this.municipioProvavelInfeccao = municipioProvavelInfeccao;
        this.paisProvavelInfeccao = paisProvavelInfeccao;
        this.parasitemiaCruzes = parasitemiaCruzes;
        this.parasitosPorMm3 = parasitosPorMm3;
        this.resultadoExame = resultadoExame;
        this.tipoLamina = tipoLamina;
        this.ufProvavelInfeccao = ufProvavelInfeccao;
    }

    public Malaria() {

    }

    public LocalDate getDataPrimeirosSintomas() {
        return dataPrimeirosSintomas;
    }

    public void setDataPrimeirosSintomas(LocalDate dataPrimeirosSintomas) {
        this.dataPrimeirosSintomas = dataPrimeirosSintomas;
    }

    public LocalDate getDataInvestigacao() {
        return dataInvestigacao;
    }

    public void setDataInvestigacao(LocalDate dataInvestigacao) {
        this.dataInvestigacao = dataInvestigacao;
    }

    public String getAtividadeUltimos15Dias() {
        return atividadeUltimos15Dias;
    }

    public void setAtividadeUltimos15Dias(String atividadeUltimos15Dias) {
        this.atividadeUltimos15Dias = atividadeUltimos15Dias;
    }

    public String getTipoLamina() {
        return tipoLamina;
    }

    public void setTipoLamina(String tipoLamina) {
        this.tipoLamina = tipoLamina;
    }

    public Sintomas getComSintomas() {
        return comSintomas;
    }

    public void setComSintomas(Sintomas comSintomas) {
        this.comSintomas = comSintomas;
    }

    public LocalDate getDataExame() {
        return dataExame;
    }

    public void setDataExame(LocalDate dataExame) {
        this.dataExame = dataExame;
    }

    public String getResultadoExame() {
        return resultadoExame;
    }

    public void setResultadoExame(String resultadoExame) {
        this.resultadoExame = resultadoExame;
    }

    public int getParasitosPorMm3() {
        return parasitosPorMm3;
    }

    public void setParasitosPorMm3(int parasitosPorMm3) {
        this.parasitosPorMm3 = parasitosPorMm3;
    }

    public String getParasitemiaCruzes() {
        return parasitemiaCruzes;
    }

    public void setParasitemiaCruzes(String parasitemiaCruzes) {
        this.parasitemiaCruzes = parasitemiaCruzes;
    }

    public String getEsquemaTratamento() {
        return esquemaTratamento;
    }

    public void setEsquemaTratamento(String esquemaTratamento) {
        this.esquemaTratamento = esquemaTratamento;
    }

    public LocalDate getDataInicioTratamento() {
        return dataInicioTratamento;
    }

    public void setDataInicioTratamento(LocalDate dataInicioTratamento) {
        this.dataInicioTratamento = dataInicioTratamento;
    }

    public ClassificacaoFinalMalaria getClassificacaoFinal() {
        return classificacaoFinal;
    }

    public void setClassificacaoFinal(ClassificacaoFinalMalaria classificacaoFinal) {
        this.classificacaoFinal = classificacaoFinal;
    }

    public String getLocalProvavelInfeccao() {
        return localProvavelInfeccao;
    }

    public void setLocalProvavelInfeccao(String localProvavelInfeccao) {
        this.localProvavelInfeccao = localProvavelInfeccao;
    }

    public String getMunicipioProvavelInfeccao() {
        return municipioProvavelInfeccao;
    }

    public void setMunicipioProvavelInfeccao(String municipioProvavelInfeccao) {
        this.municipioProvavelInfeccao = municipioProvavelInfeccao;
    }

    public String getUfProvavelInfeccao() {
        return ufProvavelInfeccao;
    }

    public void setUfProvavelInfeccao(String ufProvavelInfeccao) {
        this.ufProvavelInfeccao = ufProvavelInfeccao;
    }

    public String getPaisProvavelInfeccao() {
        return paisProvavelInfeccao;
    }

    public void setPaisProvavelInfeccao(String paisProvavelInfeccao) {
        this.paisProvavelInfeccao = paisProvavelInfeccao;
    }

    public Autoctone isCasoAutoctone() {
        return casoAutoctone;
    }

    public void setCasoAutoctone(Autoctone casoAutoctone) {
        this.casoAutoctone = casoAutoctone;
    }
}