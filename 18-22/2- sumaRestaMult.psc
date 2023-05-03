
	Algoritmo sumaRestaMult
		//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
		//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al
		//arreglo.
		
		
		definir vReales, suma, resta, mult  como reales
		definir i como entero
		dimension vReales(10)
		
		escribir "Ingrese 10 numeros reales"
		
		
		para i =0 hasta 9 Hacer
			leer vReales(i)
		FinPara
		
		suma = 0
		para i = 0 hasta 9 hacer 
			suma = vReales(i) + suma
		FinPara
		
		
		resta = 0
		Para i<-9 Hasta 0 Con Paso -1 Hacer
			resta = vReales(i) - resta
		Fin Para
		
		
		mult = 1
		para i = 0 hasta 9 hacer 
			mult = vReales(i) * mult
		FinPara
		escribir "Suma = " suma
		escribir "Resta = " resta
		escribir "Multiplicacion = " mult
		
		
		
FinAlgoritmo

