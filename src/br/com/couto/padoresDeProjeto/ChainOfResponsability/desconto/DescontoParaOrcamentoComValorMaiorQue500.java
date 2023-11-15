	package br.com.couto.padoresDeProjeto.ChainOfResponsability.desconto;

import java.math.BigDecimal;

import br.com.padroesDeProjeto.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQue500 {

	public BigDecimal calcular(Orcamento orcamento) {
		
		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.05")); 
		} else
			
		return BigDecimal.ZERO;
		
	}
}
