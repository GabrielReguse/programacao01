/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ibirama.sistema.ifc;

/**
 *
 * @author aluno
 */
public class programacao01 {

    public static void main(String[] args) {
        Estudante gabriel = new Estudante();
        Estudante gregori = new Estudante();
        Estudante rafael = new Estudante();

        gabriel.setNome("Gabriel");
        gregori.setNome("Grégori");
        rafael.setNome("Rafael");
        
        System.out.println(gabriel.getNome());
        System.out.println(gregori.getNome());
        System.out.println(rafael.getNome());
    }
}
