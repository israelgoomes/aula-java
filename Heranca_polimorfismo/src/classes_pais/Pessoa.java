/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_pais;

/**
 *
 * @author Israel Gomes
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    private String sexo;
    private int idade;

    public Pessoa(String nome, String cpf, String sexo, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
    }

    public Pessoa() {
    }

    public String comer(){
        return "Comendo...";
    }
    
    public String andar(){
        return "Andando...";
    }
     
    public String dormir(){
        return "Dormindo...";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
}
