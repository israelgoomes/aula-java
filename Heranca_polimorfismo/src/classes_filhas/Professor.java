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
public class Professor extends Pessoa {

    private double salario;
    private String disciplina;

    public Professor() {
    }

    public Professor(double salario, String disciplina, String nome, String cpf, String sexo, int idade) {
        super(nome, cpf, sexo, idade);
        this.salario = salario;
        this.disciplina = disciplina;
    }
    
    public String darAula(){
        return "Dando aula...";
    }
    
    public String corrigirProva(){
        return "Corrigindo Prova...";
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    
    
}
