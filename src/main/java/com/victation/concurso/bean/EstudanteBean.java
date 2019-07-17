package com.victation.concurso.bean;


import com.victation.concurso.model.Estudante;

public class EstudanteBean {

    public EstudanteBean(Estudante estudante) {
        this.estudante = new Estudante();
    }

    private Estudante estudante;

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
