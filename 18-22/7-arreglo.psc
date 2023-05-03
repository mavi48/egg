Algoritmo arreglo
	definir n,a,x,vector,val,vector1,vector2 como entero
	
	dimension vector(100000000)
	arreglo1(vector,n)
	val= valid(vector, n)
	
FinAlgoritmo

SubProceso arreglo1(vector por referencia,n por referencia)
	definir a, x ,b,c como entero
	escribir "ingresa tamnaño del vector"
	leer n
	para b=1 hasta n Hacer
		x= Aleatorio(0,100)
		vector(b) = x
	FinPara
	para a=1 hasta n Hacer
		escribir a
	FinPara
    escribir "ingrese  tamnaño del vector"
	leer n
	para c=1 hasta n Hacer
		x= Aleatorio(0,100)
		vector(c)= x
	finpara
	para a=1 hasta n Hacer
		escribir a
	FinPara
	
FinSubProceso
funcion arreglo2<-valid (vector1 por referencia,vector2 por referencia)
	definir x,c Como entero
	dimension vector(100000000)
	para x= 1 hasta 10 con paso 1 Hacer
		escribir "ingresa un numero en el vector 1"
		leer vector1(x)
		escribir "ingresa un numero en el vector 2"
		leer vector2
	
	c=0
	para x = 1 hasta 10 con paso 1 Hacer
		si vector1(x) == vector2 Entonces
			c= c+1
		FinSi
	FinPara
	FinPara
	si c ==10 Entonces
		escribir"los vectores son iguales"
	sino 
		escribir"los vectores son diferentes"
	FinSi
FinFuncion


