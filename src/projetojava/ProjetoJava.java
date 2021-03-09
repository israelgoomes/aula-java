/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetojava;

import java.util.Scanner;

/**
 *
 * @author Israel Gomes
 */
public class ProjetoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
//        1. Crie um programa com 2 variáveis numéricas e verifique qual a maior.

//           int num1 = 4;
//           int num2 = 3;
//           
//           if(num1 > num2){
//               System.out.println("Num1: " + num1 + " é maior que Num2: " + num2);
//           }
//           
//           if(num2 > num1){
//               System.out.println("Num2: " + num2 + " é maior que Num1: " + num1);
//           }

//2. Crie um programa com 3 variáveis numéricas onde A = 1.75, B = 1.8, C = 3.5 e imprima na tela se a soma de A + B é menor que C.
    
            
//             float a = 1.1f;
//             float b = 1.8f;
//             float c = 3.5f;
//             
//             if((a+b) < c) System.out.println("A soma de A+B é menor que C");
        
//3. Crie um programe com a variável nome, sexo e o estado civil de uma pessoa. Caso sexo seja “F” e estado civil seja “CASADA”, imprima as informações na tela.
                
//                String nome = "Joao";
//                String sexo = "M";
//                String estadoCivil = "CASADA";
//                
//                
//                if(sexo.equals("F") || estadoCivil.equals("CASADA")) System.out.println("Nome: " + nome + "\nSexo: " + sexo + "\nEstado civil: " + estadoCivil);
        

//4. Crie um programa com uma variável que recebe um número qualquer e informe na tela se é par ou ímpar

//    int imparPar = 7;
//    
//    if((imparPar % 2) == 0) System.out.println("Par");
//    if((imparPar % 2) != 0) System.out.println("Ímpar");
//
//   

//5. Crie um programa com dois valores inteiros A e B se os valores forem iguais deverá se somar os dois, 
//caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.

//        
//        int a = 5;
//        int b = 5;
//        int c;
//        
//        if(a == b) {
////            soma
//               c = a+b;
//               System.out.println("Resultado: " + c);
//        } else {
////            multiplica
//              c = a*b;
//              System.out.println("Resultado: " + c);
//        }

//6. Crie um programa que calcule a média aritmética de 4 provas de um aluno, e exiba o resultado da seguinte forma:
//
//Se a média for menor que 5: Imprima “Reprovado” na tela
//Se a média for maior ou igual 5 e menor que 7: Imprima “Recuperação” na tela
//Se a média for maior ou igual a 7: Imprima “Aprovado”

//
//    float n1 = 8;
//    float n2 = 8;
//    float n3 = 8;
//    float n4 = 8;
//    
//    float media = (n1+n2+n3+n4) / 4;
//    
//    if(media < 5){
//        System.out.println("Reprovado!");
//    } else if(media >= 5 && media < 7){
//        System.out.println("Recuperação!");
//    } else {
//        System.out.println("Aprovado!");
//    }

//7. Crie um programa com uma variável  numérica possuindo um valor inteiro que seja de 1 até 12, e imprima na tela o mês correspondente ao número.

//    int mes = 9;
//    
//    if(mes == 1){
//        System.out.println("Janeiro");
//    }else if(mes == 2){
//        System.out.println("Fevereiro");
//    }else if(mes == 3){
//        System.out.println("Março");
//    }else if(mes == 4){
//        System.out.println("Abril");
//    }else if(mes == 5){
//        System.out.println("Maio");
//    }else if(mes == 6){
//        System.out.println("Junho");
//    }else if(mes == 7){
//        System.out.println("Julho");
//    }else if(mes == 8){
//        System.out.println("Agosto");
//    }else if(mes == 9){
//        System.out.println("Setembro");
//    }else if(mes == 10){
//        System.out.println("Outubro");
//    }else if(mes == 11){
//        System.out.println("Novembro");
//    }else if(mes == 12){
//        System.out.println("Dezembro");
//    }


//1. Crie um programa com duas variáveis numéricas, e uma variável para armazenar a operação que deseja executar 
//(Operações: soma, subtração, divisão, multiplicação). Execute a operação desejada e imprima na tela.

//
//    int num1 = 10;
//    int num2 = 5;
//    
//    String op = "*";
//    
//    switch(op) {
//        
//        case "+":
//            System.out.println(num1+num2);
//            break;
//        case "-":
//            System.out.println(num1-num2);
//            break;
//        case "/":
//            System.out.println(num1/num2);
//            break;
//        case "*":
//            System.out.println(num1*num2);
//            break;
//        default:
//            System.out.println("Nenhuma opção escolhida!");
//    }
    

//2. Crie um programa com uma variável que receba um valor numérico de 1 a 7 e imprima o dia da semana conforme o número escolhido.

//        
//    int semana = 7;
//    
//    
//    switch(semana) {
//        case 1:
//            System.out.println("Domingo");
//            break;
//        case 2:
//            System.out.println("Segunda");
//            break;
//        case 3:
//            System.out.println("Terça");
//            break;
//        case 4:
//            System.out.println("Quarta");
//            break;
//        case 5:
//            System.out.println("Quinta");
//            break;
//        case 6:
//            System.out.println("Sexta");
//            break;
//        case 7:
//            System.out.println("Sabado");
//            break;
//    }

//3. Uma loja fornece 10% de desconto para funcionários e 5% de desconto para clientes vips. 
//Faça um programa que calcule o valor total a ser pago por uma pessoa. O programa deverá ler o valor total da compra efetuada e um código 
//que identifique se o comprador é um cliente comum (1), funcionário (2) ou vip (3).


//int codigo = 1;
//
//double valorTotal = 325;
//
//switch(codigo){
//    case 1:
//        System.out.println("Total: " + valorTotal);
//        break;
//    case 2:
//        valorTotal = valorTotal - (valorTotal*0.1);
//        System.out.println("Total: " + valorTotal);
//        break;
//    case 3:
//        valorTotal = valorTotal - (valorTotal*0.05);
//        System.out.println("Total: " + valorTotal);
//        break;
//    default:
//        System.out.println("Nenhuma opção escolhida!");
//}

Scanner ler = new Scanner(System.in);
//
//String nome;
//String sobreNome;
//
//
//        System.out.println("Digite seu nome: ");
//        nome = ler.nextLine();
//        
//        System.out.println("Digite seu sobre nome: ");
//        sobreNome = ler.nextLine();
//        
//        System.out.println("Nome completo: " + nome + " " + sobreNome);
//
//
//
//

//1. Crie um programa que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar, imprimir o resultado desta operação


        int num;
        int resultado;
        
        System.out.println("Digite um número inteiro: ");
        num = ler.nextInt();
        
        
        
        if((num % 2) == 0) {
            resultado = num + 5;
            System.out.println("Resultado: " + resultado);
        } else if ((num % 2) !=0){
            resultado = num + 8;
            System.out.println("Resultado: " + resultado);
        }

}
    
}
