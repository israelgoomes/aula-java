/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classemath;

/**
 *
 * @author Israel Gomes
 */
public class Notas {
    
    private double media;
    
    public void calculaMedia(float nota1, float nota2, float nota3, float nota4){
        this.media = (nota1 + nota2 + nota3 + nota4) / 4;
    }
    
    public String exibeMedia(){
        
        System.out.println("Média antes: " + this.media);
        if(this.media > 7){
            return "Média: " + Math.round(this.media);
        }else if(this.media > 5 && this.media < 7){
            return "Média: " + Math.floor(this.media);
        }else if(this.media < 5){
            return "Média: " + Math.ceil(this.media);
        }else{
            return "Média: " + this.media;
        }    
    }
    
}
