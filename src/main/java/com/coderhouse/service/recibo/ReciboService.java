package com.coderhouse.service.recibo;

import com.coderhouse.model.Recibo;

import java.util.List;

public interface ReciboService {
    Recibo mostrarRecibo(int idrecibo);

    List<Recibo> mostrarTodos();
}
