package Modelo;
import Enums.FormaTuberculose;
import Enums.Sexo;
import Enums.RacaCor;
import Enums.Escolaridade;

import java.time.LocalDate;

public class Tuberculose extends FichaNotificacao {
    private String tipoEntrada;
    private FormaTuberculose forma;
    private String formaExtrapulmonar;
    private boolean hiv;
    private boolean aids;
    private boolean alcoolismo;
    private boolean diabetes;
    private boolean doencaMental;
    private boolean usoDrogas;
    private boolean tabagismo;
    private boolean terapiaAntirretroviral;
    private String baciloscopiaEscarro;
    private String radiografiaTorax;
    private String histopatologia;
    private String cultura;
    private String testeSensibilidade;
    private String testeMolecularRapido;
    private LocalDate dataInicioTratamento;
    private int totalContatosIdentificados;

    public Tuberculose(boolean aids, boolean alcoolismo, String baciloscopiaEscarro, String cultura,
                       LocalDate dataInicioTratamento, boolean diabetes, boolean doencaMental,
                       FormaTuberculose forma, String formaExtrapulmonar, String histopatologia, boolean hiv,
                       String radiografiaTorax, boolean tabagismo, boolean terapiaAntirretroviral,
                       String testeMolecularRapido, String testeSensibilidade, String tipoEntrada,
                       int totalContatosIdentificados, boolean usoDrogas) {
        this.aids = aids;
        this.alcoolismo = alcoolismo;
        this.baciloscopiaEscarro = baciloscopiaEscarro;
        this.cultura = cultura;
        this.dataInicioTratamento = dataInicioTratamento;
        this.diabetes = diabetes;
        this.doencaMental = doencaMental;
        this.forma = forma;
        this.formaExtrapulmonar = formaExtrapulmonar;
        this.histopatologia = histopatologia;
        this.hiv = hiv;
        this.radiografiaTorax = radiografiaTorax;
        this.tabagismo = tabagismo;
        this.terapiaAntirretroviral = terapiaAntirretroviral;
        this.testeMolecularRapido = testeMolecularRapido;
        this.testeSensibilidade = testeSensibilidade;
        this.tipoEntrada = tipoEntrada;
        this.totalContatosIdentificados = totalContatosIdentificados;
        this.usoDrogas = usoDrogas;
    }

    public Tuberculose() {

    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public FormaTuberculose getForma() {
        return forma;
    }

    public void setForma(FormaTuberculose forma) {
        this.forma = forma;
    }

    public String getFormaExtrapulmonar() {
        return formaExtrapulmonar;
    }

    public void setFormaExtrapulmonar(String formaExtrapulmonar) {
        this.formaExtrapulmonar = formaExtrapulmonar;
    }

    public boolean isHiv() {
        return hiv;
    }

    public void setHiv(boolean hiv) {
        this.hiv = hiv;
    }

    public boolean isAids() {
        return aids;
    }

    public void setAids(boolean aids) {
        this.aids = aids;
    }

    public boolean isAlcoolismo() {
        return alcoolismo;
    }

    public void setAlcoolismo(boolean alcoolismo) {
        this.alcoolismo = alcoolismo;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isDoencaMental() {
        return doencaMental;
    }

    public void setDoencaMental(boolean doencaMental) {
        this.doencaMental = doencaMental;
    }

    public boolean isUsoDrogas() {
        return usoDrogas;
    }

    public void setUsoDrogas(boolean usoDrogas) {
        this.usoDrogas = usoDrogas;
    }

    public boolean isTabagismo() {
        return tabagismo;
    }

    public void setTabagismo(boolean tabagismo) {
        this.tabagismo = tabagismo;
    }

    public boolean isTerapiaAntirretroviral() {
        return terapiaAntirretroviral;
    }

    public void setTerapiaAntirretroviral(boolean terapiaAntirretroviral) {
        this.terapiaAntirretroviral = terapiaAntirretroviral;
    }

    public String getBaciloscopiaEscarro() {
        return baciloscopiaEscarro;
    }

    public void setBaciloscopiaEscarro(String baciloscopiaEscarro) {
        this.baciloscopiaEscarro = baciloscopiaEscarro;
    }

    public String getRadiografiaTorax() {
        return radiografiaTorax;
    }

    public void setRadiografiaTorax(String radiografiaTorax) {
        this.radiografiaTorax = radiografiaTorax;
    }

    public String getHistopatologia() {
        return histopatologia;
    }

    public void setHistopatologia(String histopatologia) {
        this.histopatologia = histopatologia;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    public String getTesteSensibilidade() {
        return testeSensibilidade;
    }

    public void setTesteSensibilidade(String testeSensibilidade) {
        this.testeSensibilidade = testeSensibilidade;
    }

    public String getTesteMolecularRapido() {
        return testeMolecularRapido;
    }

    public void setTesteMolecularRapido(String testeMolecularRapido) {
        this.testeMolecularRapido = testeMolecularRapido;
    }

    public LocalDate getDataInicioTratamento() {
        return dataInicioTratamento;
    }

    public void setDataInicioTratamento(LocalDate dataInicioTratamento) {
        this.dataInicioTratamento = dataInicioTratamento;
    }

    public int getTotalContatosIdentificados() {
        return totalContatosIdentificados;
    }

    public void setTotalContatosIdentificados(int totalContatosIdentificados) {
        this.totalContatosIdentificados = totalContatosIdentificados;
    }
}