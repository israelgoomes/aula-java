/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexemplo;

/**
 *
 * @author Israel Gomes
 */
public class RestauranteJapones extends Restaurante{
    
    @Override
    public String fazerPedido(String pedido){
        return "Anotando pedido..";
    }
    
    @Override
    public String opcoesPedidos(){
        return "Opções de pedidos: \nTemaki \n Hot-roll";
    }
    
    
}
