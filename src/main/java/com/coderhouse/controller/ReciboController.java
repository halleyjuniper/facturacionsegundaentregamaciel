package com.coderhouse.controller;

import com.coderhouse.model.Recibo;
import com.coderhouse.service.recibo.ReciboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("coderhouse/recibos")
public class ReciboController {

    @Autowired
    ReciboService reciboService;

    @GetMapping("")
    public List<Recibo> mostrarTablaOriginal(){
        return reciboService.mostrarTodos() ;
    }

    @GetMapping("/{idrecibo}")
    public Recibo mostrarRecibo(@PathVariable int idrecibo) {
        return reciboService.mostrarRecibo(idrecibo);
    }

}
