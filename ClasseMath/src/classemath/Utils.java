/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classemath;

/**
 *
 * @author Israel Gomes
 */
public class Utils {
    private float vlUm;
    private float vlDois;
    private double raizQuadrada;
    private int vlNegativo;

    public Utils() {
    }

    public Utils(float vlUm, float vlDois, double raizQuadrada, int vlNegativo) {
        this.vlUm = vlUm;
        this.vlDois = vlDois;
        this.raizQuadrada = raizQuadrada;
        this.vlNegativo = vlNegativo;
    }
    
    public double calculaPotencia(){
        return Math.pow(this.vlUm, this.vlDois);
    }
    
    public double calculaRaizQuadrada(){
        return Math.sqrt(this.raizQuadrada);
    }
    
    public float verificaMaior(){
        return Math.max(this.vlUm, this.vlDois);
    }
    
    public float verificaMenor(){
        return Math.min(this.vlUm, this.vlDois);
    }
    
    public float retornaPositivo(){
        return Math.abs(this.vlNegativo);
    }
    
    public String parImpar(int numero){
        if(Math.floorMod(numero, 2) == 0){
            return "Par";
        }else{
            return "Impar";
        }
    }

    public float getVlUm() {
        return vlUm;
    }

    public void setVlUm(float vlUm) {
        this.vlUm = vlUm;
    }

    public float getVlDois() {
        return vlDois;
    }

    public void setVlDois(float vlDois) {
        this.vlDois = vlDois;
    }

    public double getRaizQuadrada() {
        return raizQuadrada;
    }

    public void setRaizQuadrada(double raizQuadrada) {
        this.raizQuadrada = raizQuadrada;
    }

    public int getVlNegativo() {
        return vlNegativo;
    }

    public void setVlNegativo(int vlNegativo) {
        this.vlNegativo = vlNegativo;
    }
    
    
    
}
