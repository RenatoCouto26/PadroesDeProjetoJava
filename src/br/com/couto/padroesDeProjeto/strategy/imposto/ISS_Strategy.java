		package br.com.couto.padroesDeProjeto.strategy.imposto;

import java.math.BigDecimal;

import br.com.padroesDeProjeto.Orcamento;

public class ISS_Strategy implements ImpostoStrategy {

	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}
}