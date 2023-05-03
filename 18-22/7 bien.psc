Algoritmo sin_titulo
	definir vector1, vector2, i, ret Como Entero
	dimension vector1[10], vector2[10]
	
	para i<-0 hasta 9 Hacer
		vector1[i]=Aleatorio(-100,100)
		escribir Sin Saltar vector1[i]
	FinPara
	Escribir ""
	para i<-0 hasta 9 Hacer
		vector2[i]=Aleatorio(-100,100)
		escribir Sin Saltar vector2[i]
	FinPara
	escribir ""
	ret=comparacion(vector1,vector2)
FinAlgoritmo

Funcion verificacion<- comparacion(vector1 Por Referencia, vector2 Por Referencia)
	definir i Como Entero
	definir k Como Logico
	K=Verdadero
	para i<- 0 hasta 9 Hacer
		si vector1[i] <> vector2[i] Entonces
			k=falso
		FinSi
	FinPara
	si k= falso Entonces
		escribir "los vectores no son iguales"
	SiNo
		escribir "los vectores son iguales"
	FinSi
	
	
FinFuncion