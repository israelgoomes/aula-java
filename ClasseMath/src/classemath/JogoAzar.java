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
public class JogoAzar {
    
    public String jogar(int[] numeros){
        int count = 0;
        
        for(int n: numeros){
            double random = Math.random();
            int i = (int) (1 + random * (10 - 1));
            System.out.println("Aleatorio: " + i);
            System.out.println("Número digitado: " + n);
            if(i == n){
                count++;
            }
        }
        
        return "Quantidade de acertos: " + count;
    }
}
