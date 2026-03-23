/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gabriel;

/**
 *
 * @author aluno
 */
public class Disciplina {
    private String codigo;
    private String nome;
    private String cargaHoraria;
    private String ementa;
    private String objetivo;
    
    //extras
    private String objetivoApredizagem;
    private String conteudoProgramatico;
    private String referenciasBibliograficas;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String _nome) {
        nome = _nome;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String _codigo) {
        codigo = _codigo;
    }
    
    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String _cargaHoraria) {
        cargaHoraria = _cargaHoraria;
    }
    
    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String _ementa) {
        ementa = _ementa;
    }
    
    public String getObjetivo() {
        return objetivo;
    }

    public void setOjetivo(String _ojetivo) {
        objetivo = _ojetivo;
    }
    
    public String getObjetivoApredizagem() {
        return objetivoApredizagem;
    }

    public void setObjetivoApredizagem(String _objetivoApredizagem) {
        objetivoApredizagem = _objetivoApredizagem;
    }
    
    public String getConteudoProgramatico() {
        return conteudoProgramatico;
    }

    public void setConteudoProgramatico(String _conteudoProgramatico) {
        conteudoProgramatico = _conteudoProgramatico;
    }
    
    public String getReferenciasBibliograficas() {
        return referenciasBibliograficas;
    }

    public void setReferenciasBibliograficas(String _referenciasBibliograficas) {
        referenciasBibliograficas = _referenciasBibliograficas;
    }
    
}
