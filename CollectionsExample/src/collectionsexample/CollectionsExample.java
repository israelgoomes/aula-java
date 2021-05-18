/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Israel Gomes
 */
public class CollectionsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        String p1 ="Joao";
//        String p2 ="Maria";
//        String p3 ="Andre";
//        
//        ArrayList<String> pessoas = new ArrayList<>();
//        List<String> pessoas2 = new ArrayList<String>();

//         pessoas.add(p1);
//         pessoas.add(p2);
//         pessoas.add(p3);
//         pessoas.add("Victor");
         
//         System.out.println(pessoas);
//         
//         pessoas.remove(0);
//         pessoas.remove(p2);
//         System.out.println(pessoas);
//
//         List<String> nomes = Arrays.asList("Teste1", "Teste2", "Teste3");
//         System.out.println(nomes);

//            for(String pessoa: pessoas){
//                if(pessoa.equals("Joao")){
//                    pessoa = "Teste";
//                }
//                System.out.println(pessoa);
//            }
//         
//            System.out.println("Nome: " + pessoas.get(0));
//            
//            for(int i = 0; i < pessoas.size(); i++){
//                System.out.println("Nomes: " + pessoas.get(i));
//            }

//        System.out.println(pessoas);
//        Collections.sort(pessoas);
//        System.out.println(pessoas);
        
        
        String a1 = "Cobra";
        String a2 = "Cachorro";
        String a3 = "Gato";
        String a4 = "Elefante";
        String a5 = "Girafa";
        
        ArrayList<String> animais = new ArrayList<>();
        
        animais.add(a1);
        animais.add(a2);
        animais.add(a3);
        animais.add(a4);
        animais.add(a5);
        
        for(String animal: animais){
            System.out.println(animal);
        }
        
        System.out.println(animais.get(2));
        
        for(int i = 0; i < animais.size(); i++){
            System.out.println("Animal: " + animais.get(i));
        }
          
        
//        Collections.sort(animais);
//        System.out.println(animais);
//        
//        animais.remove(a4);
//        System.out.println(animais);
        
        Pessoa p1 = new Pessoa("Joao", 1994, 1.74f);
        Pessoa p2 = new Pessoa("Maria", 1992, 1.64f);
        Pessoa p3 = new Pessoa("Pedro", 1985, 1.80f);
        
//        System.out.println(p1.exibeDados());
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        
        System.out.println(pessoas);
        
//        for(Pessoa pessoa: pessoas){
//            if(pessoa.getNome().equals("Joao")){
//                pessoa.setNome("TESTE");
//            }
//            System.out.println(pessoa.exibeDados());
//        }
//        
//        pessoas.forEach(pessoa -> {
//            System.out.println(pessoa.exibeDados());
//        });
        

//        pessoas.stream().limit(1).forEach(pessoa -> { 
//            System.out.println(pessoa.exibeDados()); 
//        });
        
         pessoas.stream().skip(2).forEach(pessoa -> { 
            System.out.println(pessoa.exibeDados()); 
        });
    }
    
}
