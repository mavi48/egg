Algoritmo menuVector
	Definir a,b,c,d,e,f Como entero
	
	a=0
	b=0
	c=0
	d=0
	e=0
	f=0

	menuVectores(a,b,c,d,e,f)
FinAlgoritmo

SubProceso menuVectores(a,b,c,d,e,f Por Referencia)	
	Definir vectora, vectorb, vectorc, vectord, vectore, n Como Entero
	definir opci,num Como entero
	opci<-0
	Dimension vectora(-100,100)
		
	Mientras opci <> 6 Hacer
		
		Escribir "1. Llenar vector A"
		Escribir "2. Llenar vector B"
		Escribir "3. Llenar vecto C con la suma de A y B"
		Escribir "4. Llenar vecto C con la resta de B y A"
		Escribir "5. ¿Que vector quiere ver?"
		Escribir "6. Salir"
		Escribir " "
		Escribir "Seleccione una opción: "
		leer opci
		para opci<-0 Hasta 4 Hacer
			Escribir "Ingrese el tamaño del vector A:"
			leer n
		
		FinPara
		
		
	FinMientras

	
FinSubProceso
