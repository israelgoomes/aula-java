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
public class Animal {
    
    private String raca;
    private String cor;
    private String nome;

    public Animal() {
    }

    public Animal(String raca, String cor, String nome) {
        this.raca = raca;
        this.cor = cor;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal{" + "raca=" + raca + ", cor=" + cor + ", nome=" + nome + '}';
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
