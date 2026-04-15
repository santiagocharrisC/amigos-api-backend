package com.amigos.api.service;

import com.amigos.api.model.Amigo;
import com.amigos.api.repository.AmigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AmigoService {

    @Autowired
    private AmigoRepository repo;

    public List<Amigo> listar() {
        return repo.findAll();
    }

    public Amigo guardar(Amigo amigo) {
        return repo.save(amigo);
    }

    public Amigo actualizar(Long id, Amigo nuevo) {
        Amigo existente = repo.findById(id).orElse(null);
        if (existente != null) {
            existente.setNombre(nuevo.getNombre());
            existente.setTelefono(nuevo.getTelefono());
            return repo.save(existente);
        }
        return null;
    }

    public void eliminar(Long id) {
    	repo.deleteById(id);
    }
}