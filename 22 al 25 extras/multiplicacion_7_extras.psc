Algoritmo sin_titulo
	DEFINIR v1,num,n, min, max Como Entero
	
	escribir "Ingrese el tamaño del vector "
	leer n
	Dimension v1(n)
	
	
	max=1
	
	para i=1 Hasta n Hacer
		escribir "ingrese numeros"
		leer v1(i) 
		
		max = v1(i) * max
		
	FinPara
	
	 escribir max
	
FinAlgoritmo


