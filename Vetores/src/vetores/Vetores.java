/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author Israel Gomes
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);

        
//        int vetor[] = {200, 100, 5, 2};
//        int[] vetor2 = new int[4];
//        int[] vertor3 = new int[] {1, 2, 3, 4};
//        
//        for(int i = 0; i < vetor.length; i++){
//            System.out.println(vetor[i]);
//        } 



//Crie um programa que leia um vetor de 5 números inteiros e os exiba na tela.
        
//            int[] vetor = new int[5];
//
//            
//            for(int i = 0; i < vetor.length; i++){
//                System.out.println("Digite um número " + "(" + (i+1) + "/5) :");
//                vetor[i] = ler.nextInt();
//            }
//            
//            System.out.println("**********************************");    
//            
//            for(int i = 0; i < vetor.length; i++){
//                System.out.println(vetor[i]);
//            }

//Crie um Programa que leia um vetor de 10 números inteiros de 1 a 10 e mostre-os na ordem inversa
    
//        int[] vetor = new int[10];
//        
//        int count = 1;
//        for(int i =0; i < 10; i++){
//            vetor[i] = count;
//            count++;
//        }
//        
//                for(int i = vetor.length -1; i >= vetor[0] -1; i--){
//            System.out.println(vetor[i]);
//        }
            

//crie um Programa que leia um vetor de 5 números inteiros e mostre a soma desses número.
    
//                int[] vetor = new int[5];
//                int soma = 0;
//                
//                for(int i = 0; i< vetor.length; i++){
//                    System.out.println("Digite um número " + "(" + (i+1) + "/5) :");
//                    vetor[i] += ler.nextInt();
//                    soma += vetor[i];
//                }
//                
//                System.out.println("Resultado: " + soma);

//        int vetor[] = {200, 100, 5, 2};
//        int[] vetor2 = new int[4];
//        int[] vertor3 = new int[] {1, 2, 3, 4};
//        
//        
//        
//        for(int i: vetor){
//            System.out.println(i);
//        } 


//Crie um programa que leia um conjunto de notas, cuja quantidade seja determinada pelo usuário. 
//Com um foreach exiba as notas digitadas na tela e depois calcule a média de todas elas e exiba na tela.

            
// for each

//        String nomes[] = {"Joao", "Pedro", "Maria"};
//        
//        for(String nome: nomes){
//            System.out.println(nome);
//        }

//            int qtdNotas;
//            System.out.println("Digite a quantidade de notas: ");
//            qtdNotas = ler.nextInt();
//            
//            float[] vetor = new float[qtdNotas];
//            float soma = 0;
//            
//            for(int i = 0; i < vetor.length; i++){
//                System.out.println("Digite as notas " + "(" + (i+1) + "/" + vetor.length + ") :");
//                vetor[i] = ler.nextFloat();
//            }
//            
//            System.out.println("*****************************************");
//            
//            for(float i: vetor){
//                System.out.println(i);
//                soma += i;
//            }
//            
//            System.out.println("*****************************************");
//
//            
//            float media = soma / vetor.length;
//            System.out.println("A média dos alunos é: " + media);
//      



//.Crie um programa que leia um conjunto de alunos definido pelo usuário, 
//cada uma com o nome e a nota. Em seguida exiba o nome dos alunos e média das notas digitadas.

        
//    int qtdAlunos;
//    
//        System.out.println("Digite a quantidade de alunos: ");
//        qtdAlunos = ler.nextInt();
//        
//        String[] nomes = new String[qtdAlunos];
//        float[] notas = new float[qtdAlunos];
//        
//        float soma = 0, media = 0;
//        
//        for(int i = 0; i < nomes.length; i++){
//            System.out.println("Digite o nome do aluno: ");
//            nomes[i] = ler.next();
//            
//            System.out.println("Digite a nota do aluno: ");
//            notas[i] = ler.nextFloat();
//            
//            soma += notas[i];
//        }
//        
//        System.out.println("ALUNOS ********************");
//        
//        for(String nome: nomes){
//            System.out.println(nome);
//        }
//        
//        System.out.println("MÉDIA TOTAL *************");
//        
//        media = soma/qtdAlunos;
//        
//        System.out.println("Resultado: " + soma);



//Matriz ***************************************


//    int matriz[][] = new int [2][2];
//    
//    matriz[0][0] = 1;
//    matriz[0][1] = 2;
//    matriz[1][0] = 3;
//    matriz[1][1] = 4;
//    
//    
//    for(int i = 0; i < matriz.length; i++){
//        for(int j = 0; j < matriz.length;j++){
//            System.out.println(matriz[i][j]);
//        }
//    }
    


//Crie um programa que leia 10 valores double do teclado e armazene-os em uma matriz de dimensões 2x5.


//        double matriz[][] = new double[2][5];
//        
//        int count = 1;
//        
//        for(int i = 0; i < 2; i++){
//            for(int j = 0; j < 5; j++){
//                System.out.println("Digite 10 números " + count + " :");
//                matriz[i][j] = ler.nextDouble();
//                count++;
//            }
//        }
//        
//        
//        System.out.println("*************************");
//        
//        for(int i = 0; i < 2; i++){
//            for(int j = 0; j < 5; j++){
//                System.out.println(matriz[i][j]);
//            }
//        }
    
//Crie um programa que declare um array bidimensional chamado somatória de 10×10 posições e preencha os 
//elementos do array com os valores da soma dos índices para aquele elemento, de forma que, por exemplo, o elemento somatória[7][9] valha 16.


//        int somatoria[][] = new int[10][10];
//        
//        for(int i = 0; i < somatoria.length; i++){
//            for(int j = 0; j < somatoria.length; j++){
//                somatoria[i][j] = i+j;
//            }
//        }
//        
//         for(int i = 0; i < somatoria.length; i++){
//            for(int j = 0; j < somatoria.length; j++){
//                System.out.println("[" + i + "]" + "[" + j + "] = " + somatoria[i][j]);
//            }
//        }
        

//Crie um programa que onde o usuário digita a quantidade de linhas e colunas da matriz, 
//após isso crie uma matriz com as quantidades digitadas, preencha a matriz com números inteiros digitados pelo usuário. 
//Some os números digitados e exiba o resultado na tela. Também exiba os números que foram digitados em suas respectivas posições, 
//por exemplo: [0][0] = 2, [0][1] = 6...


    int linhas;
    int colunas;
    
        System.out.println("Digite a quantidade de linhas: ");
        linhas = ler.nextInt();
        
        System.out.println("Digite a quantidade de colunas: ");
        colunas = ler.nextInt();
        
        int matriz[][] = new int[linhas][colunas];
        
        int count =1;
        int soma = 0;
        
        for(int i = 0; i < linhas; i++){
                    for(int j = 0; j < colunas; j++){
                        System.out.println("Digite um número: " + count + "/" + linhas*colunas + " :");
                        matriz[i][j] = ler.nextInt();
                        soma += matriz[i][j];
                        count ++;
                    }
                }
        
        System.out.println("Somas dos números digitados: " + soma);
        
        System.out.println("Números digitados em suas respectivas posições *********************");
        
        for(int i = 0; i < linhas; i++){
                    for(int j = 0; j < colunas; j++){
                        System.out.println("[" + i + "]" + "[" + j + "] = " + matriz[i][j]);
                    }
                }

    }
    
}
