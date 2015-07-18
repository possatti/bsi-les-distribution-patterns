package com.possatti;

public class Endereco {

	private String cep;
	private String pais;
	private String estado;
	private String cidade;
	private String rua;
	private Integer numero;

	public Endereco(String cep, String pais, String estado, String cidade,
			String rua, Integer numero) {
		super();
		this.cep = cep;
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", pais=" + pais + ", estado=" + estado
				+ ", cidade=" + cidade + ", rua=" + rua + ", numero=" + numero
				+ "]";
	}

}
