Algoritmo sin_titulo
	definir vector,frase,car Como Caracter
	definir i,l,pos Como Entero
	dimension vector[20]
	escribir "ingrese una frase"
	leer frase
	l=Longitud(frase)
	
	para i<-0 hasta 19 Hacer
		
		si i<l Entonces
			vector[i]=Subcadena(frase,i,i)
		SiNo
			vector[i]=" "
		FinSi
		
	FinPara
	//estas lineas es para comprobar que el mensaje ingresado fue guardado
	//	para i<-0 hasta 19 Hacer
	//		Escribir Sin Saltar vector[i]
	//	FinPara
	//	escribir""
	escribir "ingrese un caracter"
	leer car
	escribir "ingrese una posicion del vector"
	leer pos
	si vector[pos]=" " Entonces
		vector[pos]=car
		para i<-0 hasta 19 Hacer
			Escribir Sin Saltar vector[i]
		FinPara
		escribir ""
	SiNo
		escribir "la posicion esta ocupada por ",vector[pos]
	FinSi
	
FinAlgoritmo

