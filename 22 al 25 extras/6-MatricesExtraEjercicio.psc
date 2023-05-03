//Realizar un programa que permita visualizar el resultado del producto de una matriz de
//enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
//inicializarse evitando así el ingreso de datos por teclado. Para conocer más acerca de cómo se
//realiza la multiplicación entre matrices consultar el siguiente link:
Algoritmo MatricesExtraEjercicio6
	Definir matriz, vector, resultado Como Entero
	Definir f, c, factor Como Entero
	
	Dimension matriz[3,3]
	Dimension vector[3]
	Dimension resultado[3]
	
	llenarMatriz(matriz)
	llenarVector(vector)
	
	//multiplicar la matriz por el vector
	para f=0 Hasta 2 Hacer
		resultado[f]=0
		para c=0 Hasta 2 Hacer
			resultado[f]=resultado[f]+(matriz[f,c]*vector[c])
		FinPara
	FinPara
	Escribir "Matriz"
	para f=0 Hasta 2 Hacer
		para c=0 Hasta 2 Hacer
			si c<>2 Entonces
				Escribir Sin Saltar matriz[f,c], "   "
			SiNo
				Escribir matriz[f,c]
			FinSi
		FinPara
	FinPara
	Escribir "Vector"
	para f=0 Hasta 2 Hacer
		Escribir vector[f]
	FinPara
	Escribir "Matriz x Vector"
	para f=0 Hasta 2 Hacer
		Escribir resultado[f]
	FinPara
FinAlgoritmo

SubProceso llenarMatriz(matriz Por Referencia)
	Definir f,c Como Entero
		
	para f=0 Hasta 2 Hacer
		para c=0 Hasta 2 Hacer
			matriz[f,c]=Aleatorio(0,20)
		FinPara
	FinPara
FinSubProceso

SubProceso llenarVector(vector Por Referencia)
	definir f Como Entero
	para f=0 Hasta 2 Hacer
		vector[f]=Aleatorio(0,20)
	FinPara
FinSubProceso
	