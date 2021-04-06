/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel Gomes
 */
public class JoptionPane {

    public static void main(String[] args) {
        
//        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
//        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
//        System.out.println("Olá, " + nome + "!");
//        
//        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
//        System.out.println("Idade: " + idade);
//        
//        float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite sua nota: "));
//        System.out.println("Nota: " + nota);
//   
//Crie um programa que leia separadamente o nome, sobrenome e a idade de uma pessoa e exiba na tela. 
//Os dados devem ser recolhidos com o método showInputDialog.


//    String nome = JOptionPane.showInputDialog("Digite seu nome");
//    String sobreNome = JOptionPane.showInputDialog("Digite seu sobre nome");
//    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
//        System.out.println("Olá " + nome + " " + sobreNome + ", idade: " + idade + " anos");
    
    
//Crie um programa que leia 4 notas e calcule a média aritmética, 
//se a média for maior ou igual a 7 exiba “Aprovado direto” na tela, 
//caso contrário exiba “Exame”. Os dados devem ser recolhidos com o método showInputDialog.


//    float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
//    float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
//    float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceiraa nota"));
//    float nota4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quarta nota"));
//    
//    double media = (nota1 + nota2 + nota3 + nota4) / 4;
//    
//    if(media >= 7){
//        System.out.println("Aprovado direto!");
//    }else{
//        System.out.println("Exame");
//    }


//Crie um programa que leia um número e exiba a tabuada dele. Os dados devem ser recolhidos com o método showInputDialog.

//    int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
//    
//    for(int i = 1; i <= 10; i++){
//        System.out.println(i + " X " + tabuada + " = " + i*tabuada);
//    }

    
//showConfirmDialog *******************

//    int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair ?", "Confirmação", JOptionPane.YES_NO_OPTION);
//    JOptionPane.showMessageDialog(null, resposta);

//    if(resposta == 0){
//        JOptionPane.showMessageDialog(null, "Saindo...");
//    }
    
//     if(resposta == JOptionPane.YES_OPTION){
//        JOptionPane.showMessageDialog(null, "Saindo...");
//    }


//Crie um programa que utilizando a instrução while, leia números inteiros digitados pelo usuário.
//A cada número digitado é perguntado se ele deseja digitar mais um, caso a resposta seja sim,
//continue perguntando os números, caso seja não sai da instrução e exibe a soma dessas número.
//Utilize o showConfirmDialog para perguntar se deseja sair ou não e o showMessageDialog para exibir o resultado.

//int soma = 0;
//int opcao = 0;
//
//while(opcao == JOptionPane.YES_OPTION){
//    soma += Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
//    opcao = JOptionPane.showConfirmDialog(null, "Deseja incluir mais um número ?", "Confirmação", JOptionPane.YES_NO_OPTION);
//}
//
//JOptionPane.showMessageDialog(null, "Resultado: " + soma);


//Crie um programa utilizando a instrução Do While que leia valores de produtos até que o usuário escolha a opção “não”. 
//No final exiba a quantidade de valores digitados e a soma dos mesmos.


//    int count = 0;
//    int opcao = 0;
//    float valor = 0;
//    float soma = 0;
//    
//    do{
//        valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto"));
//        soma += valor;
//        count++;
//        
//        opcao = JOptionPane.showConfirmDialog(null, "Deseja incluir mais um valor ?", "Confirmação", JOptionPane.YES_NO_OPTION);
//        
//    }while(opcao == JOptionPane.YES_OPTION);
//
//        JOptionPane.showMessageDialog(null, "Quantidade de valores digitados: " + count);
//        JOptionPane.showMessageDialog(null, "Total: R$ " + soma);


//showOptionDialog *************************


//String[] opcoes = {"Correto", "incorreto"};
//
//int opcao = JOptionPane.showOptionDialog(null, "A soma de 1 + 1 é 2 ?", "Escolha uma opção", 
//        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
//
//        System.out.println(opcoes[opcao]);
        
        
//Crie um programa que exiba a questão abaixo para o usuário com as suas opções, caso ele erre exiba “Errou” e a resposta correta, caso ele acerte exiba “Acertou”: 
// - A plataforma Java é composta por quatro edições para segmentos específicos de aplicações, assinale a alternativa que corresponde a edição utilizada em aula:
//. Java Enterprise Edition
//. Java Standard Edition
//. Java Micro Edition
//. Java FX

//       String[] opcoes = {"Java Enterprise Edition", "Java Standard Edition", "Java Micro Edition", "Java FX"};
//       
//       int opcaoEscolhida = JOptionPane.showOptionDialog(null, "A plataforma Java é composta por quatro edições para segmentos específicos de aplicações, assinale a alternativa que corresponde a edição utilizada em aula", 
//               "Escolha uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
//       
//       if(opcoes[opcaoEscolhida].equals("Java Standard Edition")){
//           JOptionPane.showMessageDialog(null, "Acertou");
//       }else{
//           JOptionPane.showMessageDialog(null, "Errou - opção correta: Java Standard Edition");
//       }
        

//Crie um programa que exibe a questão abaixo pro usuário, e através da instrução while só permita que ele saia do loop quando escolher a opção correta.
//Selecione a opção que corresponde ao valor de PI
//. 2,18
//. 3,16
//. 3,14 – correta.
//. 1.8


//String[] opcoes = {"2,18", "3,16", "3,14", "1,8"};
//int opcaoEscolhida = 0;
//
//while(!opcoes[opcaoEscolhida].equals("3,14")){
//    opcaoEscolhida = JOptionPane.showOptionDialog(null, "Selecione a opção que corresponde ao valor de PI", 
//               "Escolha uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
//}
//
//    JOptionPane.showMessageDialog(null, "Acertou");


//Crie um programa que exiba três questões da sua escolha para o usuário, 
//no final exiba quantas questões ele acertou e o total de pontos que ele acumulou seguindo a seguinte lógica:
//
//Acertar a questão 1: 8 pontos
//Acertar a questão 2: 7 pontos
//Acertar a questão 3: 15 pontos

String questao1 = "Quanto é 7x7";
String questao2 = "Quanto é 9x9";
String questao3 = "Quanto é 6x6";

String[] opcoes1 = {"56", "21", "49", "28"};
String[] opcoes2 = {"81", "18", "90", "27"};
String[] opcoes3 = {"12", "24", "42", "36"};

int resposta1;
int resposta2;
int resposta3;

int totalPontos = 0;
int qtdAcertos = 0;

resposta1 = JOptionPane.showOptionDialog(null, questao1,
                "Escolhe uma opção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes1, opcoes1[0]);
resposta2 = JOptionPane.showOptionDialog(null, questao2,
                "Escolhe uma opção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes2, opcoes2[0]);
resposta3 = JOptionPane.showOptionDialog(null, questao3,
                "Escolhe uma opção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes3, opcoes3[0]);


if(opcoes1[resposta1].equals("49")){
    qtdAcertos++;
    totalPontos += 8;
}
if (opcoes2[resposta2].equals("81")){
    qtdAcertos++;
    totalPontos += 7;
}

if (opcoes3[resposta3].equals("36")){
    qtdAcertos++;
    totalPontos += 15;
}

if(qtdAcertos > 1){
    JOptionPane.showMessageDialog(null, "Você acertou " + qtdAcertos + " questões" + "\nsua pontuação foi de: " + totalPontos);
}else {
    JOptionPane.showMessageDialog(null, "Você acertou " + qtdAcertos + " questão" + "\nsua pontuação foi de: " + totalPontos );
}



    }
    
}
