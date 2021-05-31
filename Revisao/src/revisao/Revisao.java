/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import POO.Aluno;
import POO.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author Israel Gomes
 */
public class Revisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      /* ARRAYS */  
        
//        int vetor[] = new int[5];
//        int vetor1[] = new int[] {1, 2, 3, 4, 5};
//        int vetor2[] = {1, 2, 3, 4, 5};
//        
//        for(int i = 0; i < vetor.length; i++){
//            vetor[i] = i;
//        }
//        
//        for(int i = 0; i < vetor.length; i++){
//            System.out.println(vetor[i]);
//        }
//        
//        for(int i: vetor){
//            System.out.println(i);
//        }

//    int matriz[][] = new int [2][2];
//
//    matriz[0][0] = 0;
//    matriz[0][1] = 2;
//    matriz[1][0] = 3;
//    matriz[1][1] = 4;
//    
//    for(int i = 0; i < matriz.length; i++){
//        for(int j = 0; j < matriz.length; j++){
//           System.out.println(matriz[i][j]);
//        }
//    }
        
    /* Exceptions */
    
//        int divisao = 0;
//    
//        try{
//            divisao = 10/0;
//            System.out.println(divisao);
//        }catch(ArithmeticException e){
//                System.out.println("Erro, não é possível dividir por zero");
//        }


/* POO */


//        Aluno al = new Aluno();
//        
//        System.out.println(al.andar());
//        System.out.println(al.comer());
//        
//        al.setMatricula("ad12345");
//        
//        System.out.println(al.getMatricula());
//            al.adicionar();
            
/* CLASSE MATH */

        
        double x  = 16.6;
        double y  = 16.4;
        
        System.out.println("2 elevado a 4: " + Math.pow(2, 4));
        System.out.println("Raiz quadrada: " + Math.sqrt(25));
        System.out.println("Maior: " + Math.max(8, 2));
        System.out.println("Maior: " + Math.min(8, 2));
        System.out.println("Menor: " + Math.abs(-100));
        System.out.println("Resto da divisão: " + Math.floorMod(9, 2));
        
        /*arredondamento*/
        System.out.println("Arredondando pra cima com round " + Math.round(x));
        System.out.println("Arredondando pra baixo com round " + Math.round(y));
        System.out.println("Arredondando pra cima: " + Math.ceil(y));
        System.out.println("Arredondando pra cima: " + Math.floor(x));

        /*calculos*/
        System.out.println("Divisao: " + Math.floorDiv(10, 2));
        System.out.println("subtração: " + Math.subtractExact(10, 2));
        System.out.println("adição: " + Math.addExact(10, 2));
        System.out.println("multiplicacao: " + Math.multiplyExact(10, 2));
        
        /*valores aleatórios*/
        
        System.out.println("Random:" + Math.random());
        
        double r = Math.random();
        int n = (int) (1 + r * (20 -1));
        System.out.println("Número aleatório de 1 a 20: " + n);
        
  
        /*INTERFACES*/
        
        
                Aluno al = new Aluno();
//        
//        System.out.println(al.andar());
//        System.out.println(al.comer());
//        
//        al.setMatricula("ad12345");
//        
//        System.out.println(al.getMatricula());
//            al.adicionar();
//            al.adicionar();
//            al.dormir();


    String p1 = "Pedro";
    String p2 = "Marcos";
    String p3 = "Jose";
    String p4 = "Marcos";

    
    ArrayList<String> pessoas = new ArrayList<>();
    
    pessoas.add(p1);
    pessoas.add(p2);
    pessoas.add(p3);
    pessoas.add(p4);

    
    for(String p: pessoas){
//        System.out.println(p);
    }    
//    Aluno al1 = new Aluno("1234532", "Pedro", 25, "1234565");
//    Aluno al2 = new Aluno("78945632", "Marcos", 25, "1234565");
//    Aluno al3 = new Aluno("654123", "Jose", 25, "1234565");
//    
//    ArrayList<Aluno> alunos = new ArrayList<>();
//    
//    alunos.add(al1);
//    alunos.add(al2);
//    alunos.add(al3);
//    
//    
//    for(Aluno aluno: alunos){
//        System.out.println(aluno.toString());
//    }


//    pessoas.stream().limit(2).forEach(pessoa -> {
//        System.out.println(pessoa);
//    });
    
       pessoas.stream().skip(2).forEach(pessoa -> {
        System.out.println(pessoa);
    });
       
        System.out.println("*************************");
       
       pessoas.stream().filter(pessoa -> pessoa.equals("Marcos")).forEach(i -> {
           System.out.println(i);
       });
       
       System.out.println("*************************");
       
       Pessoa pedro = new Pessoa("Pedro", 25, "1234567910");
       Pessoa jose = new Pessoa("Jose", 25, "1234567910");
       Pessoa maria = new Pessoa("Maria", 25, "1234567910");

       ArrayList<Pessoa> pessoas2 = new ArrayList<>();
       
       pessoas2.add(pedro);
       pessoas2.add(jose);
       pessoas2.add(maria);
 
       
       pessoas.stream().map(pessoa -> pessoa.equals("Jose")).forEach(i ->{
           //System.out.println(i);
           if(i == true){
               System.out.println("Jose");
           }
       });
       
        pessoas2.stream().map(Pessoa::getNome).forEach(i ->{
            System.out.println(i);
        });
        
        System.out.println("*************************");

        
        pessoas2.stream().map(pessoa -> pessoa.getNome()).forEach(i ->{
            System.out.println(i);
        });
       
       
    

    
    
    }
    
}
