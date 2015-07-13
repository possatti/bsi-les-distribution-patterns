package com.possatti;

import java.util.Map;

public class App {
	
	private static EnderecoFacade enderecoFacade;

	public static void main(String[] args) {
		enderecoFacade = new EnderecoFacade(new Endereco());
		
		// Envia os dados de endereço através da rede.
		enviarEndereco();
		
		// Requisita os dados de endereço.
		Map<String, String> dados = requisitarEndereco();
		
		System.out.println("Endereco Recebido: ");
		System.out.println(dados.toString());
	}

	public static Map<String, String> requisitarEndereco() {
		Map<String, String> dadosEndereco = enderecoFacade.getDadosEndereco();
		return dadosEndereco;
	}

	public static void enviarEndereco() {
		enderecoFacade.setEndereco("123465", "Brazil", "Espírito Santo",
				"Vila Velha", "Jamangá", 123);
	}
}
