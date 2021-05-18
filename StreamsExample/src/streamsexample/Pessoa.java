/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamsexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Israel Gomes
 */
public class Pessoa {
        private String nome;
        private int idade;
        private String sexo;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void filtro(List<Pessoa> pessoas, String tpFiltro, String nome){
        
        if(tpFiltro.equals("nome")){
            pessoas.stream().filter(pessoa -> pessoa.getNome().equals(nome))
            .forEach(p -> {
                System.out.println(p.toString());
            });
        }else if (tpFiltro.equals("idade")){
            pessoas.stream().filter(pessoa -> pessoa.getIdade() > 18).forEach(p ->{
                System.out.println(p.toString());
            });
        }
    }
    
    public List<String> retornaNome(List<Pessoa> pessoas){
        
        ArrayList<String> auxiliar = new ArrayList<>();
        pessoas.stream().map(pessoa -> pessoa.getNome()).forEach(p -> {
               auxiliar.add(p);
        });
        
        Collections.sort(auxiliar);
        return auxiliar;
    }
    
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idaade=" + idade + ", sexo=" + sexo + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
        
        
}
