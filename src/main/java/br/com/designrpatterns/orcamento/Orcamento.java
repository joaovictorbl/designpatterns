package br.com.designrpatterns.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    public BigDecimal valor;
    public int quantidadeDeitems;


    public Orcamento(BigDecimal valor, int quantidadeDeitems){
        this.valor = valor;
        this.quantidadeDeitems = quantidadeDeitems;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQuantidadeDeitems() {
        return quantidadeDeitems;
    }

    public void setQuantidadeDeitems(int quantidadeDeitems) {
        this.quantidadeDeitems = quantidadeDeitems;
    }
}
