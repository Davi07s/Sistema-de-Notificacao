package Modelo;

import Enums.Sexo;
import Enums.RacaCor;
import Enums.Escolaridade;
import Enums.ZonaResidencial;

    public class DadosResidencia {
        private String uf;
        private String municipio;
        private String codigoIBGE;
        private String distrito;
        private String bairro;
        private String logradouro;
        private String numero;
        private String complemento;
        private String cep;
        private String telefone;
        private ZonaResidencial zona; // Urbana, Rural, Periurbana, Ignorado
        private String pais; // Se residente fora do Brasil
        private String geoCampo1;
        private String geoCampo2;
        private String pontoReferencia;

        public DadosResidencia(String bairro, String cep, String codigoIBGE,
                               String complemento, String distrito, String geoCampo1,
                               String geoCampo2, String logradouro, String municipio, String numero,
                               String pais, String pontoReferencia, String telefone, String uf, ZonaResidencial zona) {
            this.bairro = bairro;
            this.cep = cep;
            this.codigoIBGE = codigoIBGE;
            this.complemento = complemento;
            this.distrito = distrito;
            this.geoCampo1 = geoCampo1;
            this.geoCampo2 = geoCampo2;
            this.logradouro = logradouro;
            this.municipio = municipio;
            this.numero = numero;
            this.pais = pais;
            this.pontoReferencia = pontoReferencia;
            this.telefone = telefone;
            this.uf = uf;
            this.zona = zona;
        }

        public DadosResidencia() {

        }

        // Getters e Setters
        public String getUf() {
            return uf;
        }

        public void setUf(String uf) {
            this.uf = uf;
        }

        public String getMunicipio() {
            return municipio;
        }

        public void setMunicipio(String municipio) {
            this.municipio = municipio;
        }

        public String getCodigoIBGE() {
            return codigoIBGE;
        }

        public void setCodigoIBGE(String codigoIBGE) {
            this.codigoIBGE = codigoIBGE;
        }

        public String getDistrito() {
            return distrito;
        }

        public void setDistrito(String distrito) {
            this.distrito = distrito;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public String getLogradouro() {
            return logradouro;
        }

        public void setLogradouro(String logradouro) {
            this.logradouro = logradouro;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getComplemento() {
            return complemento;
        }

        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public ZonaResidencial getZona() {
            return zona;
        }

        public void setZona(ZonaResidencial zona) {
            this.zona = zona;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }

        public String getGeoCampo1() {
            return geoCampo1;
        }

        public void setGeoCampo1(String geoCampo1) {
            this.geoCampo1 = geoCampo1;
        }

        public String getGeoCampo2() {
            return geoCampo2;
        }

        public void setGeoCampo2(String geoCampo2) {
            this.geoCampo2 = geoCampo2;
        }

        public String getPontoReferencia() {
            return pontoReferencia;
        }

        public void setPontoReferencia(String pontoReferencia) {
            this.pontoReferencia = pontoReferencia;
        }
    }

