package com.segurosbolivar.SistemaBancario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.segurosbolivar.SistemaBancario.model.Cuenta;
import com.segurosbolivar.SistemaBancario.repository.CuentaRepository;
import com.segurosbolivar.SistemaBancario.service.CuentaService;

import lombok.AllArgsConstructor;

/**
 * @author 1057547562
 *
 */
@Service
@AllArgsConstructor
public class CuentaServiceImpl implements CuentaService{
	
	@Autowired
	private CuentaRepository cuentaRepository;
	
	@Override
	public Cuenta getCuenta(String numeroCuenta) {
		return this.cuentaRepository.findById(numeroCuenta).orElse(null);
	}

	@Override
	public Cuenta getCuentaByJPQL(String numeroCuentaJPQL) {
		return this.cuentaRepository.encontrarConJPQL(numeroCuentaJPQL);
	}
	
	@Override
	public List<Cuenta> getCuentas() {
		return this.cuentaRepository.findAll();
	}

	@Override
	public List<Cuenta> getCuentasBySQL() {
		return this.cuentaRepository.findAllNative();
	}
	
	@Override
	public Cuenta createCuenta(Cuenta cuentaNueva) {
		return this.cuentaRepository.save(cuentaNueva);
	}
	
	@Override
	public Cuenta createCuentaProcedure(Cuenta cuentaNueva) {
		
		String numerocuenta 		= cuentaNueva.getNumero();
		String propietariocuenta 	= cuentaNueva.getUsuario().getId();
		String tipocuenta 			= cuentaNueva.getTipoCuenta().getId(); 
		long sucursalcreacionCuenta = cuentaNueva.getSucursalCreacion().getId(); 
		float saldocuenta 			= cuentaNueva.getSaldo();
		
		this.cuentaRepository.procedAlmCrearCuenta(numerocuenta, propietariocuenta, tipocuenta, 
															sucursalcreacionCuenta, saldocuenta);
		
		return this.cuentaRepository.findById(numerocuenta).orElse(null);
		
	}
	

}
