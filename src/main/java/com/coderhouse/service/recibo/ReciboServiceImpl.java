package com.coderhouse.service.recibo;

import com.coderhouse.model.Recibo;
import com.coderhouse.repository.ReciboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReciboServiceImpl implements ReciboService {

    @Autowired
    ReciboRepository reciboRepository;

    @Override
    public Recibo mostrarRecibo(int idrecibo) {
        return reciboRepository.findById(idrecibo).orElse(null);
    }

    @Override
    public List<Recibo> mostrarTodos() {
        return reciboRepository.findAll();
    }
}
