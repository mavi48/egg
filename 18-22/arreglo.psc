Algoritmo arreglo
	definir n,a,x,vector,val,vector1,vector2 como entero
	
	dimension vector(100000000)
	arreglo1(vector,n)
	
	
FinAlgoritmo

SubProceso arreglo1(vector por referencia,n por referencia)
	definir a, x ,b,c como entero
	
	escribir "ingresa tamnaño del vector"
	leer n
	para b=0 hasta n Hacer
		x= Aleatorio(0,100)
		vector(b) = x
	FinPara
	para a=0 hasta n Hacer
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
