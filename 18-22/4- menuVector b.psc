Algoritmo menuVector
	Definir a,b,c,d,e,f,opci,n,vector,i,opciMostrar Como entero
	opci<-0
	i=0
	dimension a(n)
	dimension b(n)
	dimension c(n)
	escribir "longitud de los vectores"
	leer n
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
		si opci = 1 entonces 
			para i=0 hasta n-1 hacer
			a(i)= aleatorio (-100,100)
		finpara
		escribir " el vector A ha sido llenado aleatoriamente"
	sino 
		si opci= 2 Entonces
			para i=0 hasta n-1 hacer
				b(i)= aleatorio (-100,100)
			finpara
			escribir "el vector B ha sido llenado aleatoriamente"
		sino 
			si opci=3 Entonces
				para i=0 hasta n-1 Hacer
					c(i) = a(i) + b(i)
				FinPara
				escribir "el vector c ha sido llenado con la suma de A+B"
			SiNo
				si opci=4 Entonces
					para i=0 hasta n-1 Hacer
						c(i)= b(i)- a(i)
					FinPara
						escribir" el vector C ha sido llenado con la resta de B-A"
					sino
						SI opci=5 Entonces
							escribir"que vector desea ver, A,B o C "
							leer opciMostrar
							si opciMostrar= 1 entonces
								escribir "VECTOR A"
								para i =0 hasta n-1 Hacer
									escribir a(i)
								FinPara
							sino 
								si opciMostrar=2 Entonces
									escribir "VECTOR B"
									para i =0 hasta n-1 Hacer
										escribir b(i)
									FinPara
								SiNo
									si opciMostrar=3 Entonces
										escribir "VECTOR C"
										para i=0 hasta n-1 Hacer
											escribir c(i)
										FinPara
									SiNo
										escribir " opcion invalida"
									
									FinSi
								FinSi
							FinSi
							
						FinSi
				FinSi
				
				
				
			FinSi
		FinSi
			
	finsi
	
		FinMientras
FinAlgoritmo
	

