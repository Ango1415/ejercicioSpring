package com.segurosbolivar.SistemaBancario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.segurosbolivar.SistemaBancario.model.Sucursal;
import com.segurosbolivar.SistemaBancario.repository.SucursalRepository;
import com.segurosbolivar.SistemaBancario.service.SucursalService;

import lombok.AllArgsConstructor;

/**
 * Clase para definir la funcionalidad de los servicios de gestión de
 *  la tabla "SUCURSALES" en BD
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
@Service
@AllArgsConstructor
public class SucursalServiceImpl implements SucursalService{
	
	@Autowired
	private SucursalRepository sucursalRepository;
	
	@Override
	public Sucursal getSucursal(long idSucursal) {
		return this.sucursalRepository.findById(idSucursal).orElse(null);
	}

	@Override
	public List<Sucursal> getSucursales() {
		return this.sucursalRepository.findAll();
	}
	
	

}
