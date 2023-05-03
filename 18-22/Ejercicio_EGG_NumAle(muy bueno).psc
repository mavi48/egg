//Muestra un arreglo pasado por parametro
Funcion mostrarArreglo (arreglo, tamanioArreglo)
    Definir i Como Entero
    Para i<-0 Hasta tamanioArreglo-1 Con Paso 1 Hacer
        escribir arreglo(i)
    Fin Para
    
Fin Funcion

Algoritmo Ejercicio_EGG_NumAle 
	Definir arregloEjemplo Como Entero
    //Creo un arreglo
    dimension arregloEjemplo(5)
    
    //Relleno el arreglo aleatoriamente
    Definir i Como Entero
    Para i<-0 Hasta 5-1 Con Paso 1 Hacer
        //Genera un aleatorio
        arregloEjemplo[i] <- Aleatorio(10, 1)
    Fin Para
    
    //muestro el arreglo
    mostrarArreglo(arregloEjemplo, 5)
    
    
FinAlgoritmo
