package br.com.couto.padroesDeProjeto.strategy.imposto;

import java.math.BigDecimal;

import br.com.padroesDeProjeto.Orcamento;

//Essa classe atua como contexto do modelo Strategy

public class CalculaImpostoContext {
	
	public BigDecimal calcular (ImpostoStrategy imposto, Orcamento orcamento) {
		return imposto.calcular(orcamento);
	
	}

}
