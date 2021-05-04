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
public class Livro extends Produto {
    private String autor;
    private int paginas;

    public Livro() {
    }

    public Livro(String autor, int paginas, String nome, float preco) {
        super(nome, preco);
        this.autor = autor;
        this.paginas = paginas;
    }

    public String ler(){
       return "Sendo lido...";
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    
    
    
}
