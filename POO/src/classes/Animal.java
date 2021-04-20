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
public class Animal {
//    No método “andar()” verifique se a variável “temPata” é verdadeiro, caso seja retorne “Andando”, 
//    caso não verifique se é falso e se “peixe é verdadeiro”, caso a instrução seja verdadeira retorne “Nadando” caso não “Rastejando”

    String nome;
    boolean temPata;
    boolean peixe;
    int qtdPatas;
    String cor;
    String raca;
    String machoFemea;
    
    
    public Animal(){}
    
    public Animal(String nome, boolean temPata, boolean peixe, int qtdPatas, String cor, String raca, String machoFemea){
        this.nome = nome;
        this.temPata = temPata;
        this.peixe = peixe;
        this.qtdPatas = qtdPatas;
        this.cor = cor;
        this.raca = raca;
        this.machoFemea = machoFemea;
    }
    
    
    //    No método “andar()” verifique se a variável “temPata” é verdadeiro, caso seja retorne “Andando”, 
//    caso não verifique se é falso e se “peixe é verdadeiro”, caso a instrução seja verdadeira retorne “Nadando” caso não “Rastejando”
    public String andar(){
        if(this.temPata == true){
            return "Andando";
        }else if (this.peixe == true){
            return "Nadando";
        }else {
            return "Rastejando";
        }
    }
    
//    No método “correr()” faça a mesma verificação, e retorne “Correndo”, “Rastejando rápido” ou “Nadando rápido”.
    public String correr(){
        if(this.temPata == true){
            return "Correndo";
        }else if (this.peixe == true){
            return "Nadando rápido";
        }else {
            return "Rastejando rápido";
        }
    }
    
    public String descansar(){
        return "Descansando"; 
    }
    
    
}
