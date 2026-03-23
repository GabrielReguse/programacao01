package com.mycompany.gabriel;

import java.util.Date;

public class Professor {

    //
    private String nome;
    private String email;
    private String area;
    private String regime;
    private String titulacao;
    private String formacao;
    private String telefone;
    private String siape;
    private Date dataIgresso;

    public String getNome() {
        return nome;
    }

    public void setNome(String _nome) {
        nome = _nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _Email) {
        email = _Email;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String _area) {
        area = _area;
    }

    public String geRegime() {
        return regime;
    }

    public void setRegime(String _regime) {
        regime = _regime;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String _titulacao) {
        titulacao = _titulacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String _formacao) {
        formacao = _formacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String _telefone) {
        telefone = _telefone;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String _siape) {
        siape = _siape;
    }

    public Date getDataIgresso() {
        return dataIgresso;
    }

    public void setDataIgresso(Date _dataIgresso) {
        dataIgresso = _dataIgresso;
    }
}
