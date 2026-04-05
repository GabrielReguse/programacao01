package com.mycompany.gabriel;

public class CursoGraduacao extends Curso {

    private String tipoGraduacao;
    private boolean tccObrigatorio;

    public CursoGraduacao() {}

    public void validarTCC() {
        if (tccObrigatorio) {
            System.out.println("TCC obrigatorio para o curso: " + getNome());
        } else {
            System.out.println("TCC nao obrigatorio para o curso: " + getNome());
        }
    }

    public String getTipoGraduacao() {
        return tipoGraduacao;
    }

    public void setTipoGraduacao(String _tipoGraduacao) {
        tipoGraduacao = _tipoGraduacao;
    }

    public boolean getTccObrigatorio() {
        return tccObrigatorio;
    }

    public void setTccObrigatorio(boolean _tccObrigatorio) {
        tccObrigatorio = _tccObrigatorio;
    }
}
