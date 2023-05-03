//4. Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
//Inicialice las matrices para evitar el ingreso de datos por teclado.

Algoritmo multiplicacionMatrices
	Definir matrizA, matrizB, matrizC, n, m Como Entero
	n <- 3
	m <- 3
	Dimension matrizA(n,m)
	Dimension matrizB(n,m)
	Dimension matrizC(n,m)
	
	llenarMatriz(matrizA,n,m)
	llenarMatriz(matrizB,n,m)
	Escribir 'matriz A'
	mostrarMatriz(matrizA,n,m)
	Escribir 'matriz B'
	mostrarMatriz(matrizB,n,m)
	
	Para i <- 1 Hasta n Hacer
		Para j <- 1 Hasta m Hacer
			matrizC[i,j] <- matrizA[i,j] * matrizB[i,j]
		FinPara
	FinPara
	Escribir 'matriz resultado'
	mostrarMatriz(matrizC,n,m)
	
FinAlgoritmo

SubProceso llenarMatriz(Matriz, n, m)
	Definir i, j Como Entero
	Para i <- 1 Hasta n Hacer
		Para j <- 1 Hasta m Hacer
				Matriz[i,j] <- Aleatorio(1,9)
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

