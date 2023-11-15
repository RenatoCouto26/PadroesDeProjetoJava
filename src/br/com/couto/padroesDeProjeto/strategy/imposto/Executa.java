package br.com.couto.padroesDeProjeto.strategy.imposto;

import java.math.BigDecimal;

import br.com.padroesDeProjeto.Orcamento;

public class Executa {

	public static void main(String[] args) {

		CalculaImpostoContext calculaImposto = new CalculaImpostoContext();

		System.out.println("O Valor do imposto para esse orçamento é: "
				+ calculaImposto.calcular(new ICMS_Strategy(), new Orcamento(new BigDecimal("100"), 1)));

	}

}
