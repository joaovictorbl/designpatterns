package br.com.designrpatterns.imposto;

import br.com.designrpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto{
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
