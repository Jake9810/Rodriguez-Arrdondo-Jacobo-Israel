SUBPROCESO Mezclar (lista_entrada, l, m, r)// función Mezlcar 
	
    IMPRIMIR "MEZCLAR (" l " " m " " r ")"; //L= inicio de la lista izquierda, valor del index medio de la lista, longitud de la lista -1 
    
    DEFINIR Nl COMO ENTERO;
    DEFINIR Nr COMO ENTERO;
    
    Nl <- m - l;  // index de inicio en la lista izquierda 
    Nr <- r - m + 1; // index de inicio en la lista derecha, en caso de que la lista tenga un numero impar de elementos le agrega un valor de la lista izq para hacer su longitud un numero entero  y poder dividir la lista en dos partes 
    
    IMPRIMIR "N1: " Nl " ,Nr: " Nr;
    
    DEFINIR Ml COMO ENTERO;
    DEFINIR Mr COMO ENTERO;
    
    Ml <- Nl; // variables para iterar sobre la lista sin tener que modificar los valores verdadres
    Mr <- Nr; //
    
    SI Ml <= 0 ENTONCES
        Ml <- 1;
    FIN SI
    
    SI Mr <= 0 ENTONCES
        Mr <- 1;
    FIN SI
    
    DEFINIR lista_izquierda COMO ENTERO; // creacion de las listas con los tamaños calculador en la lineas 8 y 9
    DIMENSION lista_izquierda[Ml];
    
    DEFINIR lista_derecha COMO ENTERO;
    DIMENSION lista_derecha[Mr];
    
    DEFINIR i COMO ENTERO;
    DEFINIR j COMO ENTERO;
    
    PARA i <- 0 HASTA Nl - 1 CON PASO 1 HACER // asignacion de valores de la lista de entrada, los valores almacenados en esta lista van del index[0] al index[n]
        lista_izquierda[i] <- lista_entrada[l + i];
    FIN PARA
    
    PARA j <- 0 HASTA Nr - 1 CON PASO 1 HACER// asignacion de valores de la lista de entrada, los valores almacenados en esta lista van del index[n/2+1] al index[n-1]
        lista_derecha[j] <- lista_entrada[m + j];
    FIN PARA
    
    DEFINIR k COMO ENTERO;
    
    i <- 0;
    j <- 0;
    k <- l;
    
    MIENTRAS i < Nl Y j < Nr Y k <= r HACER //me todo burbuja  comparando los valores entre ambas lista para se parar los valores menores y superiores 
        SI lista_izquierda[i] <= lista_derecha[j] ENTONCES
            lista_entrada[k] = lista_izquierda[i];
            i <- i + 1;
        SINO
            lista_entrada[k] = lista_derecha[j]; // asignacion de los valores menores a la lista de entrada
            j <- j + 1;
        FIN SI
        k <- k + 1;
    FIN MIENTRAS
    
    MIENTRAS i < Nl Y k <= r HACER
        lista_entrada[k] = lista_izquierda[i];// asignacion de los valores majores a la lista de entrada
        i <- i + 1;
        k <- k + 1;
    FIN MIENTRAS
    
    MIENTRAS j < Nr Y k <= r HACER
        lista_entrada[k] = lista_derecha[j]; //concatenacion de las listas creadas con los valores ordenados
        j <- j + 1;
        k <- k + 1;
    FIN MIENTRAS
    
FIN SUBPROCESO

SUBPROCESO Ordenar ( lista_entrada, l, r )// r=N-1; r indca el indice de la mitad de la lista, l es el valor inicial de la lista izquierda 
    
    SI l < r ENTONCES
        
        DEFINIR m COMO ENTERO;
        
        m <- Redon( (l + r + 1) / 2 ); // m es el valor que se ecuentra en medio entre el index de inicio y el index de final ayuda a dividar la lista y organizar los valores de meno a mayor por cada iteración de la lista 
									// de entrada 
        
        Imprimir "L: " l " M: " m " R: " r; 
        definir jj Como Entero;
		jj<-0;
		imprimir "antes del primer ordernar (l a m-1)";
		mientras jj<=m Hacer
			imprimir "list[" jj "]: " lista_entrada[jj];
			jj<-jj+1;
		FinMientras
        Ordenar(lista_entrada, l, m - 1);// recursividad de la lista para ordern los valores de la lista[0] a lista[n/2-1]
        imprimir "lista de entrada antes del segundo ordernar, (m a r)";
		jj<-0;
		mientras jj<=r Hacer
			imprimir "list[" jj "]: " lista_entrada[jj];
			jj<-jj+1;
		FinMientras
        Ordenar(lista_entrada, m, r);// recursividad de la lista para ordern los valores de la lista[n] a lista[n-1]
        imprimir "lista entrada antes de mezclar\n";
		jj<-0;
		mientras jj<=r Hacer
			imprimir "list[" jj "]: " lista_entrada[jj];
			jj<-jj+1;
		FinMientras
        Mezclar(lista_entrada, l, m, r);
        imprimir "lista entrada despues de mezclar\n";
		jj<-0;
		mientras jj<=r Hacer
			imprimir "list[" jj "]: " lista_entrada[jj];
			jj<-jj+1;
		FinMientras
    FIN SI
    
FIN SUBPROCESO
Proceso practica_1
	DEFINIR N COMO ENTERO;
	
	IMPRIMIR "Dame el tamaño de la lista a ordenar:";
	LEER N;
	
	DEFINIR lista COMO ENTERO;
	DIMENSION lista[N];
	
	DEFINIR i COMO ENTERO;
	
	PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
		IMPRIMIR "Dame el valor de la lista en la posición " i ":";
		LEER lista[i];
	FIN PARA
	
	imprimir "N-1: " N-1;
	
	Ordenar(lista, 0, N - 1);
	imprimir("lista ordenada");
	PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
		IMPRIMIR lista[i];
	FIN PARA
FinProceso
