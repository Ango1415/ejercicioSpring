package com.segurosbolivar.SistemaBancario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.segurosbolivar.SistemaBancario.api.CuentaAPI;
import com.segurosbolivar.SistemaBancario.model.Cuenta;
import com.segurosbolivar.SistemaBancario.service.CuentaService;

import lombok.AllArgsConstructor;

/**
 * @author 1057547562
 *
 */
@RestController
@AllArgsConstructor
public class CuentaController implements CuentaAPI{
	
	@Autowired
	private CuentaService cuentaService;
	
	@Override
	public Cuenta getCuenta(String numeroCuenta) {
		return this.cuentaService.getCuenta(numeroCuenta);
	}

	@Override
	public Cuenta getCuentaByJPQL(String numeroCuentaJPQL) {
		return this.cuentaService.getCuentaByJPQL(numeroCuentaJPQL);
	}
	
	@Override
	public List<Cuenta> getCuentas() {
		return this.cuentaService.getCuentas();
	}

	@Override
	public List<Cuenta> getCuentasBySQL() {
		return this.cuentaService.getCuentasBySQL();
	}

	@Override
	public Cuenta createCuenta(Cuenta cuentaNueva) {
		return this.cuentaService.createCuenta(cuentaNueva);
	}

	@Override
	public Cuenta createCuentaProcedure(Cuenta cuentaNueva) {
		return this.cuentaService.createCuentaProcedure(cuentaNueva);
	}
	

}
