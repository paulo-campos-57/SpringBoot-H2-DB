package com.cliente.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cliente.cliente.dao.ClienteDAO;
import com.cliente.cliente.models.Cliente;

@Service
public class ClienteService {

	@Autowired
	ClienteDAO dao;

	public Cliente findById(Long id) {
		return dao.findById(id);
	}

	public List<Cliente> findAll() {
		return dao.findAll();
	}

	public Cliente insert(Cliente cliente) {
		return dao.Inserir(cliente);
	}
}
