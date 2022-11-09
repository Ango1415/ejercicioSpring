package com.segurosbolivar.SistemaBancario.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.segurosbolivar.SistemaBancario.model.TipoCuenta;

/**
 * Interfaz para definir los endpoints que se podrán consumir para la gestión 
 * de la tabla "TIPOS_CUENTA" en BD
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
@RequestMapping("/tipocuenta")
public interface TipoCuentaAPI {
	
	/**
	 * Endpoint para consumir el servicio de consultar un tipo de cuenta
	 * @param idTipoCuenta Identificador del tipo de cuenta a consultar
	 * @return Objeto de la clase TipoCuenta
	 */
	@GetMapping("/{idTipoCuenta}")
	public TipoCuenta getTipoCuenta(@PathVariable String idTipoCuenta);
	
	/**
	 * Endpoint para consumir el servicio de consultar todos los tipos de cuenta
	 * @return Lista de objetos de la clase TipoCuenta
	 */
	@GetMapping()
	public List<TipoCuenta> getTiposCuenta();

}
