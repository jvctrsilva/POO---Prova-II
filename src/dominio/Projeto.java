/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.List;


/**
 *
 * @author 8131392
 */
public class Projeto {
    private String nome;
    private String dataInicio;
    private String dataFim;
    private double margemLucro;
    public List<Despesa> listaDespesas;
    
    public Projeto(String nome, String dataInicio, String dataFim, double margemLucro, List<Despesa> listaDespesas){
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.margemLucro = margemLucro;
        this.listaDespesas = listaDespesas;
    }
    
    public static void adicionarDespesa(String descricao, Integer qtdeHoras, char dificuldade, List<Despesa> listaDespesas) {
        Despesa despesa = new maoObra(descricao, qtdeHoras, dificuldade);
        listaDespesas.add(despesa);
    }
    
    public static void adicionarDespesa(String descricao, double valorUnitario, Integer qtdItens, List<Despesa> listaDespesas) {
        Despesa despesa = new Aquisicao(descricao, valorUnitario, qtdItens);
        listaDespesas.add(despesa);
    }
    
    public static double calcularCustoTotal(List<Despesa> listaDespesas){
        double custoTotal = 0;
        
        for(Despesa despesa: listaDespesas){
            custoTotal += despesa.calcularCusto();
        }
        return custoTotal;
    }
    
    public static double calcularPrecoFinal(double custoTotal, Projeto projeto){
        return calcularCustoTotal(projeto.listaDespesas) + (calcularCustoTotal(projeto.listaDespesas) * (projeto.getMargemLucro() / 100));
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataInicio
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataFim
     */
    public String getDataFim() {
        return dataFim;
    }

    /**
     * @param dataFim the dataFim to set
     */
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * @return the margemLucro
     */
    public double getMargemLucro() {
        return margemLucro;
    }

    /**
     * @param margemLucro the margemLucro to set
     */
    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }
}
