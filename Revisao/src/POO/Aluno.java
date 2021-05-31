/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author Israel Gomes
 */
public class Aluno extends Pessoa{
    
    private String matricula;

    public Aluno(String matricula, String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.matricula = matricula;
    }

    public Aluno() {
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + '}';
    }
    
    
    @Override
    public String comer(){
        return "Comendo";
    }
    
    @Override
    public String andar(){
        return "Andando...";
    }
      
    @Override
    public String dormir(){
        return "Dormindo...";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
