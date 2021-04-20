package classes;

/**
 *
 * @author Israel Gomes
 */
public class Carro {
        
        int qtdPortas;
        String cor, marca, modelo;
        int velocidade;
        
        public Carro(int qtdPortas, String cor, String marca, String modelo, int velocidade){
                this.qtdPortas = qtdPortas;
                this.cor = cor;
                this.marca = marca;
                this.modelo = modelo;
                this.velocidade = velocidade;
        }
        
        public Carro(){}
        
        
        public String exibeValores(){
            return "Carro: " + this.modelo + "\nMarca: " + this.marca + "\nCor: " 
                    + this.cor + "\nQuantidade de Portas:" + this.qtdPortas + "\nVelocidade: " + this.velocidade;
        }
        
        
        public void acelerar(int km){
            
            this.velocidade += km;
            
            if(this.velocidade >100){
                System.out.println("Velocidade máxima atingida.");
                this.velocidade =100;
            }
            
            
        }
        
        public int exibeVelocidade(){
            return this.velocidade;
        }
}
