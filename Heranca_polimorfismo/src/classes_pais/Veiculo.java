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
public class Veiculo {
    private String marca;
    private String modelo;
    private String cor;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }
    
    public String acelerar(){
        return "acelerando...";
    }
    
    public String frear(){
        return "Freando...";
    }
    
    public String parar(){
        return "Parando...";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
}
