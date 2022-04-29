Proceso leer_lista_tamaño_10_imprimir_al_reves
	Definir lista Como Entero;
	Dimension lista[10];
	Definir i Como Entero;
	i <- 0;
	Para i<-0 Hasta 9 Hacer
		Escribir 'valor ',i+1,':';
		Leer lista[i];
	FinPara
	Para i<-9 Hasta 0 Con Paso -1 Hacer
		Escribir 'lista[',i+1,']:',lista[i];
	FinPara
FinProceso
