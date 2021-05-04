/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_filhas;

import classes_pais.Produto;

/**
 *
 * @author Israel Gomes
 */
public class Relogio extends Produto {
    
    private String tipo;
    private String marca;
    private String modelo;

    public Relogio() {
    }
    
    public Relogio(String tipo, String marca, String modelo, String nome, float preco) {
        super(nome, preco);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String verificaHora(){
        return "Agora são 21:10h";
    }
    
    public String insereAlarme(String horario){
        return "Alarme inserido para " + horario + " hora(s)";
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
}
