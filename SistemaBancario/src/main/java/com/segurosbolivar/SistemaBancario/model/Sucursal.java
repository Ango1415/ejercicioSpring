package com.segurosbolivar.SistemaBancario.model;

//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase para mapear la tabla "SUCURSALES" en el esquema "USUARIO_PRUEBA"
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
@Entity
@Table(name="SUCURSALES", schema="USUARIO_PRUEBA")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sucursal {
	
	@Id
	@Type(type="org.hibernate.type.LongType")
	@Column(name="id_sucursal")
	private long id;
	
	@Column(name="direccion_sucursal")
	private String direccion;
	
	@Column(name="ciudad_residencia_sucursal")
	private String ciudadResidencia;
	
	//@OneToMany(mappedBy = "sucursalCreacion")
    //private Set<Cuenta> cuentas;

}
