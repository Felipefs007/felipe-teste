package com.aula12.conn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ong")
public class Ong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeOrg; 
    private String missaoOrg; 
    private String logradouroOrg; 
    private String bairroOrg; 
    private String cidadeOrg; 
    private String ufOrg; 
    private String complementoOrg; 
    private String cepOrg;
    private int numeroLogradouro;
    private String paisOrg;
    private String emailOrg;
    private String siteOrg;
    private String fundacaoOrg;
    private String areaAtuacao;
    private String ativaOrg;
    private String dataCadastro;
    private String eventosOng;
    private String causaSocial;

    public Ong() {

    }


    public Ong(Long id, String nomeOrg, String missaoOrg, String logradouroOrg, String bairroOrg, String cidadeOrg,
            String ufOrg, String complementoOrg, String cepOrg, int numeroLogradouro, String paisOrg, String emailOrg,
            String siteOrg, String fundacaoOrg, String areaAtuacao, String ativaOrg, String dataCadastro,
            String eventosOng, String causaSocial) {
        this.id = id;
        this.nomeOrg = nomeOrg;
        this.missaoOrg = missaoOrg;
        this.logradouroOrg = logradouroOrg;
        this.bairroOrg = bairroOrg;
        this.cidadeOrg = cidadeOrg;
        this.ufOrg = ufOrg;
        this.complementoOrg = complementoOrg;
        this.cepOrg = cepOrg;
        this.numeroLogradouro = numeroLogradouro;
        this.paisOrg = paisOrg;
        this.emailOrg = emailOrg;
        this.siteOrg = siteOrg;
        this.fundacaoOrg = fundacaoOrg;
        this.areaAtuacao = areaAtuacao;
        this.ativaOrg = ativaOrg;
        this.dataCadastro = dataCadastro;
        this.eventosOng = eventosOng;
        this.causaSocial = causaSocial;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomeOrg() {
        return nomeOrg;
    }
    public void setNomeOrg(String nomeOrg) {
        this.nomeOrg = nomeOrg;
    }
    public String getMissaoOrg() {
        return missaoOrg;
    }
    public void setMissaoOrg(String missaoOrg) {
        this.missaoOrg = missaoOrg;
    }
    public String getLogradouroOrg() {
        return logradouroOrg;
    }
    public void setLogradouroOrg(String logradouroOrg) {
        this.logradouroOrg = logradouroOrg;
    }
    public String getBairroOrg() {
        return bairroOrg;
    }
    public void setBairroOrg(String bairroOrg) {
        this.bairroOrg = bairroOrg;
    }
    public String getCidadeOrg() {
        return cidadeOrg;
    }
    public void setCidadeOrg(String cidadeOrg) {
        this.cidadeOrg = cidadeOrg;
    }
    public String getUfOrg() {
        return ufOrg;
    }
    public void setUfOrg(String ufOrg) {
        this.ufOrg = ufOrg;
    }
    public String getComplementoOrg() {
        return complementoOrg;
    }
    public void setComplementoOrg(String complementoOrg) {
        this.complementoOrg = complementoOrg;
    }
    public String getCepOrg() {
        return cepOrg;
    }
    public void setCepOrg(String cepOrg) {
        this.cepOrg = cepOrg;
    }
    public int getNumeroLogradouro() {
        return numeroLogradouro;
    }
    public void setNumeroLogradouro(int numeroLogradouro) {
        this.numeroLogradouro = numeroLogradouro;
    }
    public String getPaisOrg() {
        return paisOrg;
    }
    public void setPaisOrg(String paisOrg) {
        this.paisOrg = paisOrg;
    }
    public String getEmailOrg() {
        return emailOrg;
    }
    public void setEmailOrg(String emailOrg) {
        this.emailOrg = emailOrg;
    }
    public String getSiteOrg() {
        return siteOrg;
    }
    public void setSiteOrg(String siteOrg) {
        this.siteOrg = siteOrg;
    }
    public String getFundacaoOrg() {
        return fundacaoOrg;
    }
    public void setFundacaoOrg(String fundacaoOrg) {
        this.fundacaoOrg = fundacaoOrg;
    }
    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    public String getAtivaOrg() {
        return ativaOrg;
    }
    public void setAtivaOrg(String ativaOrg) {
        this.ativaOrg = ativaOrg;
    }
    public String getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public String getEventosOng() {
        return eventosOng;
    }
    public void setEventosOng(String eventosOng) {
        this.eventosOng = eventosOng;
    }
    public String getCausaSocial() {
        return causaSocial;
    }
    public void setCausaSocial(String causaSocial) {
        this.causaSocial = causaSocial;
    }

}
