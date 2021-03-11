package com.example.ordemdeservicos.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ordemdeservicos.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> Listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("joao henrique");
		cliente1.setTelefone("11 95928-4227");
		cliente1.setEmail("joao@hotmail.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("maria jose");
		cliente2.setTelefone("11 91234-1234");
		cliente2.setEmail("maria@hotmail.com");
		
		return Arrays.asList(cliente1,cliente2);
	}

}
