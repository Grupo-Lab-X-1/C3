package com.labx.GestionIngresosEgresos.controller;

import com.labx.GestionIngresosEgresos.entities.MovimientoDinero;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

@RestController
public class ControllerMovimientoDinero {
    @GetMapping("/enterprises/{id}/movements")
    public MovimientoDinero get(@PathVariable int id){
        MovimientoDinero movimientoDinero1 = new MovimientoDinero(100,"ingreso","Usuario1", LocalDate.now());
        movimientoDinero1.gestionMovimientos();
        return movimientoDinero1;
    }

    @PostMapping("/enterprises/{id}/movements")
    public MovimientoDinero post(@PathVariable int id){
        MovimientoDinero movimientoDinero2 = new MovimientoDinero(200,"ingreso","Usuario2",LocalDate.now());
        movimientoDinero2.gestionMovimientos();
        return movimientoDinero2;
    }
    @PutMapping("/enterprises/{id}/movements")
    public MovimientoDinero put(@PathVariable int id){
        MovimientoDinero movimientoDinero3 = new MovimientoDinero(300,"egreso","Usuario3",LocalDate.now());
        movimientoDinero3.gestionMovimientos();
        return movimientoDinero3;
    }
    @DeleteMapping("/enterprises/{id}/movements")
    public MovimientoDinero del(@PathVariable int id){
        MovimientoDinero movimientoDinero4 = new MovimientoDinero(400,"egreso","Usuario4",LocalDate.now());
        movimientoDinero4.gestionMovimientos();
        return movimientoDinero4;
    }
}
