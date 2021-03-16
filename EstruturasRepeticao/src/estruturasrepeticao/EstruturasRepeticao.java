/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasrepeticao;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Israel Gomes
 */
public class EstruturasRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        for(int i = 0; i <= 10; i++){
//            System.out.println(i);
//        }

        Scanner ler = new Scanner(System.in);
        
//        int tabuada;
//        
//        System.out.println("Digite um número para calcular sua tabuada: ");
//        tabuada = ler.nextInt();
//        
//        for(int i = 1; i<= 10; i++){
//            System.out.println(i + " X " + tabuada + " = " + i*tabuada);
//        }
        
        
        
//         int total = 0;
//    
//    for(int i = 1; i <= 500; i++){
//        if(i % 2 !=0){
//            if(i % 3 == 0){
//                total += i;
//            }
//        }
//    }
//    
//        System.out.println("Resultado: " + total);
        
//         for(int i = 1; i <= 100; i++){
//                if(i % 2 == 0){
//                    System.out.println(i);
//            }
//        
//        }
//    4. Crie um programa que conte de 100 a 0.

//        for(int i = 100; i >=0; i--){
//            System.out.println(i);
//        }

//    int count = 1;
//    
//    while(count <= 10){
//        System.out.println(count);
//        count++;
//    }


//Crie um programa que leia um número e calcula quantos números ímpares e pares possuem entre 1 e o número digitado. 
//Exemplo: Número digitado 100 -  Calcule a quantidade de pares e ímpares entre 1 e 100.

        
//    int count = 1;
//    int pares = 0;
//    int impares = 0;
//    int num;
//    
//    
//        System.out.println("Digite um número: ");
//        num = ler.nextInt();
//    
//    while(count <= num){
//        if(count % 2 == 0){
//            pares++;
//        }else if(count % 2 !=0){
//            impares++;
//        }
//        
//        count++;
//    }
//    
//        System.out.println("Quantidade de números pares: " + pares);
//        System.out.println("Quantidade de números impares: " + impares);
        


//. Crie um programa em Java que calcula a média das notas de uma turma. 
//Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele. 
//Em seguida, através de um laço while, pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.
//

//    int qtdAlunos;
//    int count =0;
//    float sum = 0;
//    double media = 0;
//        System.out.println("Digite quantos alunos tem na sala: ");
//        qtdAlunos = ler.nextInt();
//        
//        while(count < qtdAlunos){
//            count++;
//            System.out.println("Digite a nota do aluno " + count + ": ");
//            sum += ler.nextInt();
//        }
//        
//        media = sum / count;
//        System.out.println(media);
        
        
        
        
//    int count = 2;
//    int num;
//    int maior;
//    
//        System.out.println("Número 1: ");
//        num = ler.nextInt();
//        maior = num;
//        
//     while(count <= 5){
//         System.out.println("Digite um número: " + "(" + count + "/5): ");
//         num = ler.nextInt();
//         
//         if(num > maior){
//             maior = num;
//         }
//         count++;
//     }
//     
//        System.out.println("O maior número digitado foi: " + maior);
//        
//      

//    
//    int count = 1;
//    
//    do{
//        System.out.println(count);
//        count++;
//    }while(count <= 10);
//



//Crie um programa que leia um número do teclado até que seja digitado o número 1.
            
//        int num;
//        
//        do{
//            System.out.println("Digite um número: ");
//            num = ler.nextInt();
//        }while(num !=1);
//

// Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados

//        int num;
//        int soma = 0;
//        
//        do {
//            System.out.println("Digite um número: ");
//            num = ler.nextInt();
//            soma += num;
//        }while(num !=0);
//        
//        System.out.println("Total: " + soma);
//

//3. Crie um programa que apresente quatro opções: (a) consulta saldo, 
//(b) saque e (c) depósito e (d) sair. O saldo deve iniciar em R$ 0,00. 
//A cada saque ou depósito o valor do saldo deve ser atualizado
    

    float saldo = 0;
    String op;
    
    do{
        System.out.println("Escolhe uma opção: \n(A) - Consulta saldo \n(B) - Saque \n(C) - Depósito \n(D) - Sair");
        op = ler.next();
        
        if(toUpperCase(op).equals("A")){
            System.out.println("Saldo: " + saldo); 
        }else if(toUpperCase(op).equals("B")){
            float vlSaque;
            System.out.println("Digite o valor do saque: ");
            vlSaque = ler.nextFloat();
            
            if(vlSaque > saldo){
                System.out.println("Você não possui saldo suficiente");
            }else {
                saldo = saldo - vlSaque;
            }
        }else if(toUpperCase(op).equals("C")){
            float vlDeposito;
            System.out.println("Digite o valor que deseja depositar: ");
            vlDeposito = ler.nextFloat();
            saldo = saldo + vlDeposito;
        }
    }while(!toUpperCase(op).equals("D"));

    }  
    
    
    
    
}
