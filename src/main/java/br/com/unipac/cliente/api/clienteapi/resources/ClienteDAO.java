package br.com.unipac.cliente.api.clienteapi.resources;

public interface ClienteDAO {

	boolean salvar(Cliente cliente);
	boolean alterar(Long id, Cliente cliente);
	java.util.List<Cliente> listarTodos();
	boolean buscarPorId(Cliente cliente);
	boolean removerPorId(Cliente cliente);
	}


