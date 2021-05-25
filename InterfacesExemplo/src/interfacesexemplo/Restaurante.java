/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexemplo;

import interfaces.ICardapio;

/**
 *
 * @author Israel Gomes
 */
public class Restaurante implements ICardapio{

    private String lanche;
    private String pratoComida;
    private String sobremesa;
    private String bebida;

    public Restaurante() {
    }

    public Restaurante(String lanche, String pratoComida, String sobremesa, String bebida) {
        this.lanche = lanche;
        this.pratoComida = pratoComida;
        this.sobremesa = sobremesa;
        this.bebida = bebida;
    }
    
    
    public String fazerPedido(String pedido){
        return "Anotando pedido..";
    }
    
    public String opcoesPedidos(){
        return "Opções de pedidos";
    }
    
    @Override
    public String lanche(String lanche) {
        this.lanche = lanche;
        return "Preparando lanche " + lanche;
    }

    @Override
    public String pratoComida(String tpPratoComida) {
        this.pratoComida = tpPratoComida;
        return "Preparando o Prato " + tpPratoComida;
    }

    @Override
    public String sobreMesa(String tpSobremesa) {
        this.sobremesa = tpSobremesa;
        return "Preparando a sobremesa " + tpSobremesa;
    }

    @Override
    public String bebida(String tpBebida) {
        this.bebida = tpBebida;
        return "Pegando a bebida " + tpBebida;
    }

    @Override
    public String toString() {
        return "Pedido: " + "\nLanche: " + lanche + "\nPratoComida: " + pratoComida + "\nSobremesa: " + sobremesa + "\nBebida: " + bebida;
    }

    
    
    
    public String getLanche() {
        return lanche;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }

    public String getPratoComida() {
        return pratoComida;
    }

    public void setPratoComida(String pratoComida) {
        this.pratoComida = pratoComida;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
    
    
    
}
