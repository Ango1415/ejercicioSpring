package com.segurosbolivar.SistemaBancario.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.segurosbolivar.SistemaBancario.api.UsuarioAPI;
import com.segurosbolivar.SistemaBancario.model.Usuario;
import com.segurosbolivar.SistemaBancario.service.UsuarioService;

import lombok.AllArgsConstructor;

/**
 * Clase Controlador REST encargada de comunicar los endpoints de API
 * de la entidad "Usuario" con los servicios definidos en el sistema para la tabla
 * "USUARIOS"
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
@RestController
@AllArgsConstructor
public class UsuarioController implements UsuarioAPI{
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public Usuario getUsuario(UUID idUsuario) {
		return this.usuarioService.getUsuario(idUsuario);
	}

	@Override
	public List<Usuario> getUsuarios() {
		return this.usuarioService.getUsuarios();
	}

}
