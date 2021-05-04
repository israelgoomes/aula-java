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
public class Carro extends Veiculo {
    private int qtdPortas;
    private boolean conversivel;
    private int qtdCavalos;
    private int qtdMarchas;

    public Carro() {
    }

    public Carro(int qtdPortas, boolean conversivel, int qtdCavalos, int qtdMarchas, String marca, String modelo, String cor) {
        super(marca, modelo, cor);
        this.qtdPortas = qtdPortas;
        this.conversivel = conversivel;
        this.qtdCavalos = qtdCavalos;
        this.qtdMarchas = qtdMarchas;
    }

    @Override
    public String toString() {
        return "Carro{" + "qtdPortas=" + qtdPortas + ", conversivel=" + conversivel + ", qtdCavalos=" + qtdCavalos + ", qtdMarchas=" + qtdMarchas + '}';
    }
    
    
    @Override
    public String acelerar(){
        return "Acelerando Carro...";
    }
    
    @Override
    public String frear(){
        return "Freando Carro...";
    }
    
    @Override
    public String parar(){
        return "Parando Carro...";
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public boolean isConversivel() {
        return conversivel;
    }

    public void setConversivel(boolean conversivel) {
        this.conversivel = conversivel;
    }

    public int getQtdCavalos() {
        return qtdCavalos;
    }

    public void setQtdCavalos(int qtdCavalos) {
        this.qtdCavalos = qtdCavalos;
    }

    public int getQtdMarchas() {
        return qtdMarchas;
    }

    public void setQtdMarchas(int qtdMarchas) {
        this.qtdMarchas = qtdMarchas;
    }

    

}
