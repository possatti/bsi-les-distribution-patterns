package com.possatti;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class App {

	public static void main(String[] args) throws Exception {
		// Instancia alguns objetos do modelo.
		Comprador fulano = new Comprador("Fulano da Silva", 19);
		Produto atari = new Produto("Atari");
		Produto xbox = new Produto("Xbox One");
		Produto ps4 = new Produto("PS4");
		Endereco endereco = new Endereco("12345-040", "Brazil", "ES", "Vitória", "Jaguati", 22);
		
		// Cria o pedido do fulano.
		Pedido pedido = new Pedido();
		pedido.setComprador(fulano);
		pedido.setDestino(endereco);
		pedido.adicionarItem(atari, 2);
		pedido.adicionarItem(xbox, 3);
		pedido.adicionarItem(ps4, 10);

		// Exibe os dados do pedido antes de enviá-lo pela rede.
		System.out.println(" >> Dados do pedido antes de ser enviado pela rede:");
		System.out.println(pedido);

		// Monta do DTO usando o Assembler.
		PedidoDTO dto = PedidoAssembler.criarDTO(pedido);

		// *Finje* que passa o objeto pela rede, serializando-o e deserializando-o.
		PipedOutputStream pipo = new PipedOutputStream();
		PipedInputStream pipin = new PipedInputStream(pipo);
		ObjectOutputStream objectOut = new ObjectOutputStream(pipo);
		ObjectInputStream objectIn = new ObjectInputStream(pipin);
		objectOut.writeObject(dto);
		PedidoDTO dtoRecebido = (PedidoDTO) objectIn.readObject();
		objectIn.close();
		objectOut.close();
		pipo.close();
		pipin.close();

		// Após receber o DTO, montamos de volta os objetos do domínio.
		Pedido pedidoRecebido = PedidoAssembler.criarObjetoDeDomínio(dtoRecebido);
		System.out.println();
		System.out.println(" >> Dados do pedido após ser enviado pela rede:");
		System.out.println(pedidoRecebido);
	}

}
