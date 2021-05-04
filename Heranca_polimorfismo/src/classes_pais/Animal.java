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
public class Animal {
    
    private String raca;
    private String cor;
    private String machoFemea;
    
    public Animal(){}
    
    public Animal(String raca, String cor, String machoFemea){
        this.raca = raca;
        this.cor = cor;
        this.machoFemea = machoFemea;
    }

    public String exibeDados() {
        return "Animal{" + "raca=" + raca + ", cor=" + cor + ", machoFemea=" + machoFemea + '}';
    }
    
    
    
    public String comer(){
        return "Comendo...";
    }
    
    public String dormir(){
        return "Dormindo...";
    }
    
    public String getRaca(){
        return this.raca;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }

       public String getCor(){
        return this.cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getMachoFemea(){
        return this.machoFemea;
    }
    
    public void setMachoFemea(String machoFemea){
        this.machoFemea = machoFemea;
    }
}
