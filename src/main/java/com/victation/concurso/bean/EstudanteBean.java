package com.victation.concurso.bean;


import com.victation.concurso.model.Estudante;

import javax.inject.Named;

@Named
public class EstudanteBean {

    public EstudanteBean()

    {
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
