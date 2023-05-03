
Algoritmo Integrador
	
	Definir m Como Entero
	Definir GenZ como cadena
	Hacer 
		Escribir "Ingresa el tamaño de la matriz: "
		Leer m
	Hasta Que m=3 o m=4 o m=37
	Dimension Genz(m,m)
	valoresGenZ(GenZ,m)
	Imprimir_valores(GenZ, m)
FinAlgoritmo
SubProceso valoresGenZ(GenZ,m)
	Definir muestra, letra como Cadena
	Definir valor_letra como logico
	Definir i,j, cont como entero
	Hacer
		Hacer
			
			Escribir"Ingrese la muestra que sea de " m*m " caracteres y solo use las letras (A, B, C, D)"
			Leer muestra
			valor_letra=verdadero
			Para i<-0 hasta Longitud(muestra)-1 hacer
				Letra=Mayusculas(subcadena(muestra,i,i))
				Si Letra="A" y Letra="B" y Letra="C" y Letra="D" Entonces
					valor_letra=Falso
				FinSi
			FinPara
		Mientras Que valor_letra=Falso
	Hasta Que longitud(muestra)<>m*m
	cont=0
	Para i<-0 Hasta m-1 hacer 
		Para j<-1 hasta m-1 hacer
			GenZ(i,j)=Mayusculas(subcadena(muestra, cont, cont))
			cont=cont+1
		FinPara		
	FinPara
	
FinSubProceso

Subproceso Imprimir_valores(GenZ, m)
	Definir i, j Como Entero
	Para i<-0 hasta m-1 Hacer
		Para j<-0 hasta m-1 Hacer
			Escribir sin saltar GenZ(i,j) ""
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso
	