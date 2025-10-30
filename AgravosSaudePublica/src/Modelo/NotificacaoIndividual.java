package Modelo;

import Enums.Gestante;
import Enums.Sexo;
import Enums.RacaCor;
import Enums.Escolaridade;

import java.time.LocalDate;

public class NotificacaoIndividual {
    private String nomePaciente;
    private LocalDate dataNotificacao;
    private LocalDate dataNascimento;
    private int idade;
    private Sexo sexo; // enum
    private Gestante gestante; //enum
    private String idadeGestacional; // "1º Trimestre", "2º Trimestre", etc.
    private RacaCor racaCor; // Branca, Parda, Preta, etc.
    private Escolaridade escolaridade;

    public NotificacaoIndividual(String nomePaciente, LocalDate dataNascimento, LocalDate dataNotificacao, Escolaridade escolaridade,
                                 Gestante gestante, int idade, String idadeGestacional, RacaCor racaCor, Sexo sexo) {

        this.nomePaciente = nomePaciente;
        this.dataNascimento = dataNascimento;
        this.dataNotificacao = dataNotificacao;
        this.escolaridade = escolaridade;
        this.gestante = gestante;
        this.idade = idade;
        this.idadeGestacional = idadeGestacional;
        this.racaCor = racaCor;
        this.sexo = sexo;
    }

    public NotificacaoIndividual() {

    }

    // Getters e Setters


    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public LocalDate getDataNotificacao() {
        return dataNotificacao;
    }

    public void setDataNotificacao(LocalDate dataNotificacao) {
        this.dataNotificacao = dataNotificacao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Gestante getGestante() {
        return gestante;
    }

    public void setSexo(Gestante gestante) {
        this.gestante = gestante;
    }

    public String getIdadeGestacional() {
        return idadeGestacional;
    }

    public void setIdadeGestacional(String idadeGestacional) {
        this.idadeGestacional = idadeGestacional;
    }

    public RacaCor getRacaCor() {
        return racaCor;
    }

    public void setRacaCor(RacaCor racaCor) {
        this.racaCor = racaCor;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }
}