package com.possatti;

import java.util.HashMap;
import java.util.Map;

public class PedidoAssembler {

	public static Pedido criarObjetoDeDomínio(PedidoDTO dto) {
		// Obtém o comprador.
		String nomeComprador = dto.getNomeComprador();
		Integer idadeComprador = dto.getIdadeComprador();
		Comprador comprador = new Comprador(nomeComprador, idadeComprador);

		// Obtém os itens do pedido.
		Map<String, Integer> strPedido = dto.getItensDaCompra();
		Map<Produto, Integer> itens = new HashMap<>();
		for (String nomeProduto : strPedido.keySet()) {
			Produto produto = new Produto(nomeProduto);
			Integer quantidade = strPedido.get(nomeProduto);
			itens.put(produto, quantidade);
		}

		// Obtém o endereço de destino.
		String cep = dto.getDestinoCep();
		String pais = dto.getDestinoPais();
		String estado = dto.getDestinoEstado();
		String cidade = dto.getDestinoCidade();
		String rua = dto.getDestinoRua();
		Integer numero = dto.getDestinoNumero();
		Endereco destino = new Endereco(cep, pais, estado, cidade, rua, numero);

		return new Pedido(comprador, itens, destino);
	}

	/**
	 * Cria um DTO com todos os dados de um determinado pedido.
	 * 
	 * @param pedido
	 * @return DTO de pedido.
	 */
	public static PedidoDTO criarDTO(Pedido pedido) {
		String nomeComprador = pedido.getComprador().getNome();
		Integer idadeComprador = pedido.getComprador().getIdade();
		Map<String, Integer> itensDaCompra = new HashMap<>();
		Map<Produto, Integer> itens = pedido.getItens();
		for (Produto produto : itens.keySet()) {
			Integer quantidadeItem = itens.get(produto);
			String nomeItem = produto.getNome();
			itensDaCompra.put(nomeItem, quantidadeItem);
		}
		String destinoCep = pedido.getDestino().getCep();
		String destinoPais = pedido.getDestino().getPais();
		String destinoEstado = pedido.getDestino().getEstado();
		String destinoCidade = pedido.getDestino().getCidade();
		String destinoRua = pedido.getDestino().getRua();
		Integer destinoNumero = pedido.getDestino().getNumero();

		PedidoDTO dto = new PedidoDTO(nomeComprador, idadeComprador,
				itensDaCompra, destinoCep, destinoPais, destinoEstado,
				destinoCidade, destinoRua, destinoNumero);
		
		return dto;
	}
}
