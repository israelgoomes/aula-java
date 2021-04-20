/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import classes.Animal;
import classes.Calculadora;
import classes.Carro;
import classes.ControleRemoto;
import classes.Pessoa;

/**
 *
 * @author Israel Gomes
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Carro gol = new Carro(5, "Azul", "JEEP", "RENEGADE", 10);
//        
//        System.out.println(gol.exibeValores());
//        
//        gol.acelerar(20);
//        gol.acelerar(20);
//        gol.acelerar(51);        
//        System.out.println("Velocidade: " + gol.exibeVelocidade() + " km/h");

//            ControleRemoto sansung = new ControleRemoto();
//            
//            System.out.println(sansung.aumentarVolume());
//            System.out.println(sansung.aumentarVolume());
//            System.out.println(sansung.aumentarVolume());
//            System.out.println(sansung.aumentarVolume());
//            System.out.println(sansung.aumentarVolume());
//            System.out.println(sansung.diminuirVolume());
//            System.out.println(sansung.aumentarVolume());
//            
//            System.out.println("CANAL**************************");
//            
//            System.out.println(sansung.subirCanal());
//            System.out.println(sansung.subirCanal());
//            System.out.println(sansung.subirCanal());
//            System.out.println(sansung.subirCanal());
//            System.out.println(sansung.subirCanal());
//            System.out.println(sansung.descerCanal());
//            System.out.println(sansung.subirCanal());

//                Calculadora calculadora = new Calculadora();
//                
//                System.out.println(calculadora.calc(10, 0, "/"));
            
//                Animal cachorro = new Animal("Bob", true, false, 4, "Marrom", "Vira-lata", "Macho");
//                Animal peixe = new Animal("Nemo", false, true, 0, "Azul", "tilapia", "macho");
//                Animal cobra = new Animal("Piton", false, false, 0, "Amarelo", "Piton", "Femea");
//                
//                
//                System.out.println(cachorro.andar());
//                System.out.println(peixe.andar());
//                System.out.println(cobra.andar());
//                
//                System.out.println("CORRER*************");
//                
//                
//                System.out.println(cachorro.correr());
//                System.out.println(peixe.correr());
//                System.out.println(cobra.correr());
//                
//                System.out.println("DESCANSAR*************");
//                
//                
//                System.out.println(cachorro.descansar());
//                System.out.println(peixe.descansar());
//                System.out.println(cobra.descansar());
                
                
                Pessoa joao = new Pessoa("Joao Pereiraa", 1984, 1.75f);
                
                System.out.println(joao.imprimeDados());
                System.out.println("Idade:" + joao.calculaIdade());
                
    }
    
}
