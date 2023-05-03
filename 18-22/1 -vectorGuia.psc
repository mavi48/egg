
	Algoritmo vectorGuia
		definir vector, i, num como entero
		dimension vector(5)
		para i<-0 hasta 4 con paso 1 Hacer
			Escribir "Ingrese un numero"
			leer num
			vector(i)= num
		FinPara
		
		para i<-0 hasta 4 con paso 1 Hacer
			si i=4
				escribir vector(i)
			sino
				escribir vector(i) "," sin saltar
			FinSi
		FinPara
FinAlgoritmo
