package com.amigos.api.controller;

import com.amigos.api.model.Amigo;
import com.amigos.api.service.AmigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/amigos")
@CrossOrigin(origins = "*")
public class AmigoController {

    @Autowired
    private AmigoService service;

    @GetMapping
    public List<Amigo> listar() {
        return service.listar();
    }

    @PostMapping
    public Amigo crear(@RequestBody Amigo amigo) {
        return service.guardar(amigo);
    }

    @PutMapping("/{id}")
    public Amigo actualizar(@PathVariable Long id, @RequestBody Amigo amigo) {
        return service.actualizar(id, amigo);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}