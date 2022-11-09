package com.segurosbolivar.SistemaBancario.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Clase para mapear la tabla "CUENTAS" en el esquema "USUARIO_PRUEBA"
 * @author angel.gomez@segurosbolivar.com
 * @version 1.0
 */
@Entity
@Table(name="CUENTAS", schema="USUARIO_PRUEBA")

@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(
			name= "java_procedure_crearcuenta", procedureName  = "USUARIO_PRUEBA.PRCD_CREAR_CUENTA",
			parameters = {
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "NUMEROCUENTA", 			type = String.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "PROPIETARIOCUENTA", 		type = String.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "TIPOCUENTA", 			type = String.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "SUCURSALCREACIONCUENTA", type = Long.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "SALDOCUENTA", 			type = Float.class),
			})
})

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cuenta {
	
	@Id
	@Type(type="org.hibernate.type.StringType")
	@Column(name="numero_cuenta")
	private String numero;
	
	@ManyToOne
	@JoinColumn(name="propietario_cuenta")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="tipo_cuenta")
	private TipoCuenta tipoCuenta;
	
	@ManyToOne
	@JoinColumn(name="sucursal_creacion_cuenta")
	private Sucursal sucursalCreacion;
	
	@Column(name="saldo_cuenta")
	private float saldo;
	
	@Column(name="fecha_creacion_cuenta")
	private String fechaCreacion;
}
