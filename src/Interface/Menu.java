package Interface;

import dominio.Despesa;
import dominio.Projeto;
import static dominio.Projeto.adicionarDespesa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author João Victor
 */
public class Menu {
    
    /**
     *
     */
    public void exec(){
        System.out.println("Escreva o nome do projeto: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        
        System.out.println("Escreva a data de inicio do projeto: ");
        String dataInicio = scanner.nextLine();
     
        System.out.println("Escreva a data do fim do projeto: ");
        String dataFim = scanner.nextLine();
        
        System.out.println("Escreva a margem de lucro: ");
        String margemLucro = scanner.nextLine();
        double margem = Double.parseDouble(margemLucro);
        
        List<Despesa> despesas = new ArrayList<>();

        Projeto projeto = new Projeto(nome, dataInicio, dataFim, margem, despesas);
        
        
        char fim;
        do {
            System.out.println("Qual despesa adicionar: (A) Aquisicao (M) Mao de obra. ");
            String tipo = scanner.nextLine();
            tipo = tipo.toUpperCase();
            char b = tipo.charAt(0);
            
            switch (b){
                case 'A' :
                        System.out.println("Escreva a descricao da despesa: ");
                        String desc = scanner.nextLine();
                
                        System.out.println("Escreva o valor unitario do produto:  ");
                        String valorUnitario = scanner.nextLine();
                        Double valor = Double.valueOf(valorUnitario);
                
                        System.out.println("Escreva a quantidade de produtos: ");
                        String quantidadeItens = scanner.nextLine();
                        Integer qtd = Integer.valueOf(quantidadeItens);
                
                        adicionarDespesa(desc, valor, qtd, despesas);
                        
                        break;
                        
                case 'M':
                        System.out.println("Escreva a descricao da despesa: ");
                        desc = scanner.nextLine();
                
                        System.out.println("Escreva a quantidade de horas: ");
                        String quantidadeHoras = scanner.nextLine();
                        Integer horas = Integer.valueOf(quantidadeHoras);
                
                        System.out.println("Qual a dificuldade: (F) Facil (M) Medio (D) Dificil. ");
                        String dificuldade = scanner.nextLine();
                        dificuldade = dificuldade.toUpperCase();
                        char df = dificuldade.charAt(0);
                
                        if('D' != df && 'F' != df && 'M' != df) {
                            System.out.println("Dificuldade errada!");
                        } else {
                            adicionarDespesa(desc, horas, df, despesas);
                           }
                        break;
                        
                    
                default: 
                        System.out.println("Valor errado");
                        break;

            }

            
            System.out.println("Deseja inserir uma nova despesa: (S) Sim (N) Nao ");
            String loop = scanner.nextLine();
            loop = loop.toUpperCase();
            fim = loop.charAt(0);
            
        } while(fim != 'N');
        
        double custoTotal = Projeto.calcularCustoTotal(despesas);
        double precoFinal = Projeto.calcularPrecoFinal(custoTotal, projeto);
        
        System.out.println("Custo da obra: "+custoTotal );
        System.out.println("Preco final: "+ precoFinal);
        
    }
}
