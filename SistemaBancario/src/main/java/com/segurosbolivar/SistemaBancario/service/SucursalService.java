package com.segurosbolivar.SistemaBancario.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.segurosbolivar.SistemaBancario.model.Sucursal;

/**
 * Interfaz para definir los servicios de gestión de la tabla "SUCURSALES" en BD
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
public interface SucursalService {
	
	/**
	 * Servicio de consultar una sucursal
	 * @param idUsuario Identificador del usuario a consultar
	 * @return Objeto de la clase Sucursal
	 */
	public Sucursal getSucursal(@PathVariable long idSucursal);
	
	/**
	 * Servicio de consulta de todas las
	 * sucursales del sistema
	 * @return Lista de objetos de clase Sucursal
	 */
	public List<Sucursal> getSucursales();


}
