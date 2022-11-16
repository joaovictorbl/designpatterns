package br.com.designrpatterns.desconto;

import br.com.designrpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calculadoraDeDescontos(Orcamento orcamento) {
       Desconto desconto = new DescontoMaiorQuientos(
                new DescontoMaiorCincoItems(
                        new SemDesconto()));
        return desconto.efetuarCalculo(orcamento);
    }
}
