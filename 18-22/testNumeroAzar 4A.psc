
	Proceso testNumeroAzar
		
		definir numeroAzar, minimo, maximo como numero;
		numeroAzar <- 0;
		
		minimo <- -100;
		maximo <- 100;
		
		numeroAzar <- numeroAleatorioEntre(minimo, maximo) * (-1 );
		
		Escribir "El numero aleatorio generado es ", numeroAzar ;
		
FinProceso
//Genera un numero aleatorio entre el minimo y máximo incluidos
SubProceso numeroAzar <- numeroAleatorioEntre(minimo, maximo)
    definir numeroAzar como numero;
    numeroAzar <- 0;
	Repetir
		
        numeroAzar <- AZAR(maximo+1);
		
    Hasta Que numeroAzar >= minimo Y numeroAzar<=maximo
	FinSubProceso



