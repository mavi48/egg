Algoritmo EstadisticaVentas
	
    Dimension ventas[5,5], totalDia[5], totalProducto[5], productoMasVendido[5]
    Dimension productos[5]
	
    productos[1] <- "Producto A"
    productos[2] <- "Producto B"
    productos[3] <- "Producto C"
    productos[4] <- "Producto D"
    productos[5] <- "Producto E"
	
    Para i <- 1 Hasta 5 Hacer
        totalDia[i] <- 0
        totalProducto[i] <- 0
        productoMasVendido[i] <- 1
        Para j <- 1 Hasta 5 Hacer
            ventas[i, j] <- Aleatorio(0, 100)
            totalDia[j] <- totalDia[j] + ventas[i,j]
            totalProducto[i] <- totalProducto[i] + ventas[i,j]
            Si ventas[i,j] > ventas[i,productoMasVendido[i]] Entonces
                productoMasVendido[i] <- j
            FinSi
        FinPara
    FinPara
	
    Escribir("Total de ventas por d�a de la semana:")
    Para i <- 1 Hasta 5 Hacer
        Escribir "D�a ", i, ": ", totalDia[i], " unidades" 
    FinPara
	
    Escribir("--------------------------------------------")
    Escribir("Total de ventas de cada producto a lo largo de la semana:")
    Para i <- 1 Hasta 5 Hacer
        Escribir "Producto ", productos[i], ": ", totalProducto[i], " unidades"
    FinPara
	
    Escribir("--------------------------------------------")
    Escribir("El producto m�s vendido en cada semana:")
    Para i <- 1 Hasta 5 Hacer
        Escribir "Semana ", i, ": ", productos[productoMasVendido[i]]
    FinPara
	
    Escribir("--------------------------------------------")
    Escribir("El nombre, el d�a de la semana y la cantidad del producto m�s vendido:")
    Para i <- 1 Hasta 5 Hacer
        Escribir "Semana ", i, ": ", productos[productoMasVendido[i]], ", D�a ", productoMasVendido[i], ", Cantidad: ", ventas[productoMasVendido[i],i]
    FinPara
	
FinAlgoritmo