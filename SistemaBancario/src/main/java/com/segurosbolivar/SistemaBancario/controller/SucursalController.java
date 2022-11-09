package com.segurosbolivar.SistemaBancario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.segurosbolivar.SistemaBancario.api.SucursalAPI;
import com.segurosbolivar.SistemaBancario.model.Sucursal;
import com.segurosbolivar.SistemaBancario.service.SucursalService;

import lombok.AllArgsConstructor;

/**
 * Clase Controlador REST encargada de comunicar los endpoints de API
 * de la entidad "Sucursal" con los servicios definidos en el sistema para la tabla
 * "SUCURSALES"
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
@RestController
@AllArgsConstructor
public class SucursalController implements SucursalAPI{
	
	@Autowired
	private SucursalService sucursalService;
	
	@Override
	public Sucursal getSucursal(long idSucursal) {
		return this.sucursalService.getSucursal(idSucursal);
	}

	@Override
	public List<Sucursal> getSucursales() {
		return this.sucursalService.getSucursales();
	}

}
