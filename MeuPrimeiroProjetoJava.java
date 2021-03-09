/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprimeiroprojetojava;

/**
 *
 * @author Israel Gomes
 */
public class MeuPrimeiroProjetoJava {
    
      
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
//        Exercicio 1
        int a = 1;
        int b = 2;
                
        if( a < b ) 
            System.out.println(" A Menor que B");
            System.out.println(a); 
            System.out.println(b);
       
        if(a > b)  System.out.println(" A Maior que B");

// EXERCÍCIO 2


    float A = 1.75f;
    float B = 1.8f;
    float C = 3.5f;
    
    if((A+B) < C) System.out.println("A soma de A + B é menor que C");
     
    
  // EXERCÍCIO 3
    
    String nome = "Maria";
    String sexo = "F";
    String estadoCivil = "CASADA";
    
    if(sexo.equals("F") && estadoCivil.equals("CASADO")) System.out.println("Nome: " + nome + "\nSexo: " + sexo + "\nEstado civil: " + estadoCivil);
    
    
    // EXERCÍCIO 4   
    
      int imparPar = 8;
    
    if((imparPar % 2) == 0) System.out.println("Par");
    if((imparPar % 2) != 0) System.out.println("Impar");
    }
    

    
  
    
}
