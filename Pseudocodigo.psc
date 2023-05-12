Algoritmo DesmonteBD
	Definir opc Como Entero
	Definir correo Como Caracter
	Dimension baseDatosComplete[4]
	baseDatosComplete[1] <- 'ZEUS'
	baseDatosComplete[2] <- 'ARES'
	baseDatosComplete[3] <- 'ARTEMIS'
	baseDatosComplete[4] <- 'HADES'
	Escribir 'Escriba el número de requirimiento según HU'
	Leer opc
	Escribir 'Escriba el correo donde se adjuntaran pruebas del caso'
	Leer correo
	Segun opc  Hacer
		1:
			Definir baseDatos Como Caracter
			Definir j,x Como Entero
			j <- 1
			x <- 0
			Escribir 'Ingrese el nombre de la BD'
			Leer baseDatos
			Repetir
				Si baseDatos=baseDatosComplete[j] Entonces
					x <- 1
				SiNo
					x <- 0
				FinSi
				j <- j+1
			Hasta Que j=4 O x=1
			j <- 0
			Si x=1 Entonces
				Escribir 'La base de datos si existe'
				Escribir '...'
				Escribir 'La base de datos se esta revisando si tiene funcionalidades agregadas desde otro servicio'
				Escribir '¿Desea desmontar la base de datos?'
				Escribir '1. Si'
				Escribir '2. No'
				Leer j
				Si j=1 Entonces
					Escribir '...'
					Escribir 'La base de datos ha sido desmontada exitosamente se adjunta imagenes al correo: '+correo
				FinSi
			SiNo
				Escribir 'La base de datos especificada no existe'
			FinSi
		De Otro Modo:
			Escribir 'No se encuentra la HU especificada'
	FinSegun
FinAlgoritmo
