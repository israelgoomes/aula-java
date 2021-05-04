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
public class Produto {
    private String nome;
    private float preco;

    public Produto() {
    }

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public boolean validaPreco(){
        return this.preco > 200;
//        if(this.preco > 200){
//            return true;
//        }else{
//            return false;
//        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
