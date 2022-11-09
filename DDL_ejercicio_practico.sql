--"USUARIOS", tabla para almacenar los usuarios del sistema bancario.
--La(s) tabla(s) ... "CUENTAS" ... tiene(n) FOREING KEY asociada(s) a esta tabla.
CREATE TABLE usuarios(
 	id_usuario 					VARCHAR2(50) NOT NULL,
 	numero_documento_usuario 	VARCHAR2(15) NOT NULL,
 	primer_nombre_usuario 		VARCHAR2(15) NOT NULL,
 	segundo_nombre_usuario 		VARCHAR2(15) NOT NULL,
 	primer_apellido_usuario 	VARCHAR2(15) NOT NULL,
 	segundo_apellido_usuario 	VARCHAR2(15) NOT NULL,
 	numero_telefonico_usuario 	VARCHAR2(15) NOT NULL,
 	direccion_residencia_usuario VARCHAR2(50) NOT NULL,
 	ciudad_residencia_usuario 	VARCHAR2(15) NOT NULL,
 	
 	CONSTRAINT PK_usuarios 					PRIMARY KEY(id_usuario),
 	CONSTRAINT UQ_numero_documento_usuarios UNIQUE(numero_documento_usuario) 	
 ); 


--"TIPOS_CUENTA", tabla para almacenar los tipos de cuenta que se pueden crear en el sistema bancario.
--La(s) tabla(s) ... "CUENTAS" ... tiene(n) FOREING KEY asociada(s) a esta tabla.
CREATE TABLE tipos_cuenta(
	id_tipo_cuenta 			CHAR(2) NOT NULL,
	nombre_tipo_cuenta 		VARCHAR2(15) NOT NULL,
	descripcion_tipo_cuenta VARCHAR2(50),
	
	CONSTRAINT PK_tipos_cuenta 		PRIMARY KEY(id_tipo_cuenta),
	CONSTRAINT UQ_nombre_tipo_cuenta UNIQUE(nombre_tipo_cuenta)
);


--"TIPOS_TRANSACCION", tabla para almacenar los tipos de transacción que se pueden crear en el sistema bancario.
--La(s) tabla(s) ... "TRANSACCIONES" ... tiene(n) FOREING KEY asociada(s) a esta tabla.
CREATE TABLE tipos_transaccion(
	id_tipo_transaccion 		CHAR(2) NOT NULL,
	nombre_tipo_transaccion 	VARCHAR2(15) NOT NULL,
	descripcion_tipo_transaccion VARCHAR2(50),
	
	CONSTRAINT PK_tipos_transaccion 	PRIMARY KEY(id_tipo_transaccion),
	CONSTRAINT UQ_nombre_tipo_transaccion UNIQUE(nombre_tipo_transaccion)
);


--"INTERESES", tabla para almacenar los valores de interes en el sistema bancario con su fecha de registro.
--"valor_interes" NO es el valor porcentual, ejm si es el 2% se expresa como 0.02 en el campo.
CREATE TABLE intereses(
	id_interes 				NUMBER NOT NULL,
	valor_interes 			NUMBER(6,4) NOT NULL,
	fecha_registro_interes 	DATE NOT NULL,
	
	CONSTRAINT PK_intereses PRIMARY KEY(id_interes)
);


--"SUCURSALES", tabla para almacenar las sucursales registradas en el sistema bancario.
--La(s) tabla(s) ... "CUENTAS" ... tiene(n) FOREING KEY asociada(s) a esta tabla.
CREATE TABLE sucursales(
	id_sucursal 				NUMBER NOT NULL,
	direccion_sucursal 			VARCHAR2(50) NOT NULL,
	ciudad_residencia_sucursal VARCHAR2(15) NOT NULL,
	
	CONSTRAINT PK_sucursales PRIMARY KEY(id_sucursal)
);


--"CUENTAS", tabla para almacenar las cuentas registradas en el sistema bancario.
CREATE TABLE cuentas(
	numero_cuenta 			VARCHAR2(11) NOT NULL,
	propietario_cuenta 		VARCHAR2(50) NOT NULL,
	tipo_cuenta 			CHAR(2) NOT NULL,
	sucursal_creacion_cuenta NUMBER NOT NULL,
	saldo_cuenta 			NUMBER NOT NULL,
	fecha_creacion_cuenta 	DATE NOT NULL,
	
	CONSTRAINT PK_cuentas 					PRIMARY KEY(numero_cuenta),
	CONSTRAINT FK_propietario_cuenta 		FOREIGN KEY (propietario_cuenta) 		REFERENCES usuarios(id_usuario),
	CONSTRAINT FK_tipo_cuenta 				FOREIGN KEY (tipo_cuenta) 				REFERENCES tipos_cuenta(id_tipo_cuenta),
	CONSTRAINT FK_sucursal_creacion_cuenta 	FOREIGN KEY (sucursal_creacion_cuenta) 	REFERENCES sucursales(id_sucursal)
);


--"TRANSACCIONES", tabla para almacenar las transacciones registradas en el sistema bancario.
CREATE TABLE transacciones(
	id_transaccion 				VARCHAR2(50) NOT NULL,
	tipo_transaccion 			CHAR(2) NOT NULL,
	cuenta_transaccion 			VARCHAR2(11) NOT NULL,
	monto_transaccion 			NUMBER NOT NULL,
	fecha_realizacion_transaccion DATE NOT NULL,
	
	CONSTRAINT PK_transacciones 	PRIMARY KEY(id_transaccion),
	CONSTRAINT FK_tipo_transaccion 	FOREIGN KEY (tipo_transaccion) 	REFERENCES tipos_transaccion(id_tipo_transaccion),
	CONSTRAINT FK_cuenta_transaccion FOREIGN KEY (cuenta_transaccion) REFERENCES cuentas(numero_cuenta)
);
