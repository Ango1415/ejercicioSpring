package com.segurosbolivar.SistemaBancario.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.segurosbolivar.SistemaBancario.model.Cuenta;


/**
 * @author 1057547562
 *
 */
@RequestMapping("/cuenta")
public interface CuentaAPI {
	
	/**
	 * @param numeroCuenta
	 * @return
	 */
	@GetMapping("/{numeroCuenta}")
	public Cuenta getCuenta(@PathVariable String numeroCuenta);
	
	@GetMapping("/jpql/{numeroCuentaJPQL}")
	public Cuenta getCuentaByJPQL(@PathVariable String numeroCuentaJPQL);
	
	/**
	 * @return
	 */
	@GetMapping()
	public List<Cuenta> getCuentas();
	
	@GetMapping("/sql")
	public List<Cuenta> getCuentasBySQL();
	
	@PostMapping()
	public Cuenta createCuenta(@RequestBody Cuenta cuentaNueva);
	
	@PostMapping("/procedure")
	public Cuenta createCuentaProcedure(@RequestBody Cuenta cuentaNueva);
	
	//@PutMapping()
	//public void updateCuenta();
	
	//@DeleteMapping
	//public void deleteCuenta();

}
