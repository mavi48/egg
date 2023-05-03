//3. Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y
//ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de
//ceros.
//Por ejemplo, nuestro matriz final debería verse así:
//	111111111111111
//	100000000000001
//	100000000000001
//	100000000000001
//	111111111111111

Algoritmo matrizUnoCero
	Definir matriz, n, m Como Entero
	n <- 5
	m <- 15
	Dimension matriz(n,m)
	llenarMatriz(matriz,n,m)
	mostrarMatriz(matriz,n,m)
	
FinAlgoritmo

SubProceso llenarMatriz(Matriz, n, m)
	Definir i, j Como Entero
	Para i <- 1 Hasta n Hacer
		Para j <- 1 Hasta m Hacer
			si i = 1 o j = 1 o j = m  o i = n Entonces
				Matriz[i,j] <- 1
			SiNo
				Matriz[i,j] <- 0
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarMatriz(Matriz, n, m)
	Definir i, j Como Entero
	Para i <- 1 Hasta n Hacer
		Para j <- 1 Hasta m Hacer
			Escribir Sin Saltar " " matriz[i,j];
		FinPara
		Escribir ' '
	FinPara
FinSubProceso

