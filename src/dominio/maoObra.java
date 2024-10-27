/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author 8131392
 */
public class maoObra extends Despesa{
    private Integer quantidadeHoras;
    private char dificuldade;
    
    public maoObra(String descricao, Integer quantidadeHoras, char dificuldade) {
        super(descricao);
        this.quantidadeHoras = quantidadeHoras;
        this.dificuldade = dificuldade;
    }

    @Override
    public double calcularCusto() {
        
        if ( this.dificuldade == 'F' ){
            return this.quantidadeHoras*10;
        }
        if ( this.dificuldade == 'M' ){
            return this.quantidadeHoras*25;
        }
        if ( this.dificuldade == 'D' ){
            return this.quantidadeHoras*50;
        }
        return 0;
    }
    
}
