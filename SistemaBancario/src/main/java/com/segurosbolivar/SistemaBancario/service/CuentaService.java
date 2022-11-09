package com.segurosbolivar.SistemaBancario.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.segurosbolivar.SistemaBancario.model.Cuenta;

/**
 * @author 1057547562
 *
 */
public interface CuentaService {
	
	/**
	 * @param numeroCuenta
	 * @return
	 */
	public Cuenta getCuenta(@PathVariable String numeroCuenta);
	
	/**
	 * @param numeroCuenta
	 * @return
	 */
	public Cuenta getCuentaByJPQL(@PathVariable String numeroCuentaJPQL);
	
	/**
	 * @return
	 */
	public List<Cuenta> getCuentas();
	
	/**
	 * @return
	 */
	public List<Cuenta> getCuentasBySQL();
	
	
	public Cuenta createCuenta(@RequestBody Cuenta cuentaNueva);
	
	public Cuenta createCuentaProcedure(@RequestBody Cuenta cuentaNueva);

}
