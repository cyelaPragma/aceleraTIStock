package com.acelerati.stock.infrastructure.entrypoints.restapi.config.security.service;

import com.acelerati.stock.infrastructure.entrypoints.restapi.config.security.entity.Rol;
import com.acelerati.stock.infrastructure.entrypoints.restapi.config.security.enums.RolNombre;
import com.acelerati.stock.infrastructure.entrypoints.restapi.config.security.repository.RolRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class RolService {

    final RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return  rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
