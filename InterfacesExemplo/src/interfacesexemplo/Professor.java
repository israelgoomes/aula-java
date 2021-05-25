/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexemplo;

/**
 *
 * @author Israel Gomes
 */
public class Professor extends Pessoa{
    
    private double salario;
    private String disciplina;

    public Professor(double salario, String disciplina, String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public Professor() {
    }
    
    
    @Override
    public String comer(){
        return "Comendo...";
    }
    
    @Override
    public String andar(){
        return "Andando...";
    }
      
    @Override
    public String dormir(){
        return "Dormindo...";
    }
    
    public String darAula(){
        return "Aula LP1";
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
