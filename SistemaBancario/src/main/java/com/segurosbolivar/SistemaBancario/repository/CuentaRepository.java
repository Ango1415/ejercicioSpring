package com.segurosbolivar.SistemaBancario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.segurosbolivar.SistemaBancario.model.Cuenta;

/**
 * @author 1057547562
 *
 */
@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, String>{
	
	
	/**
	 * Servicio para obtener todas las cuentas mediante una consulta
	 * SQL nativa
	 * @return Lista de cuentas consultadas
	 */
	@Query(value="SELECT * FROM cuentas", nativeQuery = true)
	List<Cuenta> findAllNative();
	
	/**
	 * Servicio para obtener una cuenta específica mediante una consulta
	 * JPQL
	 * @return Cuenta consultadas
	 */
	@Query(value="SELECT c FROM Cuenta c WHERE c.numero = ?1")
	Cuenta encontrarConJPQL(String numeroCuentaJPQL);
	

	
	@Procedure(name = "java_procedure_crearcuenta")
	void procedAlmCrearCuenta(@Param("NUMEROCUENTA") String numeroCuenta, @Param("PROPIETARIOCUENTA") String propietarioCuenta, 
										@Param("TIPOCUENTA") String tipoCuenta, @Param("SUCURSALCREACIONCUENTA") long sucursalCreacionCuenta,
										@Param("SALDOCUENTA") float saldoCuenta);
	
	

}
