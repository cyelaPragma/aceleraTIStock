package com.acelerati.stock.infrastructure.entrypoints.restapi.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Se ejecuta por cada petición, comprueba que sea valido el token
 * Utiliza el provider para validar que sea valido
 * Si es valido permite acceso al recurso si no lanza una excepción
 */
@Component
public class JwtTokenFilter extends OncePerRequestFilter {

    private final static Logger logger = LoggerFactory.getLogger(JwtTokenFilter.class);

    @Autowired
    JwtProvider jwtProvider;


    // El token esta formado por:
     // cabecera --> Authorization: Bearer token
    //Hace las comprobaciones
    // Este metodo se hace cada vez que se le haga una peticion al sever
    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        System.out.println("Paso por doFilterInternal ");
        try{
            String token = getToken(request);

            if(token != null && jwtProvider.validateToken(token)){
                UsernamePasswordAuthenticationToken auth = null;
                String nombreUsuario = jwtProvider.getNombreUsuarioFromToken(token);
            }
        }catch (Exception e){
            logger.error("Fail en el método doFilter " + e.getMessage());
        }
        filterChain.doFilter(request, response);
    }


    //Obtenemos el token sin Bearer + el espacio
    private String getToken(HttpServletRequest request){

        String header = request.getHeader("Authorization");
        System.out.println("*** header **** " + header);
        if(header != null && header.startsWith("Bearer"))
            return header.replace("Bearer ", "");
        return null;

    }
}
