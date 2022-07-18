package com.coderhouse.service.producto;

import com.coderhouse.model.Producto;
import com.coderhouse.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;


    @Override
    public Producto mostrarModelo(int idprod) {
        return productoRepository.findById(idprod).orElse(null);
    }

    @Override
    public List<Producto> mostrarTodos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto nuevo(Producto producto) {
        int id = productoRepository.findAll().size()+1;
        producto.setIdprod(id);
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizar(Producto producto) {
        if (producto.getIdprod() > 0 && producto.getIdprod() <= productoRepository.findAll().size()) {
            return productoRepository.save(producto);
        }
        return null;
    }
}
