/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca_polimorfismo;

import classes_filhas.Aluno;
import classes_filhas.Cachorro;
import classes_filhas.Carro;
import classes_filhas.Funcionario;
import classes_filhas.Gato;
import classes_filhas.Professor;
import classes_filhas.Relogio;

/**
 *
 * @author Israel Gomes
 */
public class Heranca_polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cachorro bob = new Cachorro(4, true, "vira-lata", "Marrom", "Macho");
        Gato garfield = new Gato();
//
//            System.out.println(bob.comer());
//            System.out.println(garfield.comer());
//            System.out.println(bob.toString());
//            System.out.println(bob.exibeDados());
            
            Carro gol = new Carro(2, false, 100, 5, "volkswagen", "gol", "branco");
            
            System.out.println(gol.toString());
            System.out.println(gol.getMarca());

//           Relogio rel = new Relogio("Digital", "Apple", "Apple watch", "Relógio", 1800f); 
//           
//           System.out.println(rel.validaPreco() ? "Produto caro!" : "Produto Barato");
//           System.out.println(rel.insereAlarme("22:30"));
        
        
        
        
        // Atributos herdados da classe Animal
//        bob.setCor("Marrom");
//        bob.setRaca("vira-lata");
//        bob.setMachoFemea("Macho");
        
        //Atributos próprios da classe cachorro
//        bob.setQtdPatas(4);
//        bob.setRabo(true);
        
//        garfield.setIdade(02);
//        
//        System.out.println(garfield.getIdade());
//        
//        
//        System.out.println(bob.getCor());
//        System.out.println(bob.getRaca());
//        System.out.println(bob.getMachoFemea());
//        System.out.println(bob.getQtdPatas());
//        System.out.println(bob.getRabo());
//        
//        System.out.println(bob.comer());

            
//            Professor prof = new Professor();
//            Funcionario func = new Funcionario();
//            Aluno al = new Aluno();
//            
//            System.out.println(prof.darAula());
//            System.out.println(prof.andar());

    }
    
}
