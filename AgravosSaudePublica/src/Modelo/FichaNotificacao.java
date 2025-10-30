package Modelo;

public abstract class FichaNotificacao {
    protected DadosGerais dadosGerais;
    protected NotificacaoIndividual notificacaoIndividual;
    protected DadosResidencia dadosResidenciais;
    protected DadosComplementares dadosComplementares;

    public FichaNotificacao(DadosComplementares dadosComplementares,
                            DadosGerais dadosGerais, DadosResidencia dadosResidenciais,
                            NotificacaoIndividual notificacaoIndividual) {

        this.dadosComplementares = dadosComplementares;
        this.dadosGerais = dadosGerais;
        this.dadosResidenciais = dadosResidenciais;
        this.notificacaoIndividual = notificacaoIndividual;
    }

    public FichaNotificacao() {

    }

    // Getters e Setters
    public DadosGerais getDadosGerais() {
        return dadosGerais;
    }

    public void setDadosGerais(DadosGerais dadosGerais) {
        this.dadosGerais = dadosGerais;
    }

    public NotificacaoIndividual getNotificacaoIndividual() {
        return notificacaoIndividual;
    }

    public void setNotificacaoIndividual(NotificacaoIndividual notificacaoIndividual) {
        this.notificacaoIndividual = notificacaoIndividual;
    }

    public DadosResidencia getDadosResidenciais() {
        return dadosResidenciais;
    }

    public void setDadosResidenciais(DadosResidencia dadosResidenciais) {
        this.dadosResidenciais = dadosResidenciais;
    }

    public DadosComplementares getDadosComplementares() {
        return dadosComplementares;
    }

    public void setDadosComplementares(DadosComplementares dadosComplementares) {
        this.dadosComplementares = dadosComplementares;
    }
}