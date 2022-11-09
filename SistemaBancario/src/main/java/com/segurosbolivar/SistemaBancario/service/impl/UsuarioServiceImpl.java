package com.segurosbolivar.SistemaBancario.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.segurosbolivar.SistemaBancario.model.Usuario;
import com.segurosbolivar.SistemaBancario.repository.UsuarioRepository;
import com.segurosbolivar.SistemaBancario.service.UsuarioService;

import lombok.AllArgsConstructor;

/**
 * Clase para definir la funcionalidad de los servicios de gestión de
 *  la tabla "USUARIOS" en BD
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository; 
	
	@Override
	public Usuario getUsuario(UUID idUsuario) {
		
		return this.usuarioRepository.findById(idUsuario).orElse(null);
	}


	@Override
	public List<Usuario> getUsuarios() {
		
		return this.usuarioRepository.findAll();
	}	

}
