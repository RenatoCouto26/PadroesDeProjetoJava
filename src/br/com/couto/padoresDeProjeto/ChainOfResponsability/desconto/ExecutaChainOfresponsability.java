package br.com.couto.padoresDeProjeto.ChainOfResponsability.desconto;

import java.math.BigDecimal;

import br.com.padroesDeProjeto.Orcamento;

public class ExecutaChainOfresponsability {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 4); 
		DescontoParaOrcamentoComMaisDeCincoItens desconto = new DescontoParaOrcamentoComMaisDeCincoItens();
		
		System.out.println(desconto.calcular(orcamento));
		
	}

}
