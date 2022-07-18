package com.coderhouse.service.producto;

import com.coderhouse.model.Producto;

import java.util.List;

public interface ProductoService {

    Producto mostrarModelo(int idprod);

    List<Producto> mostrarTodos();

    Producto nuevo(Producto producto);

    Producto actualizar(Producto producto);
}
