package com.segurosbolivar.SistemaBancario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.segurosbolivar.SistemaBancario.model.TipoCuenta;

/**
 * Interfaz encargada de definir el gestor de persistencia, tanto JPA 
 * como JDBC para la gestion de la tabla "TIPO_CUENTA" en BD
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
@Repository
public interface TipoCuentaRepository extends JpaRepository<TipoCuenta, String>{

}
