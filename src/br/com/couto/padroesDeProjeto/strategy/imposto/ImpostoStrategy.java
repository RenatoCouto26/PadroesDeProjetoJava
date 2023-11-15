package br.com.couto.padroesDeProjeto.strategy.imposto;

import java.math.BigDecimal;

import br.com.padroesDeProjeto.Orcamento;

public interface ImpostoStrategy {

	BigDecimal calcular(Orcamento orcamento);

}
