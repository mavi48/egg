
	Algoritmo al_cuadrado
		Escribir "Ingresar la cantidad de números"
		Leer n
		Dimension valores[n]
		Dimension c[n]
		Para b<-1 Hasta n Hacer
			Escribir "Ingrese el " b " numero"
			Leer valores[b]
			c[b]<-valores[b]*valores[b]
			Escribir "Elevado al cuadrado es : ", c[b]
		FinPara
FinAlgoritmo
