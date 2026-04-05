package com.mycompany.gabriel;

public class CursoPos extends Curso {

    private String tipoPos;
    private String areaPesquisa;

    public CursoPos() {}

    public void validarDissertacaoOuTese() {
        if (tipoPos.equals("stricto sensu")) {
            System.out.println("Validando tese para o curso: " + getNome());
        } else {
            System.out.println("Validando dissertacao para o curso: " + getNome());
        }
    }

    public String getTipoPos() {
        return tipoPos;
    }

    public void setTipoPos(String _tipoPos) {
        tipoPos = _tipoPos;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(String _areaPesquisa) {
        areaPesquisa = _areaPesquisa;
    }
}
