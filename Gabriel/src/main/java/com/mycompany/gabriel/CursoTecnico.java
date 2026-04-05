package com.mycompany.gabriel;

public class CursoTecnico extends Curso {

    private String eixoTecnologico;
    private int cargaHorariaEstagio;

    public CursoTecnico() {}

    public boolean verificarEstagioObrigatorio() {
        return cargaHorariaEstagio > 0;
    }

    public String getEixoTecnologico() {
        return eixoTecnologico;
    }

    public void setEixoTecnologico(String _eixoTecnologico) {
        eixoTecnologico = _eixoTecnologico;
    }

    public int getCargaHorariaEstagio() {
        return cargaHorariaEstagio;
    }

    public void setCargaHorariaEstagio(int _cargaHorariaEstagio) {
        cargaHorariaEstagio = _cargaHorariaEstagio;
    }
}
