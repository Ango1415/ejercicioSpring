package com.segurosbolivar.SistemaBancario.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.segurosbolivar.SistemaBancario.model.Sucursal;

/**
 * Interfaz para definir los endpoints que se podrán consumir para la gestión 
 * de la tabla "SUCURSALES" en BD
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
@RequestMapping("/sucursal")
public interface SucursalAPI {
	
	/**
	 * Endpoint para consumir el servicio de consultar una sucursal
	 * @param idUsuario Identificador del usuario a consultar
	 * @return Objeto de la clase Sucursal
	 */
	@GetMapping("/{idSucursal}")
	public Sucursal getSucursal(@PathVariable long idSucursal);
	
	/**
	 * Endpoint para consumir el servicio de consulta de todas las
	 * sucursales del sistema
	 * @return Lista de objetos de clase Sucursal
	 */
	@GetMapping()
	public List<Sucursal> getSucursales();

}
