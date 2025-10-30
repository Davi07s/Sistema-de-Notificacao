package Modelo;

import Enums.Sexo;
import Enums.RacaCor;
import Enums.Escolaridade;

import java.time.LocalDate;

public class DadosGerais {
    private String tipoNotificacao;
    private String agravoDoenca;
    private String codigoCID10;
    private LocalDate dataNotificacao;
    private LocalDate dataDiagnostico;
    private String unidadeSaude;
    private String codigoUnidadeSaude;
    private String ufNotificacao;
    private String municipioNotificacao;
    private String codigoIBGE;
    private String numeroProntuario;
    private String formaEntrada;
    private String modoDeteccao;

    public DadosGerais(String agravoDoenca, String codigoCID10, String codigoIBGE,
                       String codigoUnidadeSaude, LocalDate dataDiagnostico, LocalDate dataNotificacao,
                       String formaEntrada, String modoDeteccao, String municipioNotificacao,
                       String numeroProntuario, String tipoNotificacao, String ufNotificacao, String unidadeSaude) {
        this.agravoDoenca = agravoDoenca;
        this.codigoCID10 = codigoCID10;
        this.codigoIBGE = codigoIBGE;
        this.codigoUnidadeSaude = codigoUnidadeSaude;
        this.dataDiagnostico = dataDiagnostico;
        this.dataNotificacao = dataNotificacao;
        this.formaEntrada = formaEntrada;
        this.modoDeteccao = modoDeteccao;
        this.municipioNotificacao = municipioNotificacao;
        this.numeroProntuario = numeroProntuario;
        this.tipoNotificacao = tipoNotificacao;
        this.ufNotificacao = ufNotificacao;
        this.unidadeSaude = unidadeSaude;
    }

    public DadosGerais() {

    }

    // Getters e Setters
    public String getTipoNotificacao() {
        return tipoNotificacao;
    }

    public void setTipoNotificacao(String tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
    }

    public String getAgravoDoenca() {
        return agravoDoenca;
    }

    public void setAgravoDoenca(String agravoDoenca) {
        this.agravoDoenca = agravoDoenca;
    }

    public String getCodigoCID10() {
        return codigoCID10;
    }

    public void setCodigoCID10(String codigoCID10) {
        this.codigoCID10 = codigoCID10;
    }

    public LocalDate getDataNotificacao() {
        return dataNotificacao;
    }

    public void setDataNotificacao(LocalDate dataNotificacao) {
        this.dataNotificacao = dataNotificacao;
    }

    public LocalDate getDataDiagnostico() {
        return dataDiagnostico;
    }

    public void setDataDiagnostico(LocalDate dataDiagnostico) {
        this.dataDiagnostico = dataDiagnostico;
    }

    public String getUnidadeSaude() {
        return unidadeSaude;
    }

    public void setUnidadeSaude(String unidadeSaude) {
        this.unidadeSaude = unidadeSaude;
    }

    public String getCodigoUnidadeSaude() {
        return codigoUnidadeSaude;
    }

    public void setCodigoUnidadeSaude(String codigoUnidadeSaude) {
        this.codigoUnidadeSaude = codigoUnidadeSaude;
    }

    public String getUfNotificacao() {
        return ufNotificacao;
    }

    public void setUfNotificacao(String ufNotificacao) {
        this.ufNotificacao = ufNotificacao;
    }

    public String getMunicipioNotificacao() {
        return municipioNotificacao;
    }

    public void setMunicipioNotificacao(String municipioNotificacao) {
        this.municipioNotificacao = municipioNotificacao;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getNumeroProntuario() {
        return numeroProntuario;
    }

    public void setNumeroProntuario(String numeroProntuario) {
        this.numeroProntuario = numeroProntuario;
    }

    public String getFormaEntrada() {
        return formaEntrada;
    }

    public void setFormaEntrada(String formaEntrada) {
        this.formaEntrada = formaEntrada;
    }

    public String getModoDeteccao() {
        return modoDeteccao;
    }

    public void setModoDeteccao(String modoDeteccao) {
        this.modoDeteccao = modoDeteccao;
    }
}