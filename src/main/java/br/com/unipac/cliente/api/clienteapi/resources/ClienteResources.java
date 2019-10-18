package br.com.unipac.cliente.api.clienteapi.resources;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class ClienteResources {
	
	@RestController
	@RequestMapping(path = "/clientes")
	public class ClienteReources {
	
		@Autowired
		private ClienteDAO dao;
		@SuppressWarnings("deprecation")
		@RequestMapping(method = RequestMethod.GET,
		produces = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
		@ResponseBody
		public ResponseEntity<List> listaTodos() {
		List clientes = (List) dao.listarTodos();
		return new ResponseEntity<List>(clientes, HttpStatus.OK);
		}
		@RequestMapping(method = RequestMethod.POST,
				consumes = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE,
				produces = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
		@ResponseBody
		public ResponseEntity<Boolean> salvar(@RequestBody Cliente cliente) {
		boolean resultado = dao.salvar(cliente);
		return new ResponseEntity<Boolean>(resultado, HttpStatus.CREATED);
		}
		@RequestMapping(path="/{id}", method = RequestMethod.PUT,
				consumes = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE,
				produces = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
				@ResponseBody
				public ResponseEntity<Boolean> alterar(@PathParam(value = "id") Long id,
				@RequestBody Cliente cliente) {
				boolean resultado = dao.alterar(id, cliente);
				return new ResponseEntity<Boolean>(resultado, HttpStatus.OK);
				}
				@RequestMapping(path="/{id}", method = RequestMethod.DELETE,
				consumes = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE,
				produces = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
				@ResponseBody
				public ResponseEntity<Boolean> deletar(@PathParam(value = "id") Long id, @RequestBody
				Cliente cliente) {
				boolean resultado = dao.removerPorId(cliente);
				return new ResponseEntity<Boolean>(resultado, HttpStatus.OK);
				}
				}
	
}
