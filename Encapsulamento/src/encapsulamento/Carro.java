/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author Israel Gomes
 */
public class Carro {
    
    public String cor;
    public String marca;
    public String modelo;
    
    
   public String estacionar(){
        return "Estacionando...";
    }
    
   public String frear(){
        return "Freando";
    }
    
}
