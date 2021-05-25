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
public class Aluno extends Pessoa{
    
    private String ra;
    private String matricula;
    private int semestre;

    public Aluno(String ra, String matricula, int semestre, String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.ra = ra;
        this.matricula = matricula;
        this.semestre = semestre;
    }

    public Aluno() {
    }

    public String estudar(){
        return "Estudando...";
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
