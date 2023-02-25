package com.acelerati.stock.infrastructure.entrypoints.restapi.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Comprueba si existe un token si no devuelve un 401 no autorizado
 */
@Component
public class JwtEntryPoint implements HandlerInterceptor {

    // Implementamos un logger para ver cual metodo da error en caso de falla
    private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Ingreso por acá: preHandle");
        String token = request.getHeader("Authorization");
        if ((token).isBlank()){
            throw new RuntimeException();
        }
        return true;
    }
}
