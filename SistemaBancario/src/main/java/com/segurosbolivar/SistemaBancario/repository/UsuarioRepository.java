package com.segurosbolivar.SistemaBancario.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.segurosbolivar.SistemaBancario.model.Usuario;

/**
 * Interfaz encargada de definir el gestor de persistencia, tanto JPA 
 * como JDBC para la gestión de la tabla "USUARIOS" en BD
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,UUID>{

}
