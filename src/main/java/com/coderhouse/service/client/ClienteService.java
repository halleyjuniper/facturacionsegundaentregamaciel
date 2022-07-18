package com.coderhouse.service.client;

import com.coderhouse.dto.ClienteDto;
import com.coderhouse.model.Cliente;

import java.util.List;


// interfaz
public interface ClienteService {

    List<Cliente> mostrarTodos();

    Cliente mostrarID(int idclient);

    List<ClienteDto>mostrarListaEdad();

    Cliente nuevo(Cliente cliente);

    Cliente actualizar(Cliente cliente);
}
