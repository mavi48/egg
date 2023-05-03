Algoritmo matrix1
	definir matrixfinal Como Real
	definir i, j, num, c como entero
	dimension matrixfinal(5, 5)
	
	relleno(matrixfinal)
	relleno1( matrixfinal)
	
FinAlgoritmo

SubProceso relleno( matrixfinal por referencia)
	definir i,j como entero
	para i=0 hasta 4 con paso 1 Hacer
		para j = 0 hasta 4 con paso 1 Hacer
			matrixfinal(i, j) = aleatorio(1, 100)	
		FinPara
	FinPara
FinSubProceso

SubProceso relleno1 ( matrixfinal por referencia)
	definir i,j como entero
	 para i=0 hasta 4 con paso 1 Hacer
		 para j = 0 hasta 4 con paso 1 Hacer
			 escribir sin saltar "(" matrixfinal(i, j) ")"
		 FinPara
		 escribir " "
	 FinPara
FinSubProceso
