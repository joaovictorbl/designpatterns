package br.com.designrpatterns;

import br.com.designrpatterns.desconto.CalculadoraDesconto;
import br.com.designrpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestandoDesconto {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("1000") , 2);
        Orcamento orcamentoSegundo = new Orcamento(new BigDecimal("500") , 6);
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        System.out.printf("Calculando descontos " + calculadora.calculadoraDeDescontos(orcamento));
        System.out.printf("\nCalculando descontos " + calculadora.calculadoraDeDescontos(orcamentoSegundo));

    }
}
