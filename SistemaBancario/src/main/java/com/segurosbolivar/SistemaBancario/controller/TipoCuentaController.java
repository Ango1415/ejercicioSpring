package com.segurosbolivar.SistemaBancario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.segurosbolivar.SistemaBancario.api.TipoCuentaAPI;
import com.segurosbolivar.SistemaBancario.model.TipoCuenta;
import com.segurosbolivar.SistemaBancario.service.TipoCuentaService;

import lombok.AllArgsConstructor;

/**
 * Clase Controlador REST encargada de comunicar los endpoints de API
 * de la entidad "TipoCuenta" con los servicios definidos en el sistema para la tabla
 * "TIPOS_CUENTA"
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
@RestController
@AllArgsConstructor
public class TipoCuentaController implements TipoCuentaAPI{
	
	@Autowired
	private TipoCuentaService tipoCuentaService;
	
	@Override
	public TipoCuenta getTipoCuenta(String idTipoCuenta) {
		return this.tipoCuentaService.getTipoCuenta(idTipoCuenta);
	}

	@Override
	public List<TipoCuenta> getTiposCuenta() {
		return this.tipoCuentaService.getTiposCuenta();
	}

}
