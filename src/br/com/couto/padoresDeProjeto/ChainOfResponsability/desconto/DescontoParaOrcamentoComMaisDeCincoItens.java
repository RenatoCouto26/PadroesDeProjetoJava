package br.com.couto.padoresDeProjeto.ChainOfResponsability.desconto;

import java.math.BigDecimal;

import br.com.padroesDeProjeto.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens {

	public BigDecimal calcular(Orcamento orcamento) {
		
		if (orcamento.getQuantidadeDeItens() >= 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1")); 
		}
			
		return BigDecimal.ZERO;
		
	}
}
