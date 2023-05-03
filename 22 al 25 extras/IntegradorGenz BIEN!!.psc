Algoritmo IntegradorGenz
	Definir m, i, j, cont Como Entero
	Definir genZ, palabra, car Como Cadena
	Definir validacionLetra Como Logico
	validacionLetra = verdadero //nace en Verdadero
	palabra="adcdccbda"
	//	Hacer //ingreso de la palabra y validacion del tama�o
	//		Hacer
	//			Escribir "Ingrese la palabra que desea evaluar (debe contener 9,16 o 1369 caracteres y ser A, B, C o D)"
	//			leer palabra
	//			palabra = Mayusculas(palabra)
	//			para i = 0 hasta Longitud(palabra)-1 //validaci�n si no es A,B,C o D
	//				car = Subcadena(palabra,i,i)
	//				Si car <> "A" y car <> "B" y car <> "C" y car <> "D"
	//					validacionLetra = Falso
	//				FinSi
	//			FinPara
	//		Mientras Que validacionLetra = Falso
	//	Mientras Que Longitud(palabra) <> 9 y Longitud(palabra) <> 16 y Longitud(palabra) <> 1369 //revisa tama�o de la matriz
	
	m = rc(Longitud(palabra)) //guardo la ra�z cuadrada del tama�o de la palabra en una variable "m"
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
Funcion mostrarGen(genZ,m)
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
FinFuncion

Funcion buscarCoincidencias(genZ,m)
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
	
	//Revision final e impresi�n de mensaje
	Si contDiag1 = m y contDiag2 = m
		Escribir "Se ha detectado el GenZ! con las letras ", genZ(0,0)," y " , genZ(0,m-1)
	SiNo
		Escribir "La matriz no presenta el GenZ"
	FinSi
	Escribir " "
FinFuncion


