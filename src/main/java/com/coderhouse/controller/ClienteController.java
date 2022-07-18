package com.coderhouse.controller;

import com.coderhouse.dto.ClienteDto;
import com.coderhouse.model.Cliente;
import com.coderhouse.service.client.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// rutas URL
@RestController
@RequestMapping("coderhouse/clientes")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @GetMapping("")
    public List<Cliente> mostrarTablaOriginal(){
        return clienteService.mostrarTodos() ;
    }

    @GetMapping("/{idclient}")
    public Cliente mostrarID(@PathVariable int idclient){
        return clienteService.mostrarID(idclient);
    }

    @GetMapping("/edad")
    public List<ClienteDto>mostrarTablaEdad(){

        return clienteService.mostrarListaEdad();
    }

    @PostMapping("/nuevo")
    public Cliente nuevoCliente(@RequestBody Cliente cliente) {
        return clienteService.nuevo(cliente);
    }

    @PostMapping("/actualizar")
    public Cliente actualizarCliente(@RequestBody Cliente cliente) {
        return clienteService.actualizar(cliente);
    }

}
