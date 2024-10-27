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
public class Aquisicao extends Despesa{
    private double valorUnitario;
    private Integer quantidadeItens;

    public Aquisicao(String descricao, double valorUnitario, Integer quantidadeItens) {
        super(descricao);
        this.valorUnitario = valorUnitario;
        this.quantidadeItens = quantidadeItens;
    }
    
    
    @Override
    public double calcularCusto() {
        return this.valorUnitario*this.quantidadeItens;
    }

    /**
     * @return the valorUnitario
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    /**
     * @return the quantidadeItens
     */
    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    /**
     * @param quantidadeItens the quantidadeItens to set
     */
    public void setQuantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }
    
}
