/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Israel Gomes
 */
public class Pessoa {
    
    
    String nome;
    int anoNascimento;
    float altura;
    
    public Pessoa(){}
    
    public Pessoa(String nome, int anoNascimento, float altura){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }
    
    
    public String imprimeDados(){
        return "Nome: " + this.nome + "\n Ano nascimento: " + this.anoNascimento + "\n Altura" + this.altura;
    }
    
    public int calculaIdade(){
        return (2021 - this.anoNascimento);
    }
    
    
}
