/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_filhas;

import classes_pais.Pessoa;

/**
 *
 * @author Israel Gomes
 */
public class Aluno extends Pessoa {
    
    private String ra;
    private String matricula;
    private int semestre;

    public Aluno() {
    }

    public Aluno(String ra, String matricula, int semestre, String nome, String cpf, String sexo, int idade) {
        super(nome, cpf, sexo, idade);
        this.ra = ra;
        this.matricula = matricula;
        this.semestre = semestre;
    }
    
    public String estudar(){
        return "Estudando...";
    }
    
     public String fazerProva(){
        return "Fazendo prova...";
    }
    
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
}
