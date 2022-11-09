package com.segurosbolivar.SistemaBancario.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.segurosbolivar.SistemaBancario.model.TipoCuenta;

/**
 * Interfaz para definir los servicios de gestión de la tabla "TIPOS_CUENTA" en BD
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
public interface TipoCuentaService {
	
	/**
	 * Servicio para consultar un tipo de cuenta
	 * @param idTipoCuenta Identificador del tipo de cuenta a consultar
	 * @return Objeto de la clase TipoCuenta
	 */
	public TipoCuenta getTipoCuenta(@PathVariable String idTipoCuenta);
	
	/**
	 * Servicio para consultar todos los tipos de cuenta
	 * @return Lista de objetos de la clase TipoCuenta
	 */
	public List<TipoCuenta> getTiposCuenta();

}
