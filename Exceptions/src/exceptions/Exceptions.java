/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Israel Gomes
 */
public class Exceptions {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
//          int divisao = 10 / 0;
//          System.out.println(divisao);
//          
//          int[] vetor = {1, 2, 3, 4};
//          vetor[4] = 5;

//        String nome = null;
//        System.out.println(nome.toLowerCase());

//           int number;
//           
//           Scanner ler = new Scanner(System.in);
//           System.out.println("Digite um número inteiro: ");
//           number = ler.nextInt();
//           System.out.println(number);


//        int divisao = 0;
//           try{
//            divisao = 10 / 0;
//            System.out.println(divisao);
//           }catch(ArithmeticException erro){
//               System.out.println(erro);
//               System.out.println("Erro, não é possível dividir por zero!");
//               
//           }
//           System.out.println("Resultado: " + divisao);
           

//Crie um programa que leia dois números inteiros (dividendo e divisor) 
//faça a divisão entre os números e o tratamento de exceção caso o divisor seja 0.


//        int dividendo;
//        int divisor;
//        float divisao = 0;
//        
//        try{
//            System.out.println("Digite o dividendo:: ");
//            dividendo = ler.nextInt();
//            
//            System.out.println("Digite o divisor: ");
//            divisor = ler.nextInt();
//            divisao = dividendo / divisor;
//            System.out.println("Resultado: " + divisao);
//        }catch(ArithmeticException e){
//            System.out.println("Erro, não é possível dividir por zero!");
//        }

//Crie um programa que tenha um vetor inteiro de 3 posições.
//Peça para o usuário digitar um número e avise que o máximo é 3.
//Faça o tratamento de exceção caso ele digite um número maior que 3.

//        int[] vetor = new int[3];
//        vetor[0] = 10;
//        vetor[1] = 18;
//        vetor[2] = 5;
//        
//        try{
//            System.out.println("Digite a quantidade de valores que devem ser exibidos (MÁX 3): ");
//            int quantidade = ler.nextInt();
//            
//            System.out.println("************************");
//            
//            for(int i =0; i < quantidade; i++){
//                System.out.println(vetor[i]);
//            }
//            
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Erro! Digite no máximo 3.");
//        }

//. Crie um programa e declare a variável nome do tipo String igual a null.
//No try tente deixar  todas as palavras em minúsculo com o método toLowerCase().
//No catch atribua um novo valor a essa variável e no final exiba na tela.

//        String nome = null;
//        
//        try{
//            System.out.println(nome.toLowerCase());
//        }catch(NullPointerException e){
//            nome = "PEDRO barbosa";
//        }
//        
//        System.out.println(nome.toLowerCase());
//


//Crie um programa e declare um vetor do tipo inteiro.
//Pergunte ao usuário o tamanho desse vetor e depois crie um for para ele preencher os valores.
//Faça o tratamento da exceção caso algum dos números digitados não seja inteiro.
//
//            int quantidade;
//            
//            System.out.println("Digite a quantidade de valores: ");
//            quantidade = ler.nextInt();
//            
//            int[] vetor = new int[quantidade];
//            
//            try{
//                
//                for(int i = 0; i < vetor.length; i++){
//                    System.out.println("Digite um númeo inteiro: ");
//                    vetor[i] = ler.nextInt();
//                }
//            }catch(InputMismatchException e){
//                System.out.println("Erro! Digite apenas números inteiros" + e);
//            }    


// Catch genérico e bloco finally *************************


//    try {
//        float divisao = 5 /2;
//        System.out.println(divisao);
//    }catch(Exception e){
//        System.out.println("Erro!");
//    }finally{
//        System.out.println("Sempre passa por aqui");
//    }


//Crie um programa que leia 8 números inteiros e salve-os em um vetor.
//Após ler esses números faça a soma dos mesmos.
//Faça um tratamento de exceção genérico e caso de caia nele deixe o valor do total igual a zero. No bloco finally exiba a soma dos valores.

    
//    int[] vetor = new int[8];
//    int total = 0;
//    
//    try{
//        for(int i = 0; i < vetor.length; i++){
//            System.out.println("Digite um número: ");
//            total += ler.nextInt();
//        }
//    }catch(Exception e){
//        System.out.println("Erro!");
//        total = 0;
//    }finally {
//        System.out.println("Resultado: " + total);
//    }


//Crie um programa que leia valores de produtos até que o usuário escolha a opção “não” no showConfirmDialog do JOptionPane.
//Faça um tratamento de exceção genérico e independente do resultado exiba a mensagem “Obrigado Por utilizar nosso sistema.”

    
            float valor;
            int opcao = 0;
            
            try{
                
                while(opcao == JOptionPane.YES_OPTION){
                    valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do produto: "));
                    opcao = JOptionPane.showConfirmDialog(null, "Deseja incluir mais um produto ?", "Confirmação", JOptionPane.YES_NO_OPTION);
                }
                
            }catch(Exception e){
                System.out.println("Erro!");
            }finally{
                System.out.println("Obrigado Por utilizar nosso sistema.");
            }

    }  
}
