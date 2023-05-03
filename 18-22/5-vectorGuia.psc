algoritmo vectorGuia
definir vector, i,cant_elementos, num ,mayor, menor,validacion como entero
dimension vector(5)

Escribir "Ingrese un numero"
leer cant_elementos
validacion = datos(vector)


FinAlgoritmo

funcion resultado<-datos (vector por referencia )
	definir  mayor,menor ,i,num como entero
	i=0
	para i<-0 hasta 4 con paso 1 Hacer
		escribir "ingrese el dato ", i , " :" 
		leer vector(i)
		
	FinPara
	mayor <- vector(1)
	menor <- vector(1)
	
	para i<-1 hasta 4 Hacer
		num <- vector(i)
		si num > mayor entonces
			mayor = num
		FinSi
		si num < menor Entonces
			menor = num
		FinSi
	FinPara
	
	escribir "numero mayor :",mayor
FinFuncion
