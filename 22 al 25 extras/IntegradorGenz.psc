Algoritmo IntegradorGenz
	Definir m, i, j, cont Como Entero
	Definir genZ, palabra, car Como Cadena
	Definir validacionLetra Como Logico
	validacionLetra = verdadero //nace en Verdadero
	palabra=""
 
 

	
	m = rc(Longitud(palabra)) //guardo la raíz cuadrada del tamaño de la palabra en una variable "m"
	Dimension genZ(m,m) //creo la matriz
	
	cont = 0
	Para i = 0 hasta m-1
		Para j = 0 hasta m-1
			genZ(i,j) = Subcadena(palabra, cont, cont)
			cont = cont + 1
		FinPara
	FinPara
	mostrarGen(genZ,m)
	buscarCoincidencias(genZ,m)
FinAlgoritmo
SubProceso mostrarGen(genZ,m)
	//mostrar esa matriz
	Definir i,j Como Entero
	Limpiar Pantalla
	Escribir "El gen ingresado es:"
	Escribir ""
	Para i = 0 hasta m-1
		Para j = 0 hasta m-1
			Escribir Sin Saltar " | ", genZ(i,j), " | "
		FinPara
		Escribir ""
	FinPara
FinSubProceso


SubProceso  buscarCoincidencias(genZ,m)
	Definir i, j, contDiag1, contDiag2 Como Entero
	Definir validacionDiagonal, validacionDiagonal2 Como Cadena
	Dimension validacionDiagonal(m), validacionDiagonal2(m)
	Escribir ""
	// 3 buscar coincidencias
	Para i = 0 hasta m-1
		Para j = 0 hasta m-1
			Si i=j
				validacionDiagonal(i) = genZ(i,j)
			FinSi
			Si i + j = m-1
				validacionDiagonal2(i) = genZ(i,j)
			FinSi
		FinPara
	FinPara
	
	// VALIDACION DE LETRAS COMPARANDO VECTOR DE REFERENCIA CON POSICIONES CLAVES
	contDiag1 = 0
	contDiag2 = 0
	Para i = 0 Hasta m-1
		Si validacionDiagonal(i) = genZ(0,0)
			contDiag1 = contDiag1 + 1
		FinSi
		Si validacionDiagonal2(i) = genZ(0,m-1)
			contDiag2 = contDiag2 + 1
		FinSi
	FinPara
	
	//Revision final e impresión de mensaje
	Si contDiag1 = m y contDiag2 = m
		Escribir "Se ha detectado el GenZ! con las letras ", genZ(0,0)," y " , genZ(0,m-1)
	SiNo
		Escribir "La matriz no presenta el GenZ"
	FinSi
	Escribir " "
FinSubProceso


