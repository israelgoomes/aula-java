/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsexample;

/**
 *
 * @author Israel Gomes
 */
public class Pessoa {
    
    private String nome;
    private int anoNascimento;
    private float altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int anoNascimento, float altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }
    
    
    
    public String exibeDados(){
        return "Nome: " + this.nome + "\nAno Nascimento: " + this.anoNascimento + "\nALtura: " + this.altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
