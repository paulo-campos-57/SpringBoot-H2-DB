package com.cliente.cliente.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cliente.cliente.models.Cliente;

@Repository
public class ClienteDAO {

	private static List<Cliente> clientes = new ArrayList<Cliente>();

	public Cliente findById(Long id) {
		Cliente cli = null;
		for (Cliente cliente : clientes) {
			if (cliente.getId() == id) {
				cli = cliente;
			}
		}
		return cli;
	}

	public List<Cliente> findAll() {
		return clientes;
	}

	public Cliente Inserir(Cliente cliente) {
		clientes.add(cliente);
		return cliente;
	}
}
