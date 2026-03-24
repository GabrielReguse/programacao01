/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gabriel;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Turma {
    private String nome;
    private int anoIngresso;
    private String sala;
    
    // Sets
    private Estudante discentes = new Estudante();
    private Professor professores = new Professor();
    private Disciplina disciplinas = new Disciplina();
    
    // Sets
    private Set<Estudante> _discentes = new HashSet<Estudante>();
    private Set<Professor> _professores = new HashSet<Professor>();
    private Set<Disciplina> disciplina = new HashSet<Disciplina>();
    
    
}
/* turma tem varias disciplina, disciplina tem um professor e professor tem varios alunos */