/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_filhas;

import classes_pais.Veiculo;

/**
 *
 * @author Israel Gomes
 */
public class Moto extends Veiculo {
        
    private int qtdCilindradas;
    private int qtdMarchas;

    public Moto() {
    }

    public Moto(int qtdCilindradas, int qtdMarchas, String marca, String modelo, String cor) {
        super(marca, modelo, cor);
        this.qtdCilindradas = qtdCilindradas;
        this.qtdMarchas = qtdMarchas;
    }

    @Override
    public String toString() {
        return "Moto{" + "qtdCilindradas=" + qtdCilindradas + ", qtdMarchas=" + qtdMarchas + '}';
    }
    
    @Override
    public String acelerar(){
        return "Acelerando Moto...";
    }
    
    @Override
    public String frear(){
        return "Freando Moto...";
    }
    
    @Override
    public String parar(){
        return "Parando Moto...";
    }
    
    public int getQtdCilindradas() {
        return qtdCilindradas;
    }

    public void setQtdCilindradas(int qtdCilindradas) {
        this.qtdCilindradas = qtdCilindradas;
    }

    public int getQtdMarchas() {
        return qtdMarchas;
    }

    public void setQtdMarchas(int qtdMarchas) {
        this.qtdMarchas = qtdMarchas;
    }
    
    
    
    
}
