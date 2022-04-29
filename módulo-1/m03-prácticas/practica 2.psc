SUBPROCESO Intercambiar (lista_entrada, i, j) //función para cambiar la posicion de los valores en una 
    //lista, las variables j e i tienen la función de ser los index
    // de los valores que se quieren cambiar en la lista de entrada
	
    DEFINIR temporal COMO ENTERO; // "temporal" es una variable que se utiliza para guardar el valore de las lista 
    //de entrada en la posicion "i" para que este no se pierda al momneto de sustituir el valor de la lista de entrada
    // con index i, posteriormete el valor de esta variable se le asigna al espacio de memoria de la lista de entrada
    //en la posición "j"
	
    temporal <- lista_entrada[i]; // se guarda el valor que se encuentra en la posicion i en temporal
    lista_entrada[i] <- lista_entrada[j];// se le asigna el valor que se encuentra en "j"
    lista_entrada[j] <- temporal;// se cambia el valor que esta en la posición "j" por el valor de temporal
	
FIN SUBPROCESO

SUBPROCESO indice_menor <- Particion (lista_entrada, l, r) // funcion que retorana un número entero el cual es el valor
    // la variable "r" es el ultimo elemento de la lista y "L"  una variable de control la cual actua como primer elemento de la lista
    // para ayudarnos a iterar sobre la lista 
    DEFINIR pivote COMO ENTERO;
	
    pivote <- lista_entrada[r];//pivote es el dato que se en cuentra en la ultima localidad de memoria de la lista
	
    IMPRIMIR "Particion (L: " l " pivote: " pivote " r: " r ")";
	
    DEFINIR k COMO ENTERO;
	
    DEFINIR indice_menor COMO ENTERO;//primera posicion de la lista
	
    indice_menor <- l - 1;
    imprimir "indice_menor: " indice_menor;
    PARA k <- l HASTA r - 1 CON PASO 1 HACER//  ciclo for para poner todos los números menores al ultimo elementos de la lista  
        SI lista_entrada[k] < pivote ENTONCES//antes de el
            indice_menor <- indice_menor + 1;
            Intercambiar(lista_entrada, indice_menor, k);
        FIN SI
    FIN PARA
	
    indice_menor <- indice_menor + 1;
	
    Intercambiar(lista_entrada, indice_menor, r);
	
FIN SUBPROCESO

SUBPROCESO Ordenar (lista_entrada, l, r)//funcion recurisiva que parte la lista en dos secciones para poder Ordenar
    //ambas partes de la lista sin la necesidad de crear dos listas temporales 
    //r es la longotid de la lista, l es la posicion en la que se quiere inicar el conteo de elementos en la lista
    definir opc Como Entero;
    opc<-0;
	/////////////////
	Imprimir  "lista antes de la partición [0]";
	Mientras opc<=r Hacer
		imprimir"lst[" opc "]:" lista_entrada[opc];
		opc<-opc+1;
	FinMientras
	opc<-0;
	////////////////////////
    SI l < r ENTONCES
		
        IMPRIMIR "ORDENAR (L:" l " r:" r ")"; 
		
        DEFINIR indice_particion COMO ENTERO;
        indice_particion <- Particion(lista_entrada, l, r);
        IMPRIMIR "L: " l " indice de partición: " indice_particion " r:" r; 

		/////////////////
		Imprimir  "lista antes de ordner de l a indice_particion-1 [1]";
		opc<-l;
		Mientras opc<=indice_particion-1 Hacer
			imprimir"lst[" opc "]:" lista_entrada[opc];
			opc<-opc+1;
		FinMientras
		opc<-0;
		////////////////////////
        Ordenar(lista_entrada, l, indice_particion - 1);
		Imprimir  "lista antes de ordner de l a indice_particion+1 [2]";
		opc<-indice_particion+1;
		Mientras opc<=r Hacer
			imprimir"lst[" opc "]:" lista_entrada[opc];
			opc<-opc+1;
		FinMientras
		opc<-0;
		////////////////////////
        Ordenar(lista_entrada, indice_particion + 1, r);
        ////////////////////////
		Imprimir  "lista despúes de ordner de l a indice_particion+1 [3]";
		opc<-indice_particion+1;
		Mientras opc<=r Hacer
			imprimir"lst[" opc "]:" lista_entrada[opc];
			opc<-opc+1;
		FinMientras
		opc<-0;
		////////////////////////
    FIN SI
	
FIN SUBPROCESO

Proceso ordenamiento_rapido
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
	
    Ordenar(lista, 0, N - 1);
	
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
        IMPRIMIR lista[i];
    FIN PARA
FinProceso