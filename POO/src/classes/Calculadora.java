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
public class Calculadora {
    double resultado;
    
    public String calc(int vl1, int vl2, String op){
        
        try{
            
            switch(op){
                case "/":
                    this.resultado = (vl1/vl2);
                    return "Resultado: " + this.resultado;
                case "*":
                    this.resultado = (vl1*vl2);
                    return "Resultado: " + this.resultado;
                case "+":
                    this.resultado = (vl1+vl2);
                    return "Resultado: " + this.resultado;
                case "-":
                    this.resultado = (vl1-vl2);
                    return "Resultado: " + this.resultado;
                default:
                    return "Nenhuma das opções";
            }
            
        }catch(ArithmeticException e){
            return "Não é possível dividir por zero";
        }
        
    }
}
