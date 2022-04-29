Proceso Leer_lista_e_imprimirlar_alreves
	Definir n Como Entero;
	Escribir 'cuantos elementos tiene su lista: ';
	Leer n;
	Definir lista Como Entero;
	Dimension lista[n];
	Definir i Como Entero;
	i <- 0;
	// definir opc como entero,
	Para i<-0 Hasta n-1 Hacer
		Escribir ' valor: ',i+1,':';
		Leer lista[i];
	FinPara
	Escribir 'la lista de atras hacia adelante es:';
	Para i<-n-1 Hasta 0 Con Paso -1 Hacer
		Escribir 'lista[',i+1,']:',lista[i];
	FinPara
FinProceso
