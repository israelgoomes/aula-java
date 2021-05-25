/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import classes.Calculo;
import junit.framework.TestCase;

/**
 *
 * @author Israel Gomes
 */
public class CalcTeste extends TestCase{
    
    public void testeSoma(){
      int valor1 = 10;
      int valor2 = 5;
      
      int vlEsperado = 15;
      
      int vlRecebido = Calculo.calcula(valor1, valor2);
      
      assertEquals(vlEsperado, vlRecebido);
        
    }
    
}
