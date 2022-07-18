package com.coderhouse.service.client;

import com.coderhouse.dto.ClienteDto;
import com.coderhouse.repository.ClienteRepository;
import com.coderhouse.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    Cliente cliente;
    int edad;
    List<Cliente> copialista;
    List<ClienteDto> listaamostar = new ArrayList<>();


    //implementacion de metodos
    @Override
    public List<Cliente> mostrarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente mostrarID(int idclient) {
        return clienteRepository.findById(idclient).orElse(null);
    }

    @Override
    public List<ClienteDto> mostrarListaEdad() {
        copialista=clienteRepository.findAll();
        int finalLista = copialista.size();
        for(int i=0;i<finalLista;i++){
            cliente=copialista.get(i);
            edad=cacularedad(cliente);
            ClienteDto clienteamostrar = new ClienteDto(cliente.getIdclient(), cliente.getNombre(), cliente.getApellido(), edad);
            listaamostar.add(clienteamostrar);
        }
        return listaamostar;
    }

    private int cacularedad(Cliente cliente) {
        Date fecha = cliente.getFecha();
        String fechaString = fecha.toString();
        int aaaa = Integer.parseInt(fechaString.substring(0,4));
        int mm = Integer.parseInt(fechaString.substring(5,7));
        int dd = Integer.parseInt(fechaString.substring(8,10));
        int edad = Period.between(LocalDate.of(aaaa,mm,dd),LocalDate.now()).getYears();
        return edad;
    }

    @Override
    public Cliente nuevo(Cliente cliente) {
        int id = clienteRepository.findAll().size()+1;
        cliente.setIdclient(id);
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        if (cliente.getIdclient() > 0 && cliente.getIdclient() <= clienteRepository.findAll().size()) {
            return clienteRepository.save(cliente);
        }
        return null;
    }


}
