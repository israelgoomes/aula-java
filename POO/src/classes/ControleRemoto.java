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
public class ControleRemoto {
    int volumeMaximo = 10;
    int canalMaximo = 10;
    int volumeAtual = 5;
    int canalAtual = 5;
    
    
    public String aumentarVolume(){
        
        if(volumeAtual == volumeMaximo){
            return "Volume máximo atingido, não é possível aumentar mais.";
        }
        
        volumeAtual ++;
        return "Aumentando o volume: " + volumeAtual;
    }
    
    public String diminuirVolume(){
        volumeAtual --;
        return "Diminuindo o volume: " + volumeAtual;
    }
    
    public String subirCanal(){
          if(canalAtual == canalMaximo){
            return "Canal máximo atingido, não é possível subir mais.";
        }
        
        canalAtual ++;
        return "Subindo Canal: " + canalAtual;
    }
    
    public String descerCanal(){
        canalAtual --;
        return "Descendo caanal: " + canalAtual;
    }
    
}
