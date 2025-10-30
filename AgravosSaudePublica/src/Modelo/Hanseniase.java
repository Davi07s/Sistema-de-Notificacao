package Modelo;

import Enums.*;

import java.time.LocalDate;

public class Hanseniase extends FichaNotificacao {
    private int numeroLesoesCutaneas;
    private int numeroNervosAfetados;
    private String classificacaoOperacional;
    private FormaClinicaHanseniase formaClinica;
    private int grauIncapacidadeFisica;
    private String modoEntrada;
    private String modoDeteccao;
    private Baciloscopia baciloscopia;
    private EsquemaTerapeuticoHanseniase esquemaTerapeutico;
    private LocalDate dataInicioTratamento;
    private int numeroContatosRegistrados;

    public Hanseniase(Baciloscopia baciloscopia, String classificacaoOperacional, LocalDate dataInicioTratamento, EsquemaTerapeuticoHanseniase esquemaTerapeutico,
                      FormaClinicaHanseniase formaClinica, int grauIncapacidadeFisica, String modoDeteccao,
                      String modoEntrada, int numeroContatosRegistrados, int numeroLesoesCutaneas,
                      int numeroNervosAfetados) {
        this.baciloscopia = baciloscopia;
        this.classificacaoOperacional = classificacaoOperacional;
        this.dataInicioTratamento = dataInicioTratamento;
        this.esquemaTerapeutico = esquemaTerapeutico;
        this.formaClinica = formaClinica;
        this.grauIncapacidadeFisica = grauIncapacidadeFisica;
        this.modoDeteccao = modoDeteccao;
        this.modoEntrada = modoEntrada;
        this.numeroContatosRegistrados = numeroContatosRegistrados;
        this.numeroLesoesCutaneas = numeroLesoesCutaneas;
        this.numeroNervosAfetados = numeroNervosAfetados;
    }

    public Hanseniase() {
        super();
    }

    public int getNumeroLesoesCutaneas() {
        return numeroLesoesCutaneas;
    }

    public void setNumeroLesoesCutaneas(int numeroLesoesCutaneas) {
        this.numeroLesoesCutaneas = numeroLesoesCutaneas;
    }

    public int getNumeroNervosAfetados() {
        return numeroNervosAfetados;
    }

    public void setNumeroNervosAfetados(int numeroNervosAfetados) {
        this.numeroNervosAfetados = numeroNervosAfetados;
    }

    public String getClassificacaoOperacional() {
        return classificacaoOperacional;
    }

    public void setClassificacaoOperacional(String classificacaoOperacional) {
        this.classificacaoOperacional = classificacaoOperacional;
    }

    public FormaClinicaHanseniase getFormaClinica() {
        return formaClinica;
    }

    public void setFormaClinica(FormaClinicaHanseniase formaClinica) {
        this.formaClinica = formaClinica;
    }

    public int getGrauIncapacidadeFisica() {
        return grauIncapacidadeFisica;
    }

    public void setGrauIncapacidadeFisica(int grauIncapacidadeFisica) {
        this.grauIncapacidadeFisica = grauIncapacidadeFisica;
    }

    public String getModoEntrada() {
        return modoEntrada;
    }

    public void setModoEntrada(String modoEntrada) {
        this.modoEntrada = modoEntrada;
    }

    public String getModoDeteccao() {
        return modoDeteccao;
    }

    public void setModoDeteccao(String modoDeteccao) {
        this.modoDeteccao = modoDeteccao;
    }

    public Baciloscopia getBaciloscopia() {
        return baciloscopia;
    }

    public void setBaciloscopia(Baciloscopia baciloscopia) {
        this.baciloscopia = baciloscopia;
    }

    public EsquemaTerapeuticoHanseniase getEsquemaTerapeutico() {
        return esquemaTerapeutico;
    }

    public void setEsquemaTerapeutico(EsquemaTerapeuticoHanseniase esquemaTerapeutico) {
        this.esquemaTerapeutico = esquemaTerapeutico;
    }

    public LocalDate getDataInicioTratamento() {
        return dataInicioTratamento;
    }

    public void setDataInicioTratamento(LocalDate dataInicioTratamento) {
        this.dataInicioTratamento = dataInicioTratamento;
    }

    public int getNumeroContatosRegistrados() {
        return numeroContatosRegistrados;
    }

    public void setNumeroContatosRegistrados(int numeroContatosRegistrados) {
        this.numeroContatosRegistrados = numeroContatosRegistrados;
    }
}