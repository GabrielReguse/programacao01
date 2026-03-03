/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gabriel;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
    
    public Estudante(){
        nome = "Nobody";
    }
    
    public int obterIdade(Date hoje){
        int idade = 0;
        // lógica de calculo de idade
        return idade;
    }   
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String _nome){
        nome = _nome;
    }
    
    public Date getIdade(){
        return dataNascimento;
    }
    
    public void setIdade(Date _idade){
        dataNascimento = _idade;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String _cpf){
        cpf = _cpf;
    }
    
    public char genero(){
        return genero;
    }
    
    public void setGenero(char _genero){
        genero = _genero;
    }
    
    public String matricula(){
        return matricula;
    }
    
    public void setMatricula(String _matricula){
        matricula = _matricula;
    }
    
}