package com.fernando_grespam.usuario.infrastructure.repository;

import com.fernando.aprendendo_spring.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository <Telefone, Long>{
}
