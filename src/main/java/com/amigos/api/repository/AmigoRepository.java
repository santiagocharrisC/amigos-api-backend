package com.amigos.api.repository;

import com.amigos.api.model.Amigo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmigoRepository extends JpaRepository<Amigo, Long> {
}