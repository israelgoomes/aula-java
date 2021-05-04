/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_filhas;

import classes_pais.Animal;

/**
 *
 * @author Israel Gomes
 */
public class Cachorro extends Animal{
       
    private int qtdPatas;
    private boolean rabo;
    
    public Cachorro(){}
    
    public Cachorro(int qtdPatas, boolean rabo, String raca, String cor, String machoFemea){
        super(raca, cor, machoFemea);
        this.qtdPatas = qtdPatas;
        this.rabo = rabo;
    }
    
    public String latir(){
        return "Latindo...";
    }
    
    @Override
    public String comer(){
        return "Comendo ração";
    }

    @Override
    public String toString() {
        return "Cachorro{" + "qtdPatas=" + qtdPatas + ", rabo=" + rabo + '}';
    }
    
    
    
    public int getQtdPatas(){
        return this.qtdPatas;
    }
    
    public void setQtdPatas(int qtdPatas){
        this.qtdPatas = qtdPatas;
    }
    
    public boolean getRabo(){
        return this.rabo;
    }
    
    public void setRabo(boolean rabo){
        this.rabo = rabo;
    }
    
    
}
