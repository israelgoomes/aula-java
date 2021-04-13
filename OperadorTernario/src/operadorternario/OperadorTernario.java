/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Israel Gomes
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        int numeroDias = 16;
//        String quinzena = (numeroDias < 0) ? "Inexistente" : numeroDias <= 15 ? "Primeira Quinzena" : "Segunda Quinzena";
//        System.out.println(quinzena);

//Crie um programa que leia um valor inteiro de 1 até 12 do usuário. 
//Se o número digitado for menor ou igual a 6, exiba na tela “Primeiro Semestre”, caso seja maior que 6, exiba na tela “Segundo semestre”.

    Scanner ler = new Scanner(System.in);

//    int numero = 0;
//        System.out.println("Digite um número de 1 a 12");
//        numero = ler.nextInt();
//        
//        String mensagem = numero <=6 ? "Primeiro Semestre" : "Segundo Semestre";
//        
//        System.out.println(mensagem);


//Crie um programa onde o usuário digite a quantidade (inteiro) de erros encontrados em um determinado processo.
//Com o operador condicional ternário, exiba a saída no singular caso seja apenas 1 erro e no plural se for mais.
//	1 erro detectado.
//	4 erros detectados.

//        
//    int qtdErros;
//        System.out.println("Digite a quantidade de erros identificados: ");
//        qtdErros = ler.nextInt();
//        
//        String mensagem = qtdErros > 1 ? " erros detectados." : " erro detectado.";
//        System.out.println(qtdErros + mensagem);



//Crie um programa que oferece 3 opções através do showOption do JOptionPane.
//Em cada uma dessas opções possui uma tabuada e seu resultado.
//Através da escolha do usuário exiba a tabuada e seu resultado correspondente.
//Utilize o operador ternário para definir o que mostrar através do que foi escolhido pelo usuário.
//
//Exemplo:
//
//Escolha uma opção: A, B, C
//
//Caso escolha A = “7x7 = 49”
        
    String[] opcoes = {"A", "B", "C"};
    
    String opcaoA = "7 x 5 = 35";
    String opcaoB = "7 x 8 = 56";
    String opcaoC = "6 x 9 = 54";
    
    int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção",
                "Escolhe uma opção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
    
    String mensagem = opcoes[opcao].equals("A") ? opcaoA : opcoes[opcao].equals("B") ? opcaoB : opcaoC;
        System.out.println(mensagem);




    }
    
}
