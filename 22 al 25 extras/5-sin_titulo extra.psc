//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
//primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
//deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
//la matriz de la siguiente forma:


Algoritmo sin_titulo
	definir fila,columna,columna1,columna2 Como Entero
	definir matriz,resul Como Entero
	dimension matriz(4,4)
	escribir" "
	escribir "hacer un algoritmo que cree una matriz de 3x3 "
	escribir" "
	
	para fila <-1 hasta 3 con paso 1 Hacer
		para columna <-1 hasta 3 con paso 1 Hacer
			escribir "ingrese la cantidad de filas ",fila," ",columna
			leer matriz(fila,columna)
		FinPara
		
	FinPara
	
	para fila <-1 hasta 3 con paso 1 Hacer
		para columna <-1 hasta 3 con paso 1 Hacer
			escribir sin saltar matriz(fila,columna)," "
		FinPara
		escribir " "
	FinPara
	
	leer columna1
	leer columna2
FinAlgoritmo
Funcion suma = sumaMatriz (matriz,columna1,columna2)
	Definir fila, columna, suma Como Entero
	leer columna1
	leer columna2
	suma = 0
	para fila=0 Hasta 3 con paso 1 Hacer
		para columna =0 Hasta 3 Hacer
			suma = suma + matriz(columna2,columna1)
		FinPara
	FinPara
FinFuncion
