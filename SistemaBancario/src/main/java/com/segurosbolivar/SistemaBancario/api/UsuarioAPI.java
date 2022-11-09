package com.segurosbolivar.SistemaBancario.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.segurosbolivar.SistemaBancario.model.Usuario;

/**
 * Interfaz para definir los endpoints que se podrán consumir para la gestión 
 * de la tabla "USUARIOS" en BD
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
@RequestMapping("/usuario")
public interface UsuarioAPI {
	
	/**
	 * Endpoint para consumir el servicio de consultar un usuario
	 * @param idUsuario Identificador del usuario a consultar
	 * @return Objeto de la clase Usuario
	 */
	@GetMapping({"/{idUsuario}"})
	public Usuario getUsuario(@PathVariable UUID idUsuario);
	
	
	/**
	 * Endpoint para consumir el servicio de consulta de todos los
	 * usuarios del sistema
	 * @return Lista de objetos de clase Usuario
	 */
	@GetMapping()
	public List<Usuario> getUsuarios();
}
