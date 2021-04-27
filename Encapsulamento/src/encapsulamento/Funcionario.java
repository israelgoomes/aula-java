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
public class Funcionario {
    
    private String nome;
    private int AnoNascimento;
    private int cpf;
    private String endereco;
    private float salario;
    
    public String imprimeDados(){
        return "Nome: " + this.nome + "\nAno Nascimento: " + this.AnoNascimento + "\nCPF: "  
                + this.cpf + "\nEndereço: " + this.endereco  + "\nSalário: " + this.salario; 
    }
    
    public void aumentaSalario(float aumento){
        this.salario = (this.salario / 100) * aumento + this.salario;
    }
    
    public String exibeSalario(){
        return "Salário: " + this.salario;
    }
    
}
