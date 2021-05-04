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
public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;
    private String dtAdmissao;

    public Funcionario(double salario, String cargo, String dtAdmissao, String nome, String cpf, String sexo, int idade) {
        super(nome, cpf, sexo, idade);
        this.salario = salario;
        this.cargo = cargo;
        this.dtAdmissao = dtAdmissao;
    }

    public Funcionario() {
    }
    
    public String trabalhar(){
        return "Trabalhando...";
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(String dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    
    
}
