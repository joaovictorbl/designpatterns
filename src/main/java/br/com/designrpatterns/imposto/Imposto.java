package br.com.designrpatterns.imposto;

import br.com.designrpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}
