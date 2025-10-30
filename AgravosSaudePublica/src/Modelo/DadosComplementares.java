package Modelo;

import Enums.Sexo;
import Enums.RacaCor;
import Enums.Escolaridade;

public class DadosComplementares {
    private String numeroProntuario;
    private String ocupacao;
    private boolean populacaoSituacaoRua;
    private boolean populacaoPrivadaLiberdade;
    private boolean profissionalSaude;
    private boolean beneficiarioProgramaRenda;
    private boolean imigrante;

    public DadosComplementares(boolean beneficiarioProgramaRenda, boolean imigrante, String numeroProntuario,
                               String ocupacao, boolean populacaoPrivadaLiberdade, boolean populacaoSituacaoRua,
                               boolean profissionalSaude) {
        this.beneficiarioProgramaRenda = beneficiarioProgramaRenda;
        this.imigrante = imigrante;
        this.numeroProntuario = numeroProntuario;
        this.ocupacao = ocupacao;
        this.populacaoPrivadaLiberdade = populacaoPrivadaLiberdade;
        this.populacaoSituacaoRua = populacaoSituacaoRua;
        this.profissionalSaude = profissionalSaude;
    }

    public DadosComplementares() {

    }

    // Getters e Setters
    public String getNumeroProntuario() {
        return numeroProntuario;
    }

    public void setNumeroProntuario(String numeroProntuario) {
        this.numeroProntuario = numeroProntuario;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public boolean isPopulacaoSituacaoRua() {
        return populacaoSituacaoRua;
    }

    public void setPopulacaoSituacaoRua(boolean populacaoSituacaoRua) {
        this.populacaoSituacaoRua = populacaoSituacaoRua;
    }

    public boolean isPopulacaoPrivadaLiberdade() {
        return populacaoPrivadaLiberdade;
    }

    public void setPopulacaoPrivadaLiberdade(boolean populacaoPrivadaLiberdade) {
        this.populacaoPrivadaLiberdade = populacaoPrivadaLiberdade;
    }

    public boolean isProfissionalSaude() {
        return profissionalSaude;
    }

    public void setProfissionalSaude(boolean profissionalSaude) {
        this.profissionalSaude = profissionalSaude;
    }

    public boolean isBeneficiarioProgramaRenda() {
        return beneficiarioProgramaRenda;
    }

    public void setBeneficiarioProgramaRenda(boolean beneficiarioProgramaRenda) {
        this.beneficiarioProgramaRenda = beneficiarioProgramaRenda;
    }

    public boolean isImigrante() {
        return imigrante;
    }

    public void setImigrante(boolean imigrante) {
        this.imigrante = imigrante;
    }
}