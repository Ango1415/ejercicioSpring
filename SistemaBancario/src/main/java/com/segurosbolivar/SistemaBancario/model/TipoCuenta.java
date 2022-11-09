package com.segurosbolivar.SistemaBancario.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Clase para mapear la tabla "TIPOS_CUENTA" en el esquema "USUARIO_PRUBA"
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
@Entity
@Table(name="TIPOS_CUENTA", schema="USUARIO_PRUEBA")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TipoCuenta {
	
	@Id
	@Type(type="org.hibernate.type.StringType")
	@Column(name="id_tipo_cuenta")
	private String id;
	
	@Column(name="nombre_tipo_cuenta")
	private String nombre;
	
	@Column(name="descripcion_tipo_cuenta")
	private String descripcion;
	
	//@OneToMany(mappedBy = "tipoCuenta")
    //private Set<Cuenta> cuentas= new HashSet<>();

}
