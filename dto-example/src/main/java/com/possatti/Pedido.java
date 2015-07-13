package com.possatti;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
	
	Comprador comprador;
	Map<Produto, Integer> itens;
	Endereco destino;

	public Pedido(Comprador comprador, Map<Produto, Integer> itens,
			Endereco destino) {
		this.comprador = comprador;
		this.itens = itens;
		this.destino = destino;
	}
	public Comprador getComprador() {
		return comprador;
	}
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}
	public Map<Produto, Integer> getItens() {
		return itens;
	}
	public void setItens(Map<Produto, Integer> itens) {
		this.itens = itens;
	}
	public Endereco getDestino() {
		return destino;
	}
	public void setDestino(Endereco destino) {
		this.destino = destino;
	}

}
