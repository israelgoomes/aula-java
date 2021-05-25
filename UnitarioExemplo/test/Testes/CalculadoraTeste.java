/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import classes.Calculadora;
import junit.framework.TestCase;

/**
 *
 * @author Israel Gomes
 */
public class CalculadoraTeste extends TestCase{
    
    Calculadora calc = new Calculadora();
    
    public void testeSoma(){
        int vl1 = 5;
        int vl2 = 5;
        
        int vlEsperado = 10;
        
        int vlRecebido = calc.soma(vl1, vl2);
        
        assertEquals(vlEsperado, vlRecebido);
    }
    
    public void testeSubtracao(){
        int vl1 = 10;
        int vl2 = 5;
        
        int vlEsperado = 6;
        
        int vlRecebido = calc.subtracao(vl1, vl2);
        
        assertEquals(vlEsperado, vlRecebido);
    }
        
    public void testeMultiplicacao(){
        int vl1 = 5;
        int vl2 = 5;
        
        int vlEsperado = 25;
        
        int vlRecebido = calc.multiplicacao(vl1, vl2);
        
        assertEquals(vlEsperado, vlRecebido);
    }
            
    public void testeDivisao(){
        int vl1 = 5;
        int vl2 = 5;
        
        int vlEsperado = 2;
        
        int vlRecebido = calc.divisao(vl1, vl2);
        
        assertEquals(vlEsperado, vlRecebido);
    }
    
}
