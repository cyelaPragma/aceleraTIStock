package com.acelerati.stock.infrastructure.entrypoints.restapi.config.security.repository;

import com.acelerati.stock.infrastructure.entrypoints.restapi.config.security.entity.Rol;
import com.acelerati.stock.infrastructure.entrypoints.restapi.config.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}