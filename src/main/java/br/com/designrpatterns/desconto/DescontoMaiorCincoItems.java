package br.com.designrpatterns.desconto;

import br.com.designrpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaiorCincoItems extends Desconto{


    public DescontoMaiorCincoItems(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
            return orcamento.getValor().multiply(new BigDecimal("0.2"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeDeitems() > 5;
    }
}
