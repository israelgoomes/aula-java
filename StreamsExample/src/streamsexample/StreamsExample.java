/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamsexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Israel Gomes
 */
public class StreamsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Animal a1 = new Animal("Piton", "amarelo", "Cobra");
        Animal a2 = new Animal("Persa", "laranja", "Garfield");
        Animal a3 = new Animal("Vira-lata", "marrom", "Bob");
        Animal a4 = new Animal("Pit bull", "preto", "Bob");
        Animal a5 = new Animal("Coelho", "branco", "rex");
        
        ArrayList<Animal> animais = new ArrayList<>();
        
        animais.add(a1);
        animais.add(a2);
        animais.add(a3);
        animais.add(a4);
        animais.add(a5);
        
//        animais.stream().limit(3).forEach(animal -> {
//            System.out.println(animal.toString());
//        });
        
//          animais.stream().skip(2).forEach(animal -> {
//            System.out.println(animal.toString());
//        });
          
/*FILTER*/

//            animais.stream().filter(animal -> animal.getNome().equals("Bob")).forEach(a -> {
//                System.out.println(a.toString());
//            });
            
//            animais.stream().map(Animal::getNome).forEach(a -> {
//                System.out.println(a);
//            });
//            
//            animais.stream().map(animal -> animal.getNome()).forEach(a -> {
//                System.out.println(a);
//            });

//            Pessoa p1 = new Pessoa("Pedro", 25, "M");
//            Pessoa p2 = new Pessoa("Pedro", 18, "M");
//            Pessoa p3 = new Pessoa("Marcos", 16, "M");
//            Pessoa p4 = new Pessoa("Maria", 32, "F");
//            Pessoa p5 = new Pessoa("Juliana", 28, "F");
//            
//            ArrayList<Pessoa> pessoas = new ArrayList<>();
//            
//            pessoas.add(p1);
//            pessoas.add(p2);
//            pessoas.add(p3);
//            pessoas.add(p4);
//            pessoas.add(p5);
            
//            p1.filtro(pessoas, "nome", "Pedro");
//            p1.filtro(pessoas, "idade", "");
            
//            System.out.println(p1.retornaNome(pessoas));



/*REDUCE*/

//        List<Integer> numbers = Arrays.asList(10, 10, 10, 10, 10);
//        
//        Collections.sort(numbers);
//        
//        System.out.println(numbers);
//        
//        int resultado = numbers.stream().reduce(0, (anterior, atual) -> anterior + atual);
//        
//        System.out.println("Resultado: " + resultado);

        Numeros n1 = new Numeros(1);
        Numeros n2 = new Numeros(1);
        Numeros n3 = new Numeros(1);
        Numeros n4 = new Numeros(1);
        Numeros n5 = new Numeros(1);
        Numeros n6 = new Numeros(1);
        Numeros n7 = new Numeros(1);
        Numeros n8 = new Numeros(1);
        Numeros n9 = new Numeros(1);
        
        ArrayList<Numeros> numeros = new ArrayList<>();
        
        numeros.add(n1);
        numeros.add(n2);
        numeros.add(n3);
        numeros.add(n4);
        numeros.add(n5);
        numeros.add(n6);
        numeros.add(n7);
        numeros.add(n8);
        numeros.add(n9);
        
//        System.out.println(n1.ordenaNumeros(numeros));
        System.out.println("Resultado: " + n1.somaNumeros(numeros));

    }
    
}
