package com.segurosbolivar.SistemaBancario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.segurosbolivar.SistemaBancario.model.TipoCuenta;
import com.segurosbolivar.SistemaBancario.repository.TipoCuentaRepository;
import com.segurosbolivar.SistemaBancario.service.TipoCuentaService;

import lombok.AllArgsConstructor;

/**
 * Clase para definir la funcionalidad de los servicios de gestión de 
 * la tabla "TIPOS_CUENTA" en BD
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
@Service
@AllArgsConstructor
public class TipoCuentaServiceImpl implements TipoCuentaService{
	
	@Autowired
	private TipoCuentaRepository tipoCuentaRepository;

	@Override
	public TipoCuenta getTipoCuenta(String idTipoCuenta) {
		return this.tipoCuentaRepository.findById(idTipoCuenta).orElse(null);
	}

	@Override
	public List<TipoCuenta> getTiposCuenta() {
		return this.tipoCuentaRepository.findAll();
	}

}
