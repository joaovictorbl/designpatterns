package br.com.designrpatterns.desconto;

import br.com.designrpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaiorQuientos extends Desconto{

    public DescontoMaiorQuientos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
            return orcamento.getValor().multiply(new BigDecimal("0.15"));

    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
