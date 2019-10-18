package br.com.unipac.cliente.api.clienteapi.resources;

import java.io.Serializable;

public class Cliente implements Serializable{
	

	private static final long serialVersionUID = 1L;
	Cliente cliente;
	Long id;
	
	public Cliente(Cliente cliente, Long id) {
		super();
		this.cliente = cliente;
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	 
	public void update(Long id, Cliente cliente) {
		
		this.cliente = getCliente();
		this.id = id = getId();
	}
	
}
