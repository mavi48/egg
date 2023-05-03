algoritmo hola
	definir suma,result,n como entero
	leer n
	escribir  sumatoria(n)
	
FinAlgoritmo


funcion suma<- sumatoria(n)
	definir suma Como Entero
	si n=1 Entonces
		suma=1
	SiNo
		suma= n+sumatoria(n-1)
		
	FinSi
FinFuncion
