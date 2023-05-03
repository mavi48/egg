
	Algoritmo ejercicio3_G5
		//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
		//usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a buscar
		//también debe ser ingresado por el usuario). El programa debe indicar la posición donde se
		//encuentra el valor. En caso que el número se encuentre repetido dentro del arreglo se deben
		//imprimir todas las posiciones donde se encuentra ese valor.
		//Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar un
		//mensaje.
		
		definir nVector, n, i, cont como entero
		dimension nVector(10)
		escribir "Ingrese 10 numeros"
		
		
		para i = 0 hasta 9 con paso 1 hacer
			leer nVector(i)
			
		FinPara
		
		escribir "Ingrese en Numero a buscar"
		leer n
		cont=0
		Para i<-0 Hasta 9 Con Paso 1 Hacer
			si n = nVector(i) Entonces
				escribir "El numero " n "  se encuentra en el vector en la posicion " i
				
				
				cont=1
			FinSi
			
		Fin Para
		si cont=0 entonces
			escribir "El numero " n " no se encuentra en el vector"
		FinSi
		
FinAlgoritmo

