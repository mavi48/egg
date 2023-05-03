Algoritmo ejercicioCooperativoGuia4
			Definir tablero como Cadena
			Dimension tablero[9, 12]
			inicializarMatriz(tablero, 9, 12)
			agregarPalabra(tablero, "VECTOR", 0)
			agregarPalabra(tablero, "MATRIX", 1)
			agregarPalabra(tablero, "PROGRAMA", 2)
			agregarPalabra(tablero, "SUBPROGRAMA", 3)
			agregarPalabra(tablero, "SUBPROCESO", 4)
			agregarPalabra(tablero, "VARIABLE", 5)
			agregarPalabra(tablero, "ENTERO", 6)
			agregarPalabra(tablero, "PARA", 7)
			agregarPalabra(tablero, "MIENTRAS", 8)
			acomodarPalabras(tablero)
			imprimirMatriz(tablero, 9, 12)
FinAlgoritmo

SubProceso inicializarMatriz(tablero Por Referencia,fila, columna) 
	Definir i, j Como Entero
	Para i<-0 Hasta 8 Hacer
		Para j <-0 hasta 11 Hacer
			tablero[i,j]="*"
		FinPara
	FinPara
FinSubProceso

SubProceso imprimirMatriz(tablero Por Referencia, 9,12)
	Definir i, j, matriz, vector Como Entero
		
		Para i <- 0 Hasta 8 Hacer
			Para j <- 0 Hasta 11 Hacer
				Escribir Sin Saltar "[" tablero(i, j) "]"
			FinPara
				Escribir " "
		FinPara
		
FinSubProceso

Subproceso agregarPalabra(matriz Por Referencia, frase, fila)
	Definir contador, long como entero
	
	long=Longitud(frase)
	Para contador=0 hasta long-1 Hacer
		matriz[fila,contador]=Subcadena(frase,contador,contador)
	FinPara
FinSubProceso

SubProceso acomodarPalabras(mat Por Referencia)
	Definir posicion, f, c, ultimo, desplazamiento Como Entero
	Definir primerasterisco Como Logico
	para f=0 Hasta 8 Hacer
		posicion=buscarR(mat, f)
		//determinar primer * para determinar cuanto se moveran a la derecha
		c=0
		primerasterisco=Falso
		Hacer
			si mat[f,c]=="*" Entonces
				ultimo=c-1
				primerasterisco=Verdadero
			SiNo
				c=c+1
			FinSi
		Mientras Que primerasterisco=Falso
		
		//determinar desplazamiento
		desplazamiento=5-posicion
		
		para c=(ultimo+desplazamiento) Hasta 0 Con Paso -1
			si c>=desplazamiento Entonces
				mat[f,c]=mat[f,c-desplazamiento]
			SiNo
				mat[f,c]="*"
			FinSi
		FinPara
	FinPara
	
FinSubProceso
	Funcion pos<-buscarR(matriz Por Referencia,f)
		Definir pos, c Como Entero
		Definir encontrado Como Logico
		c=0
		encontrado=Falso
		Hacer
			si matriz[f,c]=="R" Entonces
				pos=c
				encontrado=Verdadero
			SiNo
				c=c+1
			FinSi
			
		Mientras Que encontrado=Falso
FinFuncion

	