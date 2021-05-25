/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexemplo;

import interfaces.IControle;

/**
 *
 * @author Israel Gomes
 */
public class Controle implements IControle{
    
    private  int volumeAtual;
    private int canalAtual;
    
    public Controle() {
    }

    public Controle(int volumeAtual, int canalAtual) {
        this.volumeAtual = volumeAtual;
        this.canalAtual = canalAtual;
    }

    
    
    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    @Override
    public String aumentaVolume() {
        this.volumeAtual ++;
        return "Volume: " + this.volumeAtual;
        
    }

    @Override
    public String diminuiVolume() {
        this.volumeAtual --;
        return "Volume: " + this.volumeAtual;
    }

    @Override
    public String subirCanal() {
        this.canalAtual ++;
        return "Canal: " + this.canalAtual;
    }

    @Override
    public String diminuirCanal() {
        this.canalAtual --;
        return "Canal: " + this.canalAtual;
    }
    
    
    
}
