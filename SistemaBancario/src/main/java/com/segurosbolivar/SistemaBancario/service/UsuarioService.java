package com.segurosbolivar.SistemaBancario.service;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;

import com.segurosbolivar.SistemaBancario.model.Usuario;

/**
 * Interfaz para definir los servicios de gestión de la tabla "USUARIOS" en BD
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
public interface UsuarioService {
	
	/**
	 * Servicio para consultar un usuario
	 * @param idUsuario Identificador del usuario a consultar
	 * @return Objeto de la clase Usuario
	 */
	public Usuario getUsuario(@PathVariable UUID idUsuario);
	
	/**
	 * Servicio de consulta de todos los usuarios del sistema
	 * @return Lista de objetos de clase Usuario
	 */
	public List<Usuario> getUsuarios();

}
