package com.coderhouse.controller;

import com.coderhouse.model.Producto;
import com.coderhouse.service.producto.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("coderhouse/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping("")
    public List<Producto> mostrarTablaOriginal(){
        return productoService.mostrarTodos() ;
    }

    @GetMapping("/{idprod}")
    public Producto mostrarModelo(@PathVariable int idprod) {
        return productoService.mostrarModelo(idprod);
    }

    @PostMapping("/nuevo")
    public Producto nuevoProducto(@RequestBody Producto producto) {
        return productoService.nuevo(producto);
    }

    @PostMapping("/actualizar")
    public Producto actualizarproducto(@RequestBody Producto producto) {
        return productoService.actualizar(producto);
    }

}
