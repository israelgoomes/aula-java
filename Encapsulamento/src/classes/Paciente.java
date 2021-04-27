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
public class Paciente {
    
    private String nome;
    private int rg;
    private String endereco;
    private String telefone;
    private String dtNascimento;
    private String profissao;
    
    public Paciente(){}
    
    public Paciente(String nome,
    int rg,
    String endereco,
    String telefone,
    String dtNascimento,
    String profissao
    ){}
    
    public String adicionarConsulta(){
        return "Consulta Adicionada";
    }
    
    public String cadastrarPaciente(){
        return "Paciente cadastrado";
    }
    
    public String verificaPaciente(){
        return "Nome: " + this.nome + "\nEndereco: " + this.endereco + "\nTelefone: "  
                + this.telefone + "\nDt. Nascimento: " + this.dtNascimento  + "\nProfissão: " + this.profissao; 
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getRg(){
        return this.rg;
    }
    
    public void setRg(int rg){
        this.rg = rg;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
       public String getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
       public String getDtNascimento(){
        return this.dtNascimento;
    }
    
    public void setDtNascimento(String dtNascimento){
        this.dtNascimento = dtNascimento;
    }
    
       public String getProfissao(){
        return this.profissao;
    }
    
    public void setProfissao(String profissao){
        this.profissao = profissao;
    }
}
