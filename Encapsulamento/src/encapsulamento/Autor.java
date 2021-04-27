/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author Israel Gomes
 */
public class Autor {
    
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private int idade;
    
    public Autor(){}
    
    public Autor(String nome, String endereco, String telefone, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
    public String imprimeDados(){
        return "Nome: " + this.nome + "\nEndereço: " + this.endereco + "\nTelefone: "  
                + this.telefone + "\nE-mail: " + this.email; 
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
}
