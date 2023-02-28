package com.acelerati.stock.infrastructure.entrypoints.restapi.config.security.utils;

import com.acelerati.stock.infrastructure.entrypoints.restapi.config.security.entity.Rol;
import com.acelerati.stock.infrastructure.entrypoints.restapi.config.security.enums.RolNombre;
import com.acelerati.stock.infrastructure.entrypoints.restapi.config.security.service.RolService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class CreateRoles implements CommandLineRunner {
    final RolService rolService;

    @Override
    public void run(String... args) throws Exception {
        /*
        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
         */
    }
}
