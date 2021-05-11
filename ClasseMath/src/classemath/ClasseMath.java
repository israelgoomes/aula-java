/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classemath;

import java.util.Scanner;

/**
 *
 * @author Israel Gomes
 */
public class ClasseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        System.out.println(Math.PI);
//        System.out.println(Math.pow(2, 4));
//        System.out.println("Raiz Quadrada: " + Math.sqrt(25));
//        System.out.println("Número Maior: " + Math.max(10, 2));
//        System.out.println("Número menor: " + Math.min(10, 2));
//        System.out.println("Retorna positivo: " + Math.abs(-50));
//        System.out.println("Retorna o resto da divisao: " + Math.floorMod(10, 3));
        
//        Utils utils = new Utils();
//        
//        utils.setVlUm(10);
//        utils.setVlDois(2);
//        utils.setRaizQuadrada(49);
//        utils.setVlNegativo(-200);
//        
//        System.out.println("Potência: " + utils.calculaPotencia());
//        System.out.println("Raiz Quadrada: " + utils.calculaRaizQuadrada());
//        System.out.println("Maior número: " + utils.verificaMaior());
//        System.out.println("Menor número: " + utils.verificaMenor());
//        System.out.println("Retorna positivo: " + utils.retornaPositivo());
//        System.out.println("Par ou Impar:" +utils.parImpar(8));

/*ARREDONDAMENTO*/

//          System.out.println("Round pra cima: " + Math.round(22.5));
//          System.out.println("Round pra baixo: " + Math.round(22.4));
//          System.out.println("Arredondando pra cima: " + Math.ceil(22.2));
//          System.out.println("Arredondando pra baixo: " + Math.floor(22.8));

//            Notas notas = new Notas();
//            
//            notas.calculaMedia(5.5f, 3.9f, 5.5f, 2.2f);
//            System.out.println(notas.exibeMedia());

/*OPERAÇÕES MATEMATICAS*/

//               System.out.println("Soma: " + Math.addExact(10, 2));
//               System.out.println("Subtração: " + Math.subtractExact(10, 2));
//               System.out.println("Divisão: " + Math.floorDiv(10, 2));
//               System.out.println("Multiplicação: " + Math.multiplyExact(10, 2));

//                 Calculadora calc = new Calculadora();
//                 
//                 calc.setVlUm(10);
//                 calc.setVlDois(0);
//                 calc.setOperacao("/");
//                 
//                 System.out.println(calc.calcula());
    
/*Gerando números aleatórios*/


//                    System.out.println("Random: " + Math.random());
//                    double random = Math.random();
//                    int numero = (int)(1 + random * (10 - 1 ));
//                    System.out.println("Aleatorio de 1 a 10: " + numero);

                  int number[] = new int[5];
                  Scanner ler = new Scanner(System.in);
                  
                  for(int i = 0; i < 5; i++){
                      System.out.println("Digite um número de 1 a 10 - " + (i+1) + "/5: ");
                      number[i] = ler.nextInt();
                  }
                  
                  JogoAzar jogo = new JogoAzar();
                  System.out.println(jogo.jogar(number));
    }
    
}
