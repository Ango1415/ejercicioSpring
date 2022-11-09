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
 * Clase para mapear la tabla "USUARIOS" en el esquema "USUARIO_PRUBA"
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
@Entity
@Table(name="USUARIOS", schema="USUARIO_PRUEBA")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
	
	@Id
	@Type(type="org.hibernate.type.StringType")
	@Column(name="id_usuario")
	private String id;
	
	@Column(name="numero_documento_usuario")
	private String numeroDocumento;
	
	@Column(name="primer_nombre_usuario")
	private String primerNombre;
	
	@Column(name="segundo_nombre_usuario")
	private String segundoNombre;
	
	@Column(name="primer_apellido_usuario")
	private String primerApellido;
	
	@Column(name="segundo_apellido_usuario")
	private String segundoApellido;
	
	@Column(name="numero_telefonico_usuario")
	private String numeroTelefonico;
	
	@Column(name="direccion_residencia_usuario")
	private String direccionResidencia;
	
	@Column(name="ciudad_residencia_usuario")
	private String ciudadResidencia;
	
	@Column(name="correo_electronico_usuario")
	private String correoElectronico;
	
	//@OneToMany(mappedBy = "usuario")
    //private Set<Cuenta> cuentas;
}
