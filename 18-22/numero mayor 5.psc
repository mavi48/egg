
Algoritmo  numeromayor
	Definir vector, x, n, a,num,ret Como Entero
	dimension vector[100000]
	Escribir "Ingrese el la dimension del vector "
	leer n
	
	para a=0 hasta n-1  con paso 1 Hacer
		Escribir "ingrese numero"
		leer num
		vector[a]=num
	FinPara
	
	ret = operacion(vector,n)
FinAlgoritmo

Funcion numeromasgrande<-operacion(vector Por referencia,n Por Referencia)
	definir numeromasgrande Como Entero
	definir i,mayor,menor,num Como Entero
	
	mayor <- vector(1)
	menor <- vector(1)
	para i=0 Hasta n-1 Hacer
		num <- vector(i)
		si num > mayor entonces
			mayor = num
		FinSi
		si num < menor Entonces
			menor = num
		FinSi
	FinPara
	Escribir "elnumeromas grande del vector es ",mayor
FinFuncion

