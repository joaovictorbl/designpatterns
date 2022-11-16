package br.com.designrpatterns.calculadora;

import br.com.designrpatterns.imposto.Imposto;
import br.com.designrpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
     return imposto.calcular(orcamento);
    }
}
