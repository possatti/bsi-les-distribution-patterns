package com.possatti;

import java.util.HashMap;
import java.util.Map;

public class EnderecoFacade {
	
	private Endereco enderecoAtual;
	
	public EnderecoFacade(Endereco enderecoAtual) {
		this.enderecoAtual = enderecoAtual;
	}

	public Map<String, String> getDadosEndereco() {
		HashMap<String, String> dados = new HashMap<String, String>();

		dados.put("cep", enderecoAtual.getCep());
		dados.put("pais", enderecoAtual.getPais());
		dados.put("estado", enderecoAtual.getEstado());
		dados.put("cidade", enderecoAtual.getCidade());
		dados.put("rua", enderecoAtual.getRua());
		dados.put("numero", enderecoAtual.getNumero().toString());
		
		return dados;
	}
	
	public void setEndereco(String cep, String pais, String estado, String cidade, String rua, Integer numero) {
		enderecoAtual.setCep(cep);
		enderecoAtual.setPais(pais);
		enderecoAtual.setEstado(estado);
		enderecoAtual.setCidade(cidade);
		enderecoAtual.setRua(rua);
		enderecoAtual.setNumero(numero);
	}

}
