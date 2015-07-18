package com.possatti;

import java.io.Serializable;
import java.util.Map;

public class PedidoDTO implements Serializable {

	private static final long serialVersionUID = 840356347388610177L;

	private String nomeComprador;
	private Integer idadeComprador;
	private Map<String, Integer> itensDaCompra;
	private String destinoCep;
	private String destinoPais;
	private String destinoEstado;
	private String destinoCidade;
	private String destinoRua;
	private Integer destinoNumero;

	public PedidoDTO() {}

	public PedidoDTO(String nomeComprador, Integer idadeComprador,
			Map<String, Integer> itensDaCompra, String destinoCep,
			String destinoPais, String destinoEstado, String destinoCidade,
			String destinoRua, Integer destinoNumero) {
		this.nomeComprador = nomeComprador;
		this.idadeComprador = idadeComprador;
		this.itensDaCompra = itensDaCompra;
		this.destinoCep = destinoCep;
		this.destinoPais = destinoPais;
		this.destinoEstado = destinoEstado;
		this.destinoCidade = destinoCidade;
		this.destinoRua = destinoRua;
		this.destinoNumero = destinoNumero;
	}

	public String getNomeComprador() {
		return nomeComprador;
	}

	public void setNomeComprador(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}

	public Integer getIdadeComprador() {
		return idadeComprador;
	}

	public void setIdadeComprador(Integer idadeComprador) {
		this.idadeComprador = idadeComprador;
	}

	public Map<String, Integer> getItensDaCompra() {
		return itensDaCompra;
	}

	public void setItensDaCompra(Map<String, Integer> itensDaCompra) {
		this.itensDaCompra = itensDaCompra;
	}

	public String getDestinoCep() {
		return destinoCep;
	}

	public void setDestinoCep(String destinoCep) {
		this.destinoCep = destinoCep;
	}

	public String getDestinoPais() {
		return destinoPais;
	}

	public void setDestinoPais(String destinoPais) {
		this.destinoPais = destinoPais;
	}

	public String getDestinoEstado() {
		return destinoEstado;
	}

	public void setDestinoEstado(String destinoEstado) {
		this.destinoEstado = destinoEstado;
	}

	public String getDestinoCidade() {
		return destinoCidade;
	}

	public void setDestinoCidade(String destinoCidade) {
		this.destinoCidade = destinoCidade;
	}

	public String getDestinoRua() {
		return destinoRua;
	}

	public void setDestinoRua(String destinoRua) {
		this.destinoRua = destinoRua;
	}

	public Integer getDestinoNumero() {
		return destinoNumero;
	}

	public void setDestinoNumero(Integer destinoNumero) {
		this.destinoNumero = destinoNumero;
	}

}
