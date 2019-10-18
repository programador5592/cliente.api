package br.com.unipac.cliente.api.clienteapi.resources;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteDAOImpl implements ClienteDAO{
	
List<Cliente> clientes = new ArrayList<>();

@Override
public boolean salvar(Cliente cliente) {
return clientes.add(cliente);
}

@Override
public boolean alterar(Long id, Cliente cliente) {
cliente.update(id, cliente);
return clientes.add(cliente);
}

@Override
public List<Cliente> listarTodos() {
return clientes;
}

@Override
public boolean buscarPorId(Cliente cliente) {
return clientes.contains(cliente);
}

@Override
public boolean removerPorId(Cliente cliente) {
return clientes.remove(cliente);
}

}
