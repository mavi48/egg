Algoritmo cooperativo
	menu()
FinAlgoritmo

SubProceso menu()
	Definir valMenu Como Entero
	Escribir "Ingresar una opcion del menú"
	
	Escribir "1 - Calcular muro de ladrillo"
	Escribir "2 - Calcular viga de hormigón"
	Escribir "3 - Calcular columnas de hormigón"
	Escribir "4 - Calcular contrapisos"
	Escribir "5 - Calcular techo"
	Escribir "6 - Calcular pisos"
	Escribir "7 - Calcular pintura"
	Escribir "8 - Calcular iluminación"
	Escribir "9 - Salir"
	Leer  valMenu
	Segun valMenu Hacer
		1:
			Limpiar Pantalla
			calcularMuro()
			
		2:
			Limpiar Pantalla
			calcularViga()		
		3:
			Limpiar Pantalla
			calcularColumna()	
		4:
			Limpiar Pantalla
			calcularContrapisos()
		5:
			Limpiar Pantalla
			calcularTecho()		
		6:
			Limpiar Pantalla
			calcularPisos()			
		7:
			Limpiar Pantalla
			calcularPintura()		
		8:
			Limpiar Pantalla
			calcularIluminacion()		
		9:salir()		
	Fin Segun
	
FinSubProceso

Funcion  respuesta<-calcularSuperficie(base,altura)
	Definir respuesta como Real
	respuesta = base*altura
FinFuncion

Funcion  respuestaVol<-calcularVolumen(espesor,base,altura)
	Definir respuestaVol como Real
	respuestaVol = base*altura*espesor
FinFuncion

SubProceso calcularMuro()
	
	Definir espesor,valSuper Como Entero
	Definir largo,alto,cemento,arena,ladrillo Como Real
	Escribir "        Calcular muro de ladrillo"
	Escribir "Seleccion el espesor"
	Escribir "1 - 20 cm"
	Escribir "2 - 30 cm"
	Hacer
		Leer espesor
		
	Mientras Que espesor>=2 y espesor<=3
	
	Escribir "Ingrese el Largo"
	leer largo
	Escribir "Ingrese el Alto"
	leer alto
	
	valSuper=calcularSuperficie(largo,alto)
	//Escribir valSuper
	
	Segun espesor Hacer
		1:
			cemento = valSuper * 10.9
			arena = valSuper * 0.09
			ladrillo = valSuper * 90
		2:
			cemento = valSuper * 15.2
			arena = valSuper * 0.115
			ladrillo = valSuper * 120
			
	FinSegun
	
	Escribir "La superfice del muro es: " valSuper
	Escribir "cantidad de cemento: " cemento
	Escribir "cantidad de arena: " arena
	Escribir "cantidad de ladrillo: " ladrillo
FinSubProceso

SubProceso calcularViga()
	Definir largo, cemento,arena,piedra,hierro8,hierro4 Como Real
	Escribir "        Calcular viga de hormigón"
	Escribir "Ingrese largo de viga"
	leer largo
	cemento = largo * 9
	arena = largo * 0.02
	piedra = largo * 0.02
	hierro8 = largo * 4
	hierro4 = largo * 3
	
	Escribir "cantidad de cemento: " cemento "kg"
	Escribir "cantidad de arena: " arena "m3"
	Escribir "cantidad de piedra: " piedra "m2"
	Escribir "cantidad de hierro 8: " hierro8 "m"
	Escribir "cantidad de hierro 4: " hierro4 "m"
	
FinSubProceso

SubProceso calcularColumna()
	Definir largo, cemento,arena,piedra,hierro10,hierro3 Como Real
	Escribir "Ingrese largo de Columna"
	leer largo
	cemento = largo * 7.5
	arena = largo * 0.016
	piedra = largo * 0.016
	hierro10 = largo * 6
	hierro3 = largo * 3
	
	Escribir "cantidad de cemento: " cemento "kg"
	Escribir "cantidad de arena: " arena "m3"
	Escribir "cantidad de piedra: " piedra "m2"
	Escribir "cantidad de hierro 10: " hierro10 "m"
	Escribir "cantidad de hierro 3: " hierro3 "m"
FinSubProceso

SubProceso calcularContrapisos()
	Definir valVol,espesor,largo,alto,cemento,arena,piedra Como Real
	Escribir "        Calcular Contrapisos"
	Escribir "Ingrese el espesor"
	Leer espesor
	Escribir "Ingrese el Largo"
	leer largo
	Escribir "Ingrese el Alto"
	leer alto
	valVol =calcularVolumen(espesor,largo,alto)
	cemento = valVol *105
	arena = valVol * 0.45
	piedra = valVol * 0.9
	
	Escribir "cantidad de cemento: " cemento "kg"
	Escribir "cantidad de arena: " arena "m3"
	Escribir "cantidad de piedra: " piedra "m2"
	
	
FinSubProceso

SubProceso calcularTecho()	
	Definir valSuper,espesor,largo,alto,cemento,arena,piedra,hierro8,hierro6 Como Real
	Escribir "        Calcular Techo"
	Escribir "Ingrese el espesor"
	Leer espesor
	Escribir "Ingrese el Largo"
	leer largo
	Escribir "Ingrese el Alto"
	leer alto
	valSuper =calcularSuperficie(largo,alto)
	
	cemento = valSuper * 33
	arena = valSuper * 0.072
	piedra = valSuper * 0.072
	hierro8 = valSuper * 7
	hierro6 = valSuper * 4
	
	Escribir "cantidad de cemento: " cemento "kg"
	Escribir "cantidad de arena: " arena "m3"
	Escribir "cantidad de piedra: " piedra "m2"
	Escribir "cantidad de hierro 8: " hierro10 "m"
	Escribir "cantidad de hierro 6: " hierro3 "m"
FinSubProceso

SubProceso calcularPisos()
FinSubProceso

SubProceso calcularPintura()
FinSubProceso

SubProceso calcularIluminacion()	
FinSubProceso 

SubProceso salir()	
	Escribir "CHAU"
	
	
FinSubProceso